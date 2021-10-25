import java.util.Scanner;

public class CokesOnTheWall {
    private int numberOfBottles;

    CokesOnTheWall(int number) {
        if (number < 0) {
            this.numberOfBottles = 0;
        } else if (number > 99) {
            this.numberOfBottles = 99;
        } else {
            this.numberOfBottles = number;
        }

    }

    public String getSingular(int i) {
        switch(i) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Error";
        }
    }

    public String getMultiplesOfTen(int i) {
        switch(i) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default:
                return "Error";
        }
    }

    public String getTeens(int i) {
        switch(i) {
            case 0:
                return "Ten";
            case 1:
                return "Eleven";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fifteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Nineteen";
            default:
                return "Error";
        }
    }

    public String getNumberInEnglish(int i) {
        int ones = i % 10;
        int tens = i / 10;
        if (i > 9) {
            if (tens == 1) {
                return this.getTeens(ones);
            } else if (ones == 0) {
                return this.getMultiplesOfTen(i / 10);
            } else {
                String var10000 = this.getMultiplesOfTen(tens);
                return var10000 + "-" + this.getSingular(ones);
            }
        } else {
            return this.getSingular(ones);
        }
    }

    public String printSong() {
        String bottleString = "bottles";
        String Output = "";

        while(this.numberOfBottles > 0) {
            if (this.numberOfBottles == 1) {
                bottleString = "bottle";
            }

            Output = Output + this.getNumberInEnglish(this.numberOfBottles) + " " + bottleString + " of beer on the wall.\n";
            Output = Output + this.getNumberInEnglish(this.numberOfBottles) + " " + bottleString + " of beer on the wall,\n";
            Output = Output + "Take one down, pass it around,\n";
            --this.numberOfBottles;
            if (this.numberOfBottles == 0) {
                bottleString = "bottles";
            } else if (this.numberOfBottles == 1) {
                bottleString = "bottle";
            }
        }

        Output = Output + "Zero bottles of beer on the wall.";
        return Output;
    }
}

class Sing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int numberOfBottles = sc.nextInt();
        CokesOnTheWall song = new CokesOnTheWall(numberOfBottles);
        System.out.print(song.printSong());
        sc.close();
    }
}