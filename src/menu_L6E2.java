import java.util.*;
public class menu_L6E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Please enter a number between 1-4: ");
            num = input.nextInt();
            if (num == 1) {
                System.out.println("Hello");
            } else if (num == 2) {
                System.out.println("The time is now");
            } else if (num == 3) {
                System.out.println("Your life");
            } else if (num == 4) {
                System.out.println("End");
            }


        } while (num != 4);

    }
}
