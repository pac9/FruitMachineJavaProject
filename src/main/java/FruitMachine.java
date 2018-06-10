import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class FruitMachine {

    Scanner keyboard = new Scanner(System.in);
    protected int payout;
    protected Enum reelOneChoice;
    protected Enum reelTwoChoice;
    protected Enum reelThreeChoice;
    private int cashIn;
    private int stake;
    private int playerStake;
    private String name;
//    protected int reels;



    public FruitMachine(String name) {

        this.cashIn = cashIn;
        this.stake = 1;
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;
        this.payout = payout;
        this.playerStake = playerStake;
        this.name = name;
//        this.reels = 3;
    }

    public abstract Enum randomiseReelChoice();
/*
Enum [] array = {};
Random rand = new Random();
int select = rand.nextInt(array.length);
return array[select];
}
removed as now in child classes
*/

    public void generateThreeWheels() {
        setReelOneChoice();
        setReelTwoChoice();
        setReelThreeChoice();
    }

    public Enum setReelOneChoice() {
        return this.reelOneChoice = randomiseReelChoice();
    }

    public Enum setReelTwoChoice() {
        return this.reelTwoChoice = randomiseReelChoice();
    }

    public Enum setReelThreeChoice() {
        return this.reelThreeChoice = randomiseReelChoice();
    }

    public abstract int resultOfSpin();

    public int getCashIn() {
        return this.cashIn;
    }

    public int getPlayerStake() {
        return this.playerStake;
    }

    public void getCashInFromPlayer(int cash) {
        this.cashIn += cash;
        this.playerStake += cash;
    }

    public void transferWinningsToPlayer(Player player) {
        player.getWinningsFromMachine(this.payout);
    }


    public int getStake() {
        return this.stake;
    }

    public int getPayout() {
        return this.payout;
    }

    public void enoughCashToPlayGame() {
        if (this.playerStake >= this.stake) {
            this.playerStake -= this.stake;
        }
    }

    public void outOfFunds() {
        if (this.playerStake > this.stake) {
            generateThreeWheels();
        }
    }


    public String getName() {
        return this.name;
    }


    public void playGame(FruitMachine fruitMachine) {
        while (fruitMachine.getPlayerStake() > 0) {
            char playAgain;
            fruitMachine.enoughCashToPlayGame();
            fruitMachine.outOfFunds();
            fruitMachine.generateThreeWheels();
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

    }
//    public boolean generateReels(this.reels){
//            ArrayList<Integer> countReels = new ArrayList<>();
//            for (int x = 0; x < reels; x++) {
//                countReels.add(getRandomReels());
//            }


//
//    public int getReels() {
//            return this.reels;
//    }
}








