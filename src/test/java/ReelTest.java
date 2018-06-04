import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReelTest {

    Reel reel1;
    Reel reel2;
    Reel reel3;

    @Before
    public void before(){

        reel1= new Reel(FruitType.CHERRIES);
        reel2= new Reel(FruitType.LEMONS);
        reel3= new Reel(FruitType.ORANGES);
    }

    @Test
    public void hasReel1(){
        assertEquals(FruitType.CHERRIES, reel1.setReelOneChoice());
    }

    @Test
    public void hasReel2(){
        assertEquals(FruitType.LEMONS, reel2.setReelTwoChoice());
    }

    @Test
    public void hasReel3(){
        assertEquals(FruitType.ORANGES, reel3.setReelThreeChoice());
    }




}
