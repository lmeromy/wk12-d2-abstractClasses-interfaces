import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuJaneTest {

    Jane jane;
    Bob bob;

    @Before

    public void setup(){
        jane = new Jane("Jane", 85, 15);
        bob = new Bob("Bob", 100, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", jane.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(85, jane.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(15, jane.getAttackValue());
    }

    @Test
    public void janeCanRoar(){
        assertEquals("ROAR!", jane.roar());
    }

    @Test
    public void canAttack(){
        jane.attack(bob);
        assertEquals(85, bob.getHealthValue());
    }

    @Test
    public void canBeAttacked(){
        bob.attack(jane);
        assertEquals(75, jane.getHealthValue());
    }

    @Test
    public void canFly(){
        assertEquals("Zoom zoom zoom!", jane.fly());
    }
}
