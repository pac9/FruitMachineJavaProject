import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine();
        player = new Player(10, fruitMachine.getPayout());
    }

    @Test
    public void checkPlayerHasCash(){
        assertEquals(10, player.getCash());
    }
 
    @Test
    public void checkPlayerHasWinnings(){
    assertEquals(0, player.getWinnings());}

//    @Test
//    public void checkCashDecreasesWhenBetPlaced(){
//        assertEquals(9, player.decreaseCashWhenBetPlaced());
//    }

    @Test
    public void checkWinningsCanBeAddedToCash(){
        assertEquals(10, player.checkWinningsCanBeAddedToCash());
    }


}
