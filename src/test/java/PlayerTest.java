import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(10, 1,1);
    }

    @Test
    public void checkPlayerHasCash(){
        assertEquals(10, player.playerPutsCashIntoMachine());
    }

    @Test
    public void playerCanPlaceBet(){
        assertEquals(1, player.playerPlaysGame());
    }

    @Test
    public void checkCashDecreasesWhenBetPlaced(){
        assertEquals(9, player.decreaseCashWhenBetPlaced());
    }

    @Test
    public void checkWinningsCanBeAddedToCash(){
        assertEquals(11, player.checkWinningsCanBeAddedToCash());
    }
}
