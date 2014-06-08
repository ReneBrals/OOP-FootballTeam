package Team;

public abstract class Person {
  
    private String name;
    private String firstName;
    private String address;
        private String telNumber;
  
    public Person(String name, String firstName, String address, String telNumber) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
                this.telNumber = telNumber;
    }
  
    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public String getFirstName() {
        return firstName;
    }
  
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    public String getAddress() {
        return address;
    }
  
    public void setAddress(String address) {
        this.address = address;
    }
          
        public String getTelNumber(){
                return telNumber;
        }
          
        public void setTelNumber(String telNumber){
            this.telNumber = telNumber;
        }
          
          
} 