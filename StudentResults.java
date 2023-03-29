import java.util.Scanner;

public class StudentResults {
    public void studentResults() {

        Scanner scanner = new Scanner(System.in);
        //student is pass if you get more than 35 marks in subject

        System.out.println("Maths Marks:" + "\n" + "Sci Marks:" + "\n" + "Eng Marks:");
        String Name = scanner.nextLine();

        float avg = 0;
        int mathsMarks = scanner.nextInt();
        int sciMarks = scanner.nextInt();
        int engMarks = scanner.nextInt();
        int total = (mathsMarks + sciMarks + engMarks);
        double percentage;
        percentage = ((total / 3));
        System.out.println("your overall percentage" + "is" + avg);

        if (((avg >= 35) && (mathsMarks >= 35) && (sciMarks >= 35) && (engMarks >= 35))){
            System.out.println("congratulation you are been pass");

        }else {
            System.out.println("sorry your been fail");
        }
    }

    public static void main(String[] args) {
        //to call non-static method in static area creating class object
        StudentResults studentResults = new StudentResults();
        //calling method using class object
        studentResults.studentResults();
    }


    }




