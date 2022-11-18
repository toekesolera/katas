import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scanner.nextInt();

        if (n % 105 == 0) {
            System.out.println("FizzBuzzPop");
        } else if (n % 35 == 0) {
            System.out.println("FizzPop");
        } else if (n % 21 == 0) {
            System.out.println("BuzzPop");
        } else if (n % 7 == 0) {
            System.out.println("Pop");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }


    }
}