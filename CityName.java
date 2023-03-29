import java.util.Scanner;
//to check the city name to use alphabetical letter
public class CityName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter from a to f");

        char Letter = input.next().charAt(0);

        if (Letter == 'a'){
            System.out.println("Ahmedabad");

        } else if (Letter == 'b') {
            System.out.println("Bangkok");

        } else if (Letter == 'c') {
            System.out.println("china");

        } else if (Letter == 'd') {
            System.out.println("Delhi");

        } else if (Letter == 'e') {
            System.out.println("Erbil");

        } else if (Letter == 'f') {
            System.out.println("Fukuoka");

        }else {
            System.out.println("Invalid entry");
        }


    }
    }

