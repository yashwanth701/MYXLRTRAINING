import java.util.*;
public class Demo13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        System.out.println("Before Swapping: ");
        System.out.println("first number: "+num1);
        System.out.println("second number: "+num2);
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping: ");
        System.out.println("first number: "+num1);
        System.out.println("second number: "+num2);


    }
    
}
