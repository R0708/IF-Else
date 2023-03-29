import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     //calculating sales commission

        System.out.println("Enter Seller name");
        String sellerName = scanner.nextLine();

        System.out.println("Enter sales id");
        int salesId = scanner.nextInt();

        System.out.println("Enter sales amount");
        double salesAmount = scanner.nextDouble();

        System.out.println("Basic Salary");
        double basicSalary = scanner.nextDouble();

        if (salesAmount >= 10000){
            System.out.println("your commission is" + (salesAmount*0.05));

        } else if (salesAmount >= 20000) {
            System.out.println("your commission is" + (salesAmount*0.10));

        } else if (salesAmount >= 30000) {
            System.out.println("your commission is" + (salesAmount*0.20));

        } else if (salesAmount >= 50000) {
            System.out.println("your commission is" + (salesAmount*0.35));

        }else {
            System.out.println("your commission is" + (salesAmount*0.02));
        }

    }
}
