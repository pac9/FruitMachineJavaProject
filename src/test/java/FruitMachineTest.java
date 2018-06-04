import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine();}

    @Test
    public void hasOutcomeOfSpins(){
        fruitMachine.setReelTwoChoice();
        fruitMachine.setReelOneChoice();
        fruitMachine.setReelThreeChoice();

        assertEquals(0, fruitMachine.resultOfSpin());



    }


}
