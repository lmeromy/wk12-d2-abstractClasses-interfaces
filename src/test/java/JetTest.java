import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JetTest {

    Jet jet;
    Bob bob;

    @Before
    public void setup(){
        jet = new Jet("fighter jet", 140, 20);
        bob = new Bob("Bob", 100, 10);
    }

    @Test
    public void canGetType(){
        assertEquals("fighter jet", jet.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(140, jet.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(20, jet.getAttackValue());
    }

    @Test
    public void canAttack(){
        jet.attack(bob);
        assertEquals(80, bob.getHealthValue());
    }

    @Test
    public void canBeAttacked(){
        bob.attack(jet);
        assertEquals(130, jet.getHealthValue());
    }
}
