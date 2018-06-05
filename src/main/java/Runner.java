import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome to The House Always Win");
        System.out.println("\n");
        FruitMachine fruitMachine = new FruitMachine();
        Player player = new Player(10, fruitMachine.getPayout());

        System.out.println("Balance: £" + fruitMachine.getCashInFromPlayer(player.getCash()));
        System.out.println("You have placed a £" + fruitMachine.getStake() + " bet, let's role the reels....");

            while (fruitMachine.getPlayerStake() > 0) {
                char playAgain;
                do {
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

                }


                while (playAgain == 'Y' || playAgain == 'y');
                System.out.println("Thanks for playing!");
                System.exit(0);


            }



//
            }

        }

//        System.out.println("Balance in machine: £" + fruitMachine.getCashIn());

//
//                if (playAgain == ('Y') || playAgain == ('y')) {
//                continue;
//                } else if (playAgain == ('N') || playAgain == ('n')) {
//                System.out.println("Thanks for playing!");
//                break;
//                } else if (playAgain != ('N') || playAgain == ('n') || playAgain != ('y') || playAgain != ('Y')) {
//                System.out.println("Please press Y or N");
//                continue;
