import java.util.Scanner;
public class PalineDrop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number or letter");
        String user_input = input.nextLine();
        String reverce = "";
        for (int i = user_input.length() - 1; i <= 0; i--) {
            reverce+= user_input.charAt(i);
        }


            if (user_input.equals(reverce)) {
                System.out.println(user_input + " is a palindrome ");
            } else {
                System.out.println(user_input + " is not palindrome ");
            }
            input.close();

        }

}