import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KaijuBobTest {

    Bob bob;
    Jet jet;

    @Before

    public void setup(){
        bob = new Bob("Bob", 100, 10);
        jet = new Jet("fighter jet", 140, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", bob.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, bob.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(10, bob.getAttackValue());
    }

    @Test
    public void bobCanRoar(){
        assertEquals("ROAR!", bob.roar());
    }

    @Test
    public void canAttack(){
        bob.attack(jet);
        assertEquals(130, jet.getHealthValue());
    }

    @Test
    public void canBeAttacked(){
        jet.attack(bob);
        assertEquals(80, bob.getHealthValue());
    }

    @Test
    public void canFly(){
        assertEquals("Weeeeee! I'm flying!", bob.fly());
    }


}
