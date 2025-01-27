import java.util.Scanner;

class Leet001 {
    boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("x: ");
        int num = obj.nextInt();

        Leet001 demo = new Leet001();
        if (demo.isPalindrome(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        
    }
}
}