import java.util.Scanner;
public class PrimeCheker {
    public static void main(String[] args) {
     int sum = 0, count = 0;
     Scanner input =new Scanner(System.in);
     System.out.println("enter a number:");
     int num = input.nextInt();

     for (int i=1; i<=num; i++) {
         if (num % i == 0) {
             count++;
         }
     }
    if (count == 2){
        System.out.println(num +" is prime number");
    }
    else{
        System.out.println(num + " is not prime number.");
    }

    }
}
