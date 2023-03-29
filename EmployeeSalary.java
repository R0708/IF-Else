import java.util.Scanner;
//basic salary of employee
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee name:"+"\n"+"Enter the employee id:"+"\n"+
                "Enter the basic salary of an employee:");

        String name = scanner.nextLine();
        int id = scanner.nextInt();
        double basicSalary = scanner.nextDouble();
        double hra,da,ta,pf,gross;

        hra = basicSalary*0.10;
        System.out.println("this is HRA;" + hra);

        da = basicSalary*0.08;
        System.out.println("this is DA:" + da);

        ta = basicSalary*0.09;
        System.out.println("this is TA:" + ta);

        pf = basicSalary*0.20;
        System.out.println("this is PF:" + pf);

        gross = hra+da+ta+pf;
        System.out.println("this is gross salary:" + gross);

    }
}
