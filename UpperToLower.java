import java.util.Locale;
import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {

        //write any alphabet in uppercase and print in lowercase

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any alphabet in Upper case");

        String string = scanner.nextLine();

        System.out.println("Before change:"+"\t"+string);

        System.out.println("After chance:"+"\t"+string.toLowerCase(Locale.ROOT));
    }
}
