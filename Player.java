package Team;

public class Player extends Person {
	
    private String backNumber;
    private String position;
    private int injury;
    private int cards; /*where a yellow card is 1/2 and red 1*/
    
    public Player(String name, String firstName, String address, 
                String telNumber, String backNumber, String position, int injury, int cards) {
        super(name, firstName, address, telNumber);
        this.backNumber = backNumber;
        this.position = position;
        this.injury = injury;
        this.cards = cards;
    }
  
    public String getBackNumber() {
        return backNumber;
    }
  
    public void setBackNumber(String number) {
        backNumber = number;
    }
    
    public String getPosition() {
        return position;
    }
  
    public void setPosition(String position) {
        position = position;
    }
    
    public int getInjury() {
        return injury;
    }
  
    public void setInury(int injury) {
        injury = injury;
    }
    
    public int cards() {
        return cards;
    }
  
    public void setCards(int cards) {
        cards = cards;
    }
}
