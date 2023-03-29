import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //to input five number and then find average
        System.out.println("Input 1st number:");
        int num1 = scanner.nextInt();

        System.out.println("Input 2st number:");
        int num2 = scanner.nextInt();

        System.out.println("Input 3st number:");
        int num3 = scanner.nextInt();

        System.out.println("Input 4st number:");
        int num4 = scanner.nextInt();

        System.out.println("Input 5st number:");
        int num5 = scanner.nextInt();

        System.out.println("Average of 5 numbers is:" + (num1 + num2 + num3 + num4 + num5) / 5);


    }
}
