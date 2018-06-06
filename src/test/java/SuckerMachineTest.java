import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SuckerMachineTest {

    SuckerMachine suckerMachine;
    Player player;

    @Before
    public void before() {
        player = new Player(10);
        suckerMachine = new SuckerMachine("Suckers");
    }

    @Test
    public void hasName() {
        assertEquals("Suckers", suckerMachine.getName());
    }

    @Test
    public void hasCashIn() {
        assertEquals(0, suckerMachine.getCashIn());
    }

    @Test
    public void takeCashInFromPlayer(){
        suckerMachine.getCashInFromPlayer(player.getCash());
        assertEquals(10, suckerMachine.getCashIn());
    }

    @Test
    public void hasStake() {
        assertEquals(1, suckerMachine.getStake());
    }

    @Test
    public void hasPayout() {
        assertEquals(0, suckerMachine.getPayout());
    }

    @Test
    public void hasPlayerStake() {
        assertEquals(0, suckerMachine.getPlayerStake());
    }


    @Test
    public void hasReel1() {
        Enum outcome = suckerMachine.setReelOneChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel2() {
        Enum outcome = suckerMachine.setReelTwoChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel3() {
        Enum outcome = suckerMachine.setReelThreeChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasOutcomeOfSpins() {
        suckerMachine.setReelTwoChoice();
        suckerMachine.setReelOneChoice();
        suckerMachine.setReelThreeChoice();

        assertEquals(0, suckerMachine.resultOfSpin());
        //this is on assumption that player loses. Need to find a better way to prove this test as
        //currently proving this via the debugger.
    }

    @Test
    public void hasRandomReelChoice(){
        Enum outcome = suckerMachine.randomiseReelChoice();
        assertNotNull(outcome);
    }

}







