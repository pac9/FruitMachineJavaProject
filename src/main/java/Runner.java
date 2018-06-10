import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome to the 'Gamblers Always Welcome' casino");
        System.out.println("\n");
        System.out.println("Please select which machine you would like to play");
        System.out.println("Press H to play 'The House Always Wins' else select any other button to play 'Suckers'");
        String select = keyboard.next();
        char gameSelection = select.charAt(0);
        System.out.println("\n");


        if (gameSelection == ('H') || gameSelection == ('h')) {
            FruitMachine fruitMachine = new TheHouseAlwaysWinMachine("The House Always Wins");

            System.out.println("Welcome to " + fruitMachine.getName());
            System.out.println("---------------------------");
            System.out.println("* Match three identical   *");
            System.out.println("*   symbols to win £8     *");
            System.out.println("---------------------------");

            Player player = new Player(5);
            fruitMachine.getCashInFromPlayer(player.getCash());
            System.out.println("Balance: £" + player.getCash());
            System.out.println("It's £" + fruitMachine.getStake() + " to play, let's role the reels....");

            fruitMachine.playGame(fruitMachine);
            player.getWinningsFromMachine(fruitMachine.getPayout());
            System.out.println("Winnings transferred to your account: £" + player.getWinnings());

        }
        else if (gameSelection != ('H') || gameSelection != ('h')) {
            FruitMachine fruitMachine = new SuckerMachine("Suckers");

            System.out.println("Welcome to " + fruitMachine.getName());
            System.out.println("---------------------------");
            System.out.println("|   3 Cherries wins £5    |");
            System.out.println("|   3 Oranges  wins £6    |");
            System.out.println("|   3 Lemons   wins £7    |");
            System.out.println("---------------------------");

            Player player = new Player(5);
            fruitMachine.getCashInFromPlayer(player.getCash());
            System.out.println("Balance: £" + player.getCash());
            System.out.println("It's £" + fruitMachine.getStake() + " to play, let's role the reels....");

            fruitMachine.playGame(fruitMachine);
            player.getWinningsFromMachine(fruitMachine.getPayout());
            System.out.println("Winnings transferred to your account: £" + player.getWinnings());

        }

    }
}







