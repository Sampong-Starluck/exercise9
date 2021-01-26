import java.util.ArrayList;
public class Contact{
    String firstName, lastName;
    ArrayList<Telephone> phoneNumber = new ArrayList<>();

    public Contact(String firstName, String lastName, ArrayList<Telephone> phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "FirstName: " + firstName + "\n" + "LastName:"+ lastName + "\n"+
                "PhoneNumber&Purpose: "+phoneNumber;
        }
        


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void updateContact(String firstName, String lastName, ArrayList<Telephone> phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}


