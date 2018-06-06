import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TheHouseAlwaysWinMachineTest {

    TheHouseAlwaysWinMachine theHouseAlwaysWinMachine;
    Player player;


    @Before
    public void before() {
        player = new Player(10);
        theHouseAlwaysWinMachine = new TheHouseAlwaysWinMachine("The House Always Wins");
    }

    @Test
    public void hasName() {
        assertEquals("The House Always Wins", theHouseAlwaysWinMachine.getName());
    }

    @Test
    public void hasCashIn() {
        assertEquals(0, theHouseAlwaysWinMachine.getCashIn());
    }

    @Test
    public void hasStake() {
        assertEquals(1, theHouseAlwaysWinMachine.getStake());
    }

    @Test
    public void hasPayout() {
        assertEquals(0, theHouseAlwaysWinMachine.getPayout());
    }

    @Test
    public void hasPlayerStake() {
        assertEquals(0, theHouseAlwaysWinMachine.getPlayerStake());
    }


    @Test
    public void hasReel1() {
        Enum outcome = theHouseAlwaysWinMachine.setReelOneChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel2() {
        Enum outcome = theHouseAlwaysWinMachine.setReelTwoChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel3() {
        Enum outcome = theHouseAlwaysWinMachine.setReelThreeChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasOutcomeOfSpins() {
        theHouseAlwaysWinMachine.setReelTwoChoice();
        theHouseAlwaysWinMachine.setReelOneChoice();
        theHouseAlwaysWinMachine.setReelThreeChoice();

        assertEquals(0, theHouseAlwaysWinMachine.resultOfSpin());
        //this is on assumption that player loses. Need to find a better way to prove this test as
        //currently proving this via the debugger.
    }

    @Test
    public void canGetCashInFromPlayer(){
        assertEquals(10, theHouseAlwaysWinMachine.getCashInFromPlayer(player.getCash()));
    }

    @Test
    public void hasRandomReelChoice(){
        Enum outcome = theHouseAlwaysWinMachine.randomiseReelChoice();
        assertNotNull(outcome);
    }

}





