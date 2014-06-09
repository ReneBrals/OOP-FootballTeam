package Team;

import java.io.*;
import java.util.*;

public class Team {
	
      private String Coach;
      private String Captain;
      private String GoalKeeper;
	
	  ArrayList<Player> team = new ArrayList<Player>();
	  ArrayList<Match> matches = new ArrayList<Match>();
	  
	  public Team(String coach, String captain, String goalkeeper){
		  this.Coach = coach;
		  this.Captain = captain;
		  this.GoalKeeper = goalkeeper;
	  }
          
          public Team(Team team){
              this.Coach = team.getCoach();
              this.Captain = team.getCaptain();
              this.GoalKeeper = team.GoalKeeper();
              
              this.team = new ArrayList<Player>(team.team);
              this.matches = new ArrayList<Match>(team.matches);
          }
	  
	  public void addMatch(Match m){
          matches.add(m);
      }
   
	  public void removeMatch(int index){
          matches.remove(index);
      }
	  
	  public void addPlayer(Player p){
          team.add(p);
      }
   
	  public void removePlayer(int index){
          team.remove(index);
      }
	  
	    public String getCoach() {
	        return Coach;
	    }
	  
	    public void setCoach(String coach) {
	        Coach = coach;
	    }
	    
	    public String getCaptain() {
	        return Captain;
	    }
	  
	    public void setCaptain(String captain) {
	        Captain = captain;
	    }
	    
	    public String GoalKeeper() {
	        return GoalKeeper;
	    }
	  
	    public void setGoalkeeper(String goalkeeper) {
	        GoalKeeper = goalkeeper;
	    }


	    public void save(){
                String ls = System.getProperty("line.seperator");

                FileWriter fw;
                try{
                    fw = new FileWriter(new File ("FCknudde.txt"));
                } catch (IOException e) {
                    System.out.println("Saving failed: IOException");
                    e.printStackTrace();
                    return;
                }

                PrintWriter w = new PrintWriter(new BufferedWriter(fw));
                w.printf("%d %d%s", team.size(), matches.size(),ls);
                w.printf("%s%s %s%s %s%s", Coach, ls, Captain, ls, GoalKeeper);

                for(Player player:team){
                        w.printf("%s%s %s%s %s%s %s%s %s%s %s%s %d%s %d%s",
                        player.getName(),
                        ls,
                        player.getFirstName(),
                        ls,
                        player.getAddress(),
                        ls,
                        player.getTelNumber(),
                        ls,
                        player.getBackNumber(),
                        ls,
                        player.getPosition(),
                        ls,
                        player.getInjury(),
                        ls,
                        player.getCards(),
                        ls
                        );
            }

            for(Match match:matches){
                w.printf("%d %d %s%s", match.getHome(), match.getAway(), match.getOpponent());
                for(int o=0; o<(match.getPlayedPlayerSize()); o++)
                	w.printf("%s%s", match.getPlayedPlayer(o).getName(),ls);
                
                for(int o=0; o<(match.getPlayedPlayerSize()); o++)
                	w.printf("%s%s", match.getScoredPlayer(o),ls);
                
                for(int o=0; o<(match.getScoredPlayerSize()); o++)
                	w.printf("%s%s", match.getSubstitutedPlayer(o),ls);
                
                for(int o=0; o<(match.getPlayedPlayerSize()); o++)
                	w.printf("%s%s", match.getYellowCardPlayer(o),ls);
                
                for(int o=0; o<(match.getPlayedPlayerSize()); o++)
                	w.printf("%s%s", match.getRedCardPlayer(o),ls);
            }
                w.close();
            }
	    
	    
	    public void load(File fileName){
            FileReader fr;
            int numPlayers;
            int numMatches;
            try{
                fr = new FileReader(fileName);
            } catch(FileNotFoundException e){
                System.out.println("Loading failed: File not found");
                e.printStackTrace();
                return;
            }
                Scanner s = new Scanner(fr);
                numPlayers = s.nextInt();
                numMatches = s.nextInt();
                s.nextLine();
                this.setCoach(s.nextLine());
                this.setGoalkeeper(s.nextLine());
                this.setCaptain(s.nextLine());

                for(int i = 0; i<numPlayers; i++){
                    this.addPlayer(new Player(
                            s.nextLine(), /*reads the name*/
                            s.nextLine(), /*reads the firstname*/
                            s.nextLine(), /*reads the address*/
                            s.nextLine(), /*reads the telephone number*/
                            s.nextLine(), /*reads the backnumber*/
                            s.nextLine(), /*reads the position*/
                            s.nextInt(), /*injuries*/
                            s.nextInt() /*cards*/
                        )
                    );
                    s.nextLine();
                }
                String readPlayer;
                for(int i = 0; i<numMatches;i++){
                	/*initialised array for played players, scored players, substituted players, yellow carded players
                	 * and red carded players in every match*/
                	
                	ArrayList<Player> p = new ArrayList<Player>();
                	ArrayList<String> sc = new ArrayList<String>();
                	ArrayList<String> sub = new ArrayList<String>();
                	ArrayList<String> y = new ArrayList<String>();
                	ArrayList<String> r = new ArrayList<String>();
                	
                	
                	int np = s.nextInt();
                	int nsc = s.nextInt();
                	int nsub = s.nextInt();
                	int ny = s.nextInt();
                	int nr = s.nextInt();
                        
                        s.nextLine(); //FLUSH THE FUCKING NEWLINE BEFORE READING A STRING
                        
                	 
                	for(int e = 0; e<np; e++){
                            readPlayer = s.nextLine();
                            for(int u = 0; u<numPlayers; u++){
                		if(this.team.get(u).getName().equals(readPlayer)){
                                    p.add(this.team.get(u));
                		}
                            }
                	}
                	
                	for(int e=0; e<nsc; e++){
                		sc.add(s.nextLine());
                	}
                	for(int e=0; e<nsub; e++){
                		sub.add(s.nextLine());
                	}
                	for(int e=0; e<ny; e++){
                		y.add(s.nextLine());
                	}
                	for(int e=0; e<nr; e++){
                		r.add(s.nextLine());
                	}
                	
                        System.out.println("huh");
                    	this.addMatch(new Match(s.nextInt(),s.nextInt(), s.nextLine(),p,sc,sub,y,r));
                }
            }
	  
}