import java.util.Scanner;
public class subScripts{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = input.nextLine();

        System.out.println("What is your surname? ");
        String lastName = input.nextLine();

        System.out.println("What is your birth year? ");
        String birthYear = input.nextLine();

        String first = firstName;

        String last = lastName;




        System.out.print("Username = " + firstName.substring(1, 2) + first.substring(2, 3) + first.substring(0, 1) + last.substring(3, 4) + last.substring(2, 3) + last.substring(0, 1));


    }
}