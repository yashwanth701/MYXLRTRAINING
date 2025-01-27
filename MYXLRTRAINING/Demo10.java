import java.util.Scanner;
public class Demo10{
    int id;
    String firstName,lastName,address;
    public Demo10(){
    }
    public Demo10(int id, String firstName, String lastName, String address){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;

    }
    public int getId(){
        return id;
    }
    void setId(int id){
        this.id=id;
    }
    public String getfirstName(){
        return firstName;
    }
    void setfirstName(String firstName){
        this.firstName=firstName;
    }
    public String getlastName(){
        return lastName;
    }
    void setlastName(String lastName){
        this.lastName=lastName;
    }
    public String getfullName(){
        return firstName+" "+lastName;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
 
    
    }
}
