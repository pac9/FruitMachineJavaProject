public class Player {

    private int cash;
    private int costToPlayGame;
    private int winnings;

    public Player(int cash, int costToPlayGame, int winnings){
        this.cash = cash;
        this.costToPlayGame = costToPlayGame ;
        this.winnings = winnings;
    }

    public int playerPutsCashIntoMachine(){
        return this.cash;
    }

    public int playerPlaysGame(){
        return this.costToPlayGame;
    }

    public int decreaseCashWhenBetPlaced(){
        return this.cash - this.costToPlayGame;
    }

    public int checkWinningsCanBeAddedToCash(){
        return this.cash + this.winnings;
    }

}
