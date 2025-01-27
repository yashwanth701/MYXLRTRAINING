import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Happy Sankranti to all the participants");
        System.out.println("No.of Users: ");
        int user=obj.nextInt();
        for(int i=0; i<user;i++){
            System.out.println("Are you a member (yes or no):");
            String reply= obj.next();
            if(reply.equals("yes")){
            System.out.println("Happy Sankranti");        
            } else{
                break;
            }
        }
    }  
}