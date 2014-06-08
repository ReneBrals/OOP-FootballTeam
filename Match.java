package Team;

public class Match {
	
      private int Home;
      private int Away;
      private String Opponent;
	  
	    public Match(int home, int away, String opponent) {
		this.Home = home;
		this.Away = away;
		this.Opponent = opponent;
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
