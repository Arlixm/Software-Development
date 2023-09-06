import java.util.*;
public class shortStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        System.out.print(firstName + " likes to go " + hobby + " as it helps " + firstName + " relive stress and helps keep the body active");
    }

}