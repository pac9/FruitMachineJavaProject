import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine(1);
        player = new Player(10, fruitMachine.getStake(),1);
    }

    @Test
    public void checkPlayerHasCash(){
        assertEquals(10, player.playerPutsCashIntoMachine());
    }

    @Test
    public void checkPlayerHasWinnings(){
    assertEquals(1, player.playerHasWinnings());}

    @Test
    public void checkCashDecreasesWhenBetPlaced(){
        assertEquals(9, player.decreaseCashWhenBetPlaced());
    }

    @Test
    public void checkWinningsCanBeAddedToCash(){
        assertEquals(11, player.checkWinningsCanBeAddedToCash());
    }

    @Test
    public void hasStake(){
        assertEquals(1, player.getStake());
    }
}
