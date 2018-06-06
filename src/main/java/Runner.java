import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n");
        TheHouseAlwaysWinMachine theHouseAlwaysWinMachine = new TheHouseAlwaysWinMachine("The House Always Wins");
        System.out.println("Welcome to " + theHouseAlwaysWinMachine.getName());
        System.out.println("\n");

        Player player = new Player(10);

        System.out.println("Balance: £" + theHouseAlwaysWinMachine.getCashInFromPlayer(player.getCash()));
        System.out.println("You have placed a £" + theHouseAlwaysWinMachine.getStake() + " bet, let's role the reels....");

        while (theHouseAlwaysWinMachine.getPlayerStake() > 0) {
            char playAgain;
//
            theHouseAlwaysWinMachine.enoughCashToPlayGame();
            theHouseAlwaysWinMachine.outOfFunds();
            theHouseAlwaysWinMachine.generateThreeWheels();
//        System.out.println("---------------------------");
            System.out.println("\n");
            System.out.println("Reel 1    " + "Reel 2    " + "Reel 3     ");
            System.out.println(theHouseAlwaysWinMachine.setReelOneChoice() + " | " + theHouseAlwaysWinMachine.setReelTwoChoice() + " | " + theHouseAlwaysWinMachine.setReelThreeChoice());
            System.out.println("\n");
            theHouseAlwaysWinMachine.randomiseReelChoice();
            theHouseAlwaysWinMachine.resultOfSpin();
            System.out.println("\n");
            System.out.println("Balance remaining: £" + theHouseAlwaysWinMachine.getPlayerStake());
            System.out.println("Winnings to date: £" + theHouseAlwaysWinMachine.getPayout());
            System.out.println("\n");
            System.out.println("Press 'Y' to play again, or any other button to exit");
            String input = keyboard.next();
            playAgain = input.charAt(0);
            if (playAgain == ('Y') || playAgain == ('y')) {
                continue;
            } else if (playAgain != ('Y') || playAgain == ('y')) {
                System.out.println("Thanks for playing!");
                break;

            }


        }
        player.getWinningsFromMachine(theHouseAlwaysWinMachine.getPayout());
//        System.out.println("Winnings transferred: £" + player.getWinningsFromMachine(fruitMachine.getPayout()));
        System.out.println("Winnings transferred to your account: £" + player.getWinnings());

    }

//        System.out.println("Balance in machine: £" + fruitMachine.getCashIn());

    }