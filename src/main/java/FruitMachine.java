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
        this.payout = payout;
        this.playerStake = playerStake;
        this.name = name;
    }

    public Enum randomiseReelChoice(){
        FruitType[] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

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
        if (this.playerStake >= this.stake) {
            this.playerStake -= this.stake;
        }
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






