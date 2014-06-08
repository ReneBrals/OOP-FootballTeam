package Team;

public class Player extends Person {
	
    private String backNumber;
    private String Position;
    private int Injury;
    private int Cards; /*where a yellow card is 1/2 and red 1*/
    
    public Player(String name, String firstName, String address, 
                String telNumber, String backNumber, String position, int injury, int cards) {
        super(name, firstName, address, telNumber);
        this.backNumber = backNumber;
        this.Position = position;
        this.Injury = injury;
        this.Cards = cards;
    }
  
    public String getBackNumber() {
        return backNumber;
    }
  
    public void setBackNumber(String number) {
        backNumber = number;
    }
    
    public String getPosition() {
        return Position;
    }
  
    public void setPosition(String position) {
    	Position = position;
    }
    
    public int getInjury() {
        return Injury;
    }
  
    public void setInury(int injury) {
        Injury = injury;
    }
    
    public int getCards() {
        return Cards;
    }
  
    public void setCards(int cards) {
        Cards = cards;
    }
}
