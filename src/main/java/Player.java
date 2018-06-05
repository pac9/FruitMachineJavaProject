public class Player {

    private int cash;
    private int winnings;
    private int stake;

    public Player(int cash, int stake, int winnings){
        this.cash = cash;
        this.stake = stake;
        this.winnings = winnings;
    }

    public int playerPutsCashIntoMachine(){
        return this.cash;
    }

    public int playerHasWinnings(){
        return this.winnings;
    }

    public int decreaseCashWhenBetPlaced(){
        return this.cash - this.stake;
    }

    public int checkWinningsCanBeAddedToCash(){
        return this.cash + this.winnings;
    }

    public int getStake(){
        return this.stake;
    }


}
