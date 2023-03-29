import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {
        // x and y are to swap
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("before swapping number:"+ x + " "+ y);
        //swapping numbers
        z = x;
        x = y;
        y = z;
        System.out.println("after swapping:"+ x + " "+ y);

    }
}
