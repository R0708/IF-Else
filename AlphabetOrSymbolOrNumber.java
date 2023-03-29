import java.util.Scanner;

public class AlphabetOrSymbolOrNumber {
    //method are used for number,an alphabet or symbol
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character: ");
        char c = scanner.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is A ALPHABET:");

        } else if (c >= '0' && c <= '9') {
            System.out.println(c + "is A DIGIT:");

        }else {
            System.out.println(c + "is A SPECIAL CHARACTER:");
        }
    }
}
