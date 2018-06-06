import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FruitMachineTest {

    FruitMachine fruitMachine;
    Player player;

    @Before
    public void before() {
        fruitMachine = new FruitMachine();
    }

    @Test
    public void hasReel1() {
        FruitType outcome = fruitMachine.setReelOneChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel2() {
        FruitType outcome = fruitMachine.setReelTwoChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasReel3() {
        FruitType outcome = fruitMachine.setReelThreeChoice();
        assertNotNull(outcome);
    }

    @Test
    public void hasOutcomeOfSpins() {
        fruitMachine.setReelTwoChoice();
        fruitMachine.setReelOneChoice();
        fruitMachine.setReelThreeChoice();

        assertEquals(0, fruitMachine.resultOfSpin());
        //this is on assumption that player loses. Need to find a better way to prove this test as
        //currently proving this via the debugger.

    }

    @Test
    public void hasCashInFromPlayer(){
        player = new Player(5);
//         player.insertCashIntoFruitMachine(fruitMachine);
//        player.enoughCashToPlayGame(fruitMachine);
        assertEquals(5, fruitMachine.getCashInFromPlayer(player.getCash()));
    }

    @Test
    public void hasStake(){
        assertEquals(1, fruitMachine.getStake());
    }

    @Test
    public void hasPayout(){
        assertEquals(0, fruitMachine.getPayout());
    }

    @Test
    public void hasCashIn(){
        assertEquals(0, fruitMachine.getCashIn());
    }

    @Test
    public void hasPlayerStake(){
        assertEquals(0, fruitMachine.getPlayerStake());
    }
}



