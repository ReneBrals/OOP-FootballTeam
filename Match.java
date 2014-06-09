package Team;

import java.util.ArrayList;

public class Match {
	
      private int Home;
      private int Away;
      private String Opponent;
      private ArrayList<Player> playedPlayers = new ArrayList<Player>();
	  
	    public Match(int home, int away, String opponent, ArrayList<Player> playedplayers) {
		this.Home = home;
		this.Away = away;
		this.Opponent = opponent;
		this.playedPlayers = playedplayers;
	}
	    
	    public void addPlayedPlayer(Player p){
	    	playedPlayers.add(p);
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
