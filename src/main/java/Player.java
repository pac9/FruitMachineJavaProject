public class Player {

    private int cash;
    private int winnings;
    private int stake;

    public Player(int cash, int stake, int winnings){
        this.cash = cash;
        this.stake = stake;
        this.winnings = winnings;
    }

    public int getCash(){
        return this.cash;
    }

    public int getWinnings(){
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

    public void enoughCashToPlayGame(FruitMachine fruitMachine){
        int stakeRequired = fruitMachine.getStake();
        if (this.cash >= stakeRequired){
            this.cash -= stakeRequired;
            fruitMachine.getCashInFromPlayer(stakeRequired);
        }
    }


}
