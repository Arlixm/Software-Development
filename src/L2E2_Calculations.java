import java.util.*;
public class L2E2_Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your first number: ");
        int num1 = input.nextInt();

        System.out.print("Type in your second number: ");
        int num2 = input.nextInt();

        System.out.println("What would you like to do with these two numbers? ");

        System.out.println("""
                1. Addition\s
                2. Subtraction\s
                3. Multiplication\s
                4. Division\s""");
        int ans = input.nextInt();
        if (ans == 1){
            System.out.print(num1 + num2);
        }
        if (ans == 2){
            System.out.print(num1 - num2);
        }
        if (ans == 3){
            System.out.print(num1 * num2);
        }
        if (ans == 4){
            System.out.print(num1 / num2);
        }

    }

}
