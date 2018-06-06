import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    TheHouseAlwaysWinMachine theHouseAlwaysWinMachine;

    @Before
    public void before(){
        player = new Player(10);
        theHouseAlwaysWinMachine = new TheHouseAlwaysWinMachine("The House Always Win");
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


    @Test
    public void hasWinningsInFromMachine(){
//
        assertEquals(5, player.getWinningsFromMachine(theHouseAlwaysWinMachine.getPayout()));
    }

}
