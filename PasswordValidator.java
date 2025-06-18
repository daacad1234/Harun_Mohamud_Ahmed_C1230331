import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (isLonger(password) &&
                hasUpperCase(password) &&
                hasLowerCase(password) &&
                hasDigit(password) &&
                hasSpecialChar(password)) {
            System.out.println("Your password is Strong password");
        } else {
            System.out.println("Your password is Weak password ");
        }
    }

    // Password must be at least 8 characters
    public static boolean isLonger(String password) {
        return password.length() >= 8;
    }

    // At least one uppercase letter
    public static boolean hasUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    // At least one lowercase letter
    public static boolean hasLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    // At least one digit
    public static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    // At least one special character
    public static boolean hasSpecialChar(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return true;
        }
        return false;
    }
}