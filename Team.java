package Team;

import java.io.*;
import java.util.*;

public class Team {
	
      private String Coach;
      private String Captain;
      private String GoalKeeper;
	
	  ArrayList<Player> players = new ArrayList<Player>();
	  ArrayList<Match> matches = new ArrayList<Match>();
	  
	  public Team(String coach, String captain, String goalkeeper){
		  this.Coach = coach;
		  this.Captain = captain;
		  this.GoalKeeper = goalkeeper;
	  }
	  
	  public void addMatch(Match m){
          matches.add(m);
      }
   
	  public void removeMatch(int index){
            matches.remove(index);
            }
	  
	  public void addPlayer(Player p){
          players.add(p);
      }
   
	  public void removePlayer(int index){
          players.remove(index);
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
                w.printf("%d %d%s", players.size(), matches.size(),ls);
                w.printf("%s%s %s%s %s%s", Coach, ls, Captain, ls, GoalKeeper);

                for(Player player:players){
                        w.printf("%s%s %s%s %s%s %s%s %d%s %s%s %d%s %d%s",
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

                for(int i = 0; i<numMatches;i++){
                    this.addMatch(new Match(s.nextInt(),s.nextInt(), s.nextLine()));
                }
            }
	  
}
