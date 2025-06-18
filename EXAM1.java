import java.util.Scanner;

public class EXAM1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character at position 0:");
        char ch = input.next().charAt(0);
        if (ch == 'N') {
            System.out.println("exist");
        } else {
            System.out.println("failed");
        }

        int sum = 0;
        System.out.println("enter integer number ");
        int number = input.nextInt();
        while (number != 0) {
            sum += number;
            System.out.println("enter an integer number");
            number = input.nextInt();
        }
        System.out.println("the sum of number are" + sum);
    }
}

