import java.util.Random;
import java.util.Scanner;

public class KnockOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Knock out number (6, 7, 8, 9):");
        int playerKO = input.nextInt();
        Random random = new Random();
        int ComputerKo = random.nextInt(4) + 6;
        System.out.println("The computer's knock out number is " + ComputerKo);
        int playerSum = 0;
        int computerSum = 0;
        int roll = 0;
        // Player turn
        while(roll != playerKO && playerSum < 100) {
            roll = random.nextInt(12) + 1;
            System.out.printf("Player roll : %d%n", roll);
            playerSum += roll;
            System.out.printf("Player total : %d%n", playerSum);
        }
        // computer turn
        while(roll != ComputerKo && computerSum < 100) {
            roll = random.nextInt(12) + 1;
            System.out.printf("Computer roll : %d%n", roll);
            computerSum += roll;
            System.out.printf("Computer total : %d%n", computerSum);
        }
    }
}
