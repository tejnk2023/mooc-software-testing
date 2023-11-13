package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy g;

    @BeforeEach
    public void initialize() {
        this.g = new GHappy();
    }

    @Test
    public void oneHappyg() {
        Assertions.assertTrue(g.gHappy("xxggxx"));
    }

    @Test
    public void noHappyg() {
        Assertions.assertFalse(g.gHappy("xxgxx"));
    }

    @Test
    public void oneHappyOneUnhappyg() {
        Assertions.assertFalse(g.gHappy("xxggyygxx"));
    }
    @Test
    public void startHappyg() {
        Assertions.assertTrue(g.gHappy("ggxx"));
    }

    @Test
    public void endHappyg() {
        Assertions.assertTrue(g.gHappy("xxyygg"));
    }

}
