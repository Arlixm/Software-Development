import java.util.*;
    public class Interation{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number that you want to multiply: ");
            int num = input.nextInt();

            for (int count=num; count<=num*12; count+=num)
            {
                System.out.print("\n" + count);
            }


        }
}
