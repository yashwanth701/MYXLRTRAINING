import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginId;
        String password;
        String reply;

        System.out.println("Welcome to Mallareddy University");

        do {
            System.out.println("Have you visited our site earlier? (Yes/No)");
            reply = scanner.nextLine();

            if (reply.equalsIgnoreCase("No")) {
                System.out.println("Please log in here.");
                System.out.print("Enter your ID: ");
                loginId = scanner.nextLine();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();

                if (loginId.equals("647") && password.equals("12345")) {
                    System.out.println("Login successful. Welcome to Mallareddy University!");
                    break;
                } else {
                    System.out.println("Invalid login ID or password. Please try again.");
                }
            } else if (reply.equalsIgnoreCase("Yes")) {
                System.out.println("You are our valid customer.");
                break;
            } else {
                System.out.println("Invalid input. Please reply with 'Yes' or 'No'.");
            }
        } while (true);

        scanner.close();
    }
}