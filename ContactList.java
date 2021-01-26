import java.util.Scanner;
import java.util.ArrayList;

public class ContactList{
    ArrayList<Contact> contacts = new ArrayList<>();

    public ContactList(){

    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, number, purpose;
        int n;
        ArrayList<Telephone> phoneNumber = new ArrayList<>();
        System.out.print("FirstName: ");
        firstName = sc.next();
        System.out.print("LastName: ");
        lastName = sc.next();
        System.out.print("Number of phone number you want to add: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
        System.out.print("Phone Number: ");
        number = sc.next();
        System.out.print("Purpose: ");
        purpose = sc.next();
        phoneNumber.add(new Telephone(number, purpose));
        }
        contacts.add(new Contact(firstName, lastName, phoneNumber));
    }

    public void listContast(){
        for(int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    public void updateByIndex(){
        Scanner sc = new Scanner(System.in);
        int index, n; 
        String firstName, lastName, number, purpose;
        System.out.print("index: ");
        index = sc.nextInt();
        Contact c = contacts.get(index);
        ArrayList<Telephone> t = new ArrayList<>();
        if(c!=null){
            System.out.print("FirstName: ");
            firstName = sc.next();
            System.out.print("LastName: ");
            lastName = sc.next();
            System.out.print("Amount of phone number you want to add: ");
            n = sc.nextInt();
            for(int i=0; i<n; i++){
            System.out.print("Phone Number: ");
            number = sc.next();
            System.out.print("Purpose: ");
            purpose = sc.next();
            t.add(new Telephone(number, purpose));
            }
            c.updateContact(firstName, lastName, t);
        }
        else{
            System.out.println("Index does not exit!!!");
        }
    }

    public void delete(){
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.print("Index: ");
        index = sc.nextInt();
        contacts.remove(index);

    }
}