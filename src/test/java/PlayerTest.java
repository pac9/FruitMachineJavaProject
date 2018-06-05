import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(10);
    }

    @Test
    public void checkPlayerHasCash(){
        assertEquals(10, player.checkPlayerHasCash());
    }
}
