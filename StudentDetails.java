import java.util.Scanner;

public class StudentDetails {
    //to check all student details
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter name:"+"\n"+"Roll Number:"+"\n"+"Maths Marks:"+"\n"+"Sci Marks:"+"\n"+"Eng Marks:");
        String Name = scanner.nextLine();
        int rollNumber = scanner.nextInt();
        int mathsMarks = scanner.nextInt();
        int sciMarks = scanner.nextInt();
        int engMarks = scanner.nextInt();
        int total = (mathsMarks+sciMarks+engMarks);
        double percentage;
        percentage = ((total/3));
        System.out.println("The total of three subject is:"+ total);
        System.out.println("The percentage of three subject is:"+ percentage);
        if (percentage >= 80) {
            System.out.println("Your Grade is : A+");
            
        } else if (percentage >= 60) {
            System.out.println("Your Grade is : A");
            
        } else if (percentage >= 50) {
            System.out.println("Your Grade is : B");

        } else if (percentage >= 35) {
            System.out.println("Your Grade is : C");

        }


    }

}
