import java.util.Scanner;
public class subScripts_L3E1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = input.nextLine();

        System.out.println("What is your surname? ");
        String lastName = input.nextLine();

        System.out.println("What is your birth year? ");
        int birthYear = input.nextInt();

        String first = firstName;

        String last = lastName;

        Integer year = birthYear;


        System.out.println("Username = " + firstName.substring(0,1) + last.substring(0, 5));
        System.out.println("Password = " + lastName.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase() + birthYear);



    }
}