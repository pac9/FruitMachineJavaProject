import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheHouseAlwaysWinMachineTest {

    TheHouseAlwaysWinMachine theHouseAlwaysWinMachine;
    FruitMachine fruitMachine;

    @Before
    public void before(){
        theHouseAlwaysWinMachine = new TheHouseAlwaysWinMachine("The House Always Wins");
    }

    @Test
    public void hasName(){
        assertEquals("The House Always Wins", theHouseAlwaysWinMachine.getName());
    }

}
