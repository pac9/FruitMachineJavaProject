import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    TheHouseAlwaysWinMachine theHouseAlwaysWinMachine;

    FruitMachine fruitMachine;

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

    @Test
    public void hasWinningsInFromMachine(){
    player.getWinningsFromMachine(theHouseAlwaysWinMachine.getPayout());
        assertEquals(0, player.getWinnings());
    }
    //result assumes there is no payout but payout is random so should consider this in test

}
