import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Please select which machine you would like to play");
        System.out.println("Press H to play 'The House Always Wins' else select any other button to play 'Suckers'");
        String select = keyboard.next();
        char gameSelection = select.charAt(0);
        if (gameSelection == ('H') || gameSelection == ('h')) {
            FruitMachine fruitMachine = new TheHouseAlwaysWinMachine("The House Always Wins");
            System.out.println("\n");

        System.out.println("Welcome to " + fruitMachine.getName());

            System.out.println("---------------------------");
            System.out.println("* Match three identical   *");
            System.out.println("*   symbols to win £8     *");
            System.out.println("---------------------------");
            Player player = new Player(10);

            System.out.println("Balance: £" + fruitMachine.getCashInFromPlayer(player.getCash()));
            System.out.println("You have placed a £" + fruitMachine.getStake() + " bet, let's role the reels....");

            while (fruitMachine.getPlayerStake() > 0) {
                char playAgain;
//
                fruitMachine.enoughCashToPlayGame();
                fruitMachine.outOfFunds();
                fruitMachine.generateThreeWheels();
//        System.out.println("---------------------------");
                System.out.println("\n");
                System.out.println("Reel 1    " + "Reel 2    " + "Reel 3     ");
                System.out.println(fruitMachine.setReelOneChoice() + " | " + fruitMachine.setReelTwoChoice() + " | " + fruitMachine.setReelThreeChoice());
                System.out.println("\n");
                fruitMachine.randomiseReelChoice();
                fruitMachine.resultOfSpin();
                System.out.println("\n");
                System.out.println("Balance remaining: £" + fruitMachine.getPlayerStake());
                System.out.println("Winnings to date: £" + fruitMachine.getPayout());
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
            player.getWinningsFromMachine(fruitMachine.getPayout());
//        System.out.println("Winnings transferred: £" + player.getWinningsFromMachine(fruitMachine.getPayout()));
            System.out.println("Winnings transferred to your account: £" + player.getWinnings());

        }
        else if (gameSelection != ('H') || gameSelection == ('h')) {
            FruitMachine fruitMachine = new SuckerMachine("Suckers");
            System.out.println("\n");

            System.out.println("Welcome to " + fruitMachine.getName());
            System.out.println("---------------------------");
            System.out.println("|   3 Cherries wins £5    |");
            System.out.println("|   3 Lemons   wins £7    |");
            System.out.println("|   3 Oranges  wins £6    |");
            System.out.println("---------------------------");


            Player player = new Player(10);

            System.out.println("Balance: £" + fruitMachine.getCashInFromPlayer(player.getCash()));
            System.out.println("You have placed a £" + fruitMachine.getStake() + " bet, let's role the reels....");

            while (fruitMachine.getPlayerStake() > 0) {
                char playAgain;
//
                fruitMachine.enoughCashToPlayGame();
                fruitMachine.outOfFunds();
                fruitMachine.generateThreeWheels();
//        System.out.println("---------------------------");
                System.out.println("\n");
                System.out.println("Reel 1    " + "Reel 2    " + "Reel 3     ");
                System.out.println(fruitMachine.setReelOneChoice() + " | " + fruitMachine.setReelTwoChoice() + " | " + fruitMachine.setReelThreeChoice());
                System.out.println("\n");
                fruitMachine.randomiseReelChoice();
                fruitMachine.resultOfSpin();
                System.out.println("\n");
                System.out.println("Balance remaining: £" + fruitMachine.getPlayerStake());
                System.out.println("Winnings to date: £" + fruitMachine.getPayout());
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
            player.getWinningsFromMachine(fruitMachine.getPayout());
//        System.out.println("Winnings transferred: £" + player.getWinningsFromMachine(fruitMachine.getPayout()));
            System.out.println("Winnings transferred to your account: £" + player.getWinnings());

        }


    }
}

//        System.out.println("Balance in machine: £" + fruitMachine.getCashIn());

