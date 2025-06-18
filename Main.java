import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 5;
        int Correct_answers;
        String try_again = "yes";
        int tries=0;
        final int MAX=2;
        Scanner input=new Scanner(System.in);
        while (try_again.equalsIgnoreCase("Yes")) {
            Correct_answers = 0;
            int attempt = 0;
            System.out.println("This is Addition Quiz !!!");
            System.out.println("Please answer the following questions : ");
            while (attempt <= TOTAL_NUMBERS) {
                int num1 = (int) (Math.random() * 10);
                int num2 = (int) (Math.random() * 10);
                System.out.println("Questions : " + (attempt + 1) + " What is : "
                        + num1 + " + " + num2 + " ?");
                int ans = input.nextInt();
                if (ans == num1 + num2) {
                    System.out.println("Correct Answer !!!!");
                    Correct_answers++;
                } else {
                    System.out.println("Wrong Answers !!!");
                }
                attempt++;
            }
            System.out.println("The Quiz is ended !!!");
            System.out.println("You answered " + Correct_answers + " out of " + TOTAL_NUMBERS + " Correctly");
            if (Correct_answers >= 3) {
                System.out.println("Well Done you're great !!!");
                break;
            }else {
                tries++;
                if (tries > MAX) {
                    System.out.println("you have reached the maximus retrie");
                    break;

                } else {
                    System.out.println("You're are not prepared well !!");
                    System.out.println("Would you like to try again (yes/no) ");
                    try_again = input.next();
                }
            }
        }

        System.out.println("Thank you taking the Quiz !!!!");
    }
}
