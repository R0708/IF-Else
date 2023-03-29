import java.util.Scanner;

public class leapYear {
    //creating class object to non-static method to static area
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
//acKnowLedge the User what to enter
        System.out.println("type a year");
        year= scanner.nextInt();

        if ((year % 4 == 0) && year % 100 != 0){
            System.out.println(year + "is it leap year");

        } else if (((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
            System.out.println(year + "is it leap year ");

        }else {
            System.out.println("is it not a leap year");
        }

    }
}

