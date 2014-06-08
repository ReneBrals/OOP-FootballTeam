package Team;

import java.io.*;
import java.util.*;

public class Team {
	
      private String Coach;
      private String Captain;
      private String GoalKeeper;
	
	  ArrayList<Player> team = new ArrayList<Player>();
	  
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
	  
}
