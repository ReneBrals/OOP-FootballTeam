package Team;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;


public class FootballPanel extends JPanel implements Observer{
    Team t;

      
    public FootballPanel(){
        setSize(500, 400);
        this.t = new Team();
    }
      
    public void setModel(Team t){
        this.t = t;
         /*notify observer*/
    }
      

      
      
}
