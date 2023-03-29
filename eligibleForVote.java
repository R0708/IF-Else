import java.util.Scanner;

public class eligibleForVote {
    Scanner scanner = new Scanner(System.in);


    public void eligibleForVote(){
        //acKnowLedge the User what to enter
        System.out.println("Please enter you age in inter value");

        //storing age in variable using scanner object
        int age =scanner.nextByte();
        if (age>=18) {
            System.out.println("you are eligible for vote as you age is:"+ age);

        } else {
            System.out.println("you are not eligible for vote as you age is:"+ age);
        }

    }

    public static void main(String[] args) {
        //creating class object to call not-static method in static area

         eligibleForVote eligibleForVote = new eligibleForVote();

         //calling method using class object
        
        eligibleForVote.eligibleForVote();




    }

}
