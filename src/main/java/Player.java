public class Player {

    private int cash;
    private int winnings;


    public Player(int cash){
        this.cash = cash;
        this.winnings = winnings;
    }

    public int getCash(){
        return this.cash;
    }

    public int getWinnings(){
        return this.winnings;
    }


    public int checkWinningsCanBeAddedToCash(){
        return this.cash + this.winnings;
    }

    public void insertCashIntoFruitMachine(FruitMachine fruitMachine){
        fruitMachine.getCashInFromPlayer(this.cash);

    }

    public int getWinningsFromMachine(int payout) {
        return this.winnings += payout;
    }
}
