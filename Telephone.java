public class Telephone{
    String number, purpose;

    public Telephone(String number, String purpose){
        this.number = number;
        this.purpose = purpose;
    }

    @Override
    public String toString(){
        return number +":"+ purpose ;
        }

    public String getNumber(){
        return number;
    }
    public String getPurpose(){
        return purpose;
    }

    public void updateTelephone(String number, String purpose){
        this.number = number;
        this.purpose = purpose;
    }
}