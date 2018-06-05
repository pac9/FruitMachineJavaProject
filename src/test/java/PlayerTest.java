import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine(1);
        player = new Player(10, fruitMachine.getStake(), fruitMachine.getPayout());
    }

    @Test
    public void checkPlayerHasCash(){
        assertEquals(10, player.getCash());
    }

    @Test
    public void checkPlayerHasWinnings(){
    assertEquals(0, player.getWinnings());}

    @Test
    public void checkCashDecreasesWhenBetPlaced(){
        assertEquals(9, player.decreaseCashWhenBetPlaced());
    }

    @Test
    public void checkWinningsCanBeAddedToCash(){
        assertEquals(10, player.checkWinningsCanBeAddedToCash());
    }

    @Test
    public void hasStake(){
        assertEquals(1, player.getStake());
    }
}
