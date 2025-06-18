import java.util.Scanner;
public class LoopAssignment {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char  ch;
        while (true){
            System.out.println("Enter n to stop");
            ch = input.nextLine().charAt(0);
            if (ch == 'n'){
                break;
            }
            else {
                System.out.println("invalid");
            }
        }


    }
}
