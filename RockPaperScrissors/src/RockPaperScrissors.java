import java.util.Scanner;

public class RockPaperScrissors {

    public static String playerOneChoose() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("First player choice: ROCK/PAPERS/SCRISORS: ");
        String firstPlayerChoice = myScanner.next().toLowerCase();
        if (!(firstPlayerChoice.equals("rock") || firstPlayerChoice.equals("paper") || firstPlayerChoice.equals("scrissors"))) {
            System.out.println("Invalid input, try again");
            firstPlayerChoice = playerOneChoose();
        }
        return firstPlayerChoice;
    }

    public static String playerTwoChoose() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Second player choice: ROCK/PAPERS/SCRISORS: ");
        String secondPlayerChoose = myScanner.next().toLowerCase();
        if (!(secondPlayerChoose.equals("rock") || secondPlayerChoose.equals("paper") || secondPlayerChoose.equals("scrissors"))) {
            System.out.println("Invalid input, try again");
            secondPlayerChoose = playerOneChoose();
        }
        return secondPlayerChoose;
    }


    public static void main(String[] args) {

        String firstPlayerChoice = playerOneChoose();
        String secondPlayerChoice = playerOneChoose();

        if (firstPlayerChoice.equals("rock") && secondPlayerChoice.equals("scrissors") ||
                firstPlayerChoice.equals("scrissors") && secondPlayerChoice.equals("paper") ||
                firstPlayerChoice.equals("paper") && secondPlayerChoice.equals("rock"))
            System.out.println("First Player Wins!");

        else if ((secondPlayerChoice.equals("rock") && firstPlayerChoice.equals("scrissors") ||
                secondPlayerChoice.equals("scrissors") && firstPlayerChoice.equals("paper") ||
                secondPlayerChoice.equals("paper") && firstPlayerChoice.equals("rock")))
            System.out.println("Second Player Wins!");

        else if (firstPlayerChoice.equals(secondPlayerChoice)) System.out.println("Draw");

        else System.out.println("Invalid, please try again!");


    }
}
