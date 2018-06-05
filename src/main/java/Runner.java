import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Runner {


    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Welcome to The House Always Win");
        System.out.println("\n");
        FruitMachine fruitMachine = new FruitMachine(1);
        Player player = new Player(10, fruitMachine.getStake(), 1);
        System.out.println("Balance: £" + player.getCash());
        System.out.println("You have placed a £" + fruitMachine.getStake() + " bet, let's role the reels....");
        fruitMachine.generateThreeWheels();
//        System.out.println("---------------------------");
        System.out.println("\n");
        System.out.println("Reel 1    " + "Reel 2    " + "Reel 3     ");
        System.out.println(fruitMachine.setReelOneChoice()+ " | " + fruitMachine.setReelTwoChoice() + " | " + fruitMachine.setReelThreeChoice());
        System.out.println("\n");
        fruitMachine.randomiseReelChoice();
        fruitMachine.resultOfSpin();
        System.out.println("\n");
        System.out.println("Balance remaining: £" + player.decreaseCashWhenBetPlaced());
        System.out.println("Winnings to date: £" + player.getWinnings());

    }
}
