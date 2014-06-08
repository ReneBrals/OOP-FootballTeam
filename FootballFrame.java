package Team;

import java.awt.*;
import javax.swing.*;

public class FootballFrame extends JFrame{
    JButton backButton;
    JButton nextButton;
    JLabel scoreLabel;
    JLabel weekLabel;
    JLabel teamLabel;
    JComboBox[] playerSelectors;
    JComboBox[] reserveSelectors;
    JComboBox coachSelector;
    JTextArea notifications;
    
    public FootballFrame(){
        init();
    }
    
    public final void init(){
        /*Setting the layout*/
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        /*The control for the week*/
        final JPanel weekControl = new JPanel();
        
        backButton = new JButton("<");
        nextButton = new JButton(">");
        weekLabel = new JLabel("Week XX");
        
        weekControl.add(backButton);
        weekControl.add(nextButton);
        weekControl.add(weekLabel);
        
        /*The label for the teams*/
        teamLabel = new JLabel("V.V. Koekenbakkers - S.C. Hondelul");
        teamLabel.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        
        /*The label for the score*/
        final JPanel scoreBox = new JPanel();
        
        JLabel scorePreLabel = new JLabel("Score: ");
        scoreLabel = new JLabel("X - X");
        scoreLabel.setFont(new Font("Sans Serif", Font.BOLD, 16));
        scoreBox.add(scorePreLabel);
        scoreBox.add(scoreLabel);
        
        /*The control for the players*/
        final Box playerControl = Box.createVerticalBox();
        
        String[] players = {"---","Onnthemur","MijnheerNeen","Miria","Sviddy",
                            "Oerzwijn","Kiyoa","Thorseus","Ylmeh","Seeche",
                            "Diamond","TheVeggyDude","Firestarter","OtterBot"};
        
        playerControl.add(new JLabel("Captain"));
        playerSelectors = new JComboBox[11];
        
        playerSelectors[0] = new JComboBox(players);
        playerControl.add(playerSelectors[0]);
        playerControl.add(new JLabel("Players"));
        for(int i=0; i<9;i++){
            playerSelectors[i+1] = new JComboBox(players);
            playerControl.add(playerSelectors[i+1]);
        }
        playerControl.add(new JLabel("Keeper"));
        playerSelectors[10] = new JComboBox(players);
        playerControl.add(playerSelectors[10]);
        
        /*Control for the coach assigned to the game*/
        String[] coaches = {"---","Hernandez","Gonzales","Morales","Juan"};
        
        final Box coachControl = Box.createVerticalBox();
        coachControl.add(new JLabel("Coach"));
        coachSelector = new JComboBox(coaches);
        coachControl.add(coachSelector);
        
        /*Control for the reserve players*/
        final Box reserveControl = Box.createVerticalBox();
        
        reserveSelectors = new JComboBox[3];
        reserveControl.add(new JLabel("Reserves"));
        for(int i=0;i<3;i++){
            reserveSelectors[i] = new JComboBox(players);
            reserveControl.add(reserveSelectors[i]);
        }
        
        /*Control for notes*/
        notifications = new JTextArea();
        notifications.setColumns(20);
        notifications.setRows(10);
        notifications.setEditable(false);
        
        notifications.setText("Onnthemur: 1 geel\n"+
                "Miria: geblesseerd\n"+
                "MijnheerNeen is een baas\n");
        
        /*Placing it on a grid*/
        c.gridx=0;
        c.gridy=0;
        c.gridwidth = 2;
        add(weekControl,c);
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.HORIZONTAL;
        c.ipadx=10;
        c.ipady=10;
        add(teamLabel,c);
        c.gridx=0;
        c.gridy=2;
        c.gridwidth = 1;
        c.gridheight = 2;
        add(playerControl,c);
        c.gridx=1;
        c.gridy=2;
        c.gridheight = 1;
        add(coachControl,c);
        c.gridx=1;
        c.gridy=3;
        add(reserveControl,c);
        c.gridx=2;
        c.gridy=0;
        add(scoreBox,c);
        c.gridx=2;
        c.gridy=1;
        c.gridheight=3;
        c.fill=GridBagConstraints.VERTICAL;
        add(notifications,c);
        //pack();
        
        setSize(new Dimension(500,420));
        setMinimumSize(new Dimension(400,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
