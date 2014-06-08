package Team;

public class Coach extends Person {
	
    private String employeeNumber;
  
    public Coach(String name, String firstName, String address, 
                String telNumber, String employeeNumber) {
        super(name, firstName, address, telNumber);
        this.employeeNumber = employeeNumber;
    }
  
    public String getEmployeeNumber() {
        return employeeNumber;
    }
  
    public void setEmployeeNumber(String number) {
        employeeNumber = number;
    }
          
}