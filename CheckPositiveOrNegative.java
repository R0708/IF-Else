import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        int number;

        //object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number:");
        //reading a number from the user
        number = scanner.nextInt();

        //checks the number is greater than 0 or not
        if (number>0) {
            System.out.println("the number is positive");
        }
        //check the number is less than 0 or not
        else if (number<0) {
            System.out.println("the number is negative");
        }
        //execute when the above two condition is return false
        else {
            System.out.println("the number is zero");
        }
    }
}
