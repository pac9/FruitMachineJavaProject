import java.util.Random;

public abstract class FruitMachine {

    protected int payout;
    protected Enum reelOneChoice;
    protected Enum reelTwoChoice;
    protected Enum reelThreeChoice;
    private int cashIn;
    private int stake;
    private int playerStake;
    private String name;


    public FruitMachine(String name) {

        this.cashIn = cashIn;
        this.stake = 1;
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;
        this.payout = payout; //or should this be 0 at initialisation
        this.playerStake = playerStake;
        this.name = name;
    }

    public Enum randomiseReelChoice(){
//

        FruitType[] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

    public void generateThreeWheels() {
////        this.reelOneChoice;
////        this.reelTwoChoice;
////        this.reelThreeChoice;
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

    public int resultOfSpin() {
        if (reelOneChoice.equals(FruitType.CHERRIES) && reelTwoChoice.equals(FruitType.CHERRIES) && reelThreeChoice.equals(FruitType.CHERRIES)) {
            payout += 5;
            System.out.println("You have won £5");
            return payout;
        } else if (reelOneChoice.equals(FruitType.LEMONS) && reelTwoChoice.equals(FruitType.LEMONS) && reelThreeChoice.equals(FruitType.LEMONS)) {
            payout += 7;
            System.out.println("You have won £7");
            return payout;
        } else if (reelOneChoice.equals(FruitType.ORANGES) && reelTwoChoice.equals(FruitType.ORANGES) && reelThreeChoice.equals(FruitType.ORANGES)) {
            payout += 6;
            System.out.println("You have won £6");
            return payout;
        } else {
            System.out.println("Oh dear! You have lost");
            return getPayout();


        }

    }

    public int getCashIn() {
        return this.cashIn;
    }

    public int getPlayerStake() {
        return this.playerStake;
    }


    public int getCashInFromPlayer(int cash) {
        this.cashIn += cash;
        return this.playerStake += cash;
    }

    public int getStake() {
        return this.stake;
    }

    public int getPayout() {
        return this.payout;
    }

    public void enoughCashToPlayGame() {
//        int stakeRequired = fruitMachine.getStake();
        if (this.playerStake >= this.stake) {
            this.playerStake -= this.stake;

//            fruitMachine.getCashInFromPlayer(stakeRequired);
        }
//        System.out.println("You have insufficient funds to play this game");


    }

    public void outOfFunds(){
        if (this.playerStake > this.stake){
            generateThreeWheels();}
    }

    public void transferWinningsToPlayer(Player player){
        player.getWinningsFromMachine(this.payout);
    }

    public String getName(){
        return this.name;
    }
}






