import java.util.Scanner;

public class NumberCalculate {
    //to input enter any two number for calculation
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter First number");

        int a = scanner.nextInt();
        System.out.println("please enter second number");

        int b = scanner.nextInt();
        System.out.println("Choose operator [1]-addition [2]-subtraction [3]-multiply [4]divide");

        int c = scanner.nextInt();

        if (c == 1){
            System.out.println("Answer:" +(a+b));

        } else if (c == 2) {
            System.out.println("Answer:" +(a-b));

        } else if (c == 3) {
            System.out.println("Answer:" +(a*b));

        } else if (c == 4) {
            System.out.println("Answer:" +(a/b));

        }
    }
}
