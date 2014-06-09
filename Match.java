package Team;

import java.util.ArrayList;

public class Match {
	
      private int Home;
      private int Away;
      private String Opponent;
      private ArrayList<Player> playedPlayers = new ArrayList<Player>();
      private ArrayList<String> scoredPlayers = new ArrayList<String>();
      private ArrayList<String> substitutedPlayers = new ArrayList<String>();
      private ArrayList<String> yellowCardPlayers = new ArrayList<String>();
      private ArrayList<String> redCardPlayers = new ArrayList<String>();
	  
	    public Match(int home, int away, String opponent, ArrayList<Player> playedplayers, ArrayList<String> scoredplayers,
	    		ArrayList<String> substitutedplayers,ArrayList<String> yellowcardplayers, ArrayList<String> redcardplayers) {
		this.Home = home;
		this.Away = away;
		this.Opponent = opponent;
		this.playedPlayers = playedplayers;
		this.scoredPlayers = scoredplayers;
		this.substitutedPlayers = substitutedplayers;
		this.yellowCardPlayers = yellowcardplayers;
		this.redCardPlayers = redcardplayers;
	}
	    

	    public void addPlayedPlayer(Player p){
	    	playedPlayers.add(p);
	    }
	    
	    public void removePlayedPlayer(int index){
	    	playedPlayers.remove(index);
	    }
	    
	    public Person getPlayedPlayer(int index){
	    	return playedPlayers.get(index);
	    }
	    
	    public int getPlayedPlayerSize(){
	    	return playedPlayers.size();
	    }
	    
	    public void addScoredPlayer(String player){
	    	scoredPlayers.add(player);
	    }
	    
	    public void removeScoredPlayer(int index){
	    	scoredPlayers.remove(index);
	    }
	    
	    public String getScoredPlayer(int index){
	    	return scoredPlayers.get(index);
	    }
	    
	    public int getScoredPlayerSize(){
	    	return scoredPlayers.size();
	    }
	    
	    public void addSubstitutedPlayer(String player){
	    	substitutedPlayers.add(player);
	    }
	    
	    public void removeSubstitutedPlayer(int index){
	    	substitutedPlayers.remove(index);
	    }
	    
	    public String getSubstitutedPlayer(int index){
	    	return substitutedPlayers.get(index);
	    }
	    
	    public int getSubstitutedPlayerSize(){
	    	return substitutedPlayers.size();
	    }
	    
	    public void addYellowCardPlayer(String player){
	    	yellowCardPlayers.add(player);
	    }
	    
	    public void removeYellowCardPlayer(int index){
	    	yellowCardPlayers.remove(index);
	    }
	    
	    public String getYellowCardPlayer(int index){
	    	return yellowCardPlayers.get(index);
	    }
	    
	    public int getYellowCardPlayerSize(){
	    	return yellowCardPlayers.size();
	    }
	    
	    public void addRedCardPlayer(String player){
	    	redCardPlayers.add(player);
	    }
	    
	    public void removeRedCardPlayer(int index){
	    	redCardPlayers.remove(index);
	    }
	    
	    public String getRedCardPlayer(int index){
	    	return redCardPlayers.get(index);
	    }
	    
	    public int getRedCardPlayerSize(){
	    	return redCardPlayers.size();
	    }
	    
	    public int getHome() {
	        return Home;
	    }
	  
	    public void setHome(int home) {
	        Home = home;
	    }
	    
	    public int getAway() {
	        return Away;
	    }
	  
	    public void setAway(int away) {
	        Away = away;
	    }
	    
	    public String getOpponent() {
	        return Opponent;
	    }
	  
	    public void setOpponent(String opponent) {
	        Opponent = opponent;
	    }
	  
}
