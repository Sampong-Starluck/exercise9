import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ContactList contactList = new ContactList();
        int opt;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("1. Add new contact\n"+
                                "2. Update contact by index\n"+
                                "3. Delete contact by index\n"+
                                "4. List all contact\n"+
                                "5. Quit\n"+
                                "Choose your option: ");
            opt =sc.nextInt();
            switch(opt){
                case 1: contactList.add(); break;
                case 2: contactList.updateByIndex(); break;
                case 3: contactList.delete(); break;
                case 4: contactList.listContast(); break;
                case 5: System.out.print("GOOD BYE!"); break;
                default: System.out.println("Unknown option!");
            }
        }while(opt!=5);
        sc.close();
    }
}