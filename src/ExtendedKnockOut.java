public class ExtendedKnockOut {
    public static void main(String[] args) {
        Boolean playAgain = true;
        while (playAgain) {
            System.out.println("Would you like to play again? Enter Y or N:");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                playAgain = true;
            }
            if (response.equalsIgnoreCase("N")) {
                playAgain = false;
            }
            System.out.println("Bye");
        }
    }
}
