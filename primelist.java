import java.util.Scanner;

public class primelist{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fadlan geli tirada ugu sarreysa: ");
        int limit = input.nextInt();

        System.out.println("Prime Numbers ilaa " + limit + ":");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}


