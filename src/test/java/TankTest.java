import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Bob bob;

    @Before
    public void setup(){
        tank = new Tank("tank", 110, 7);
        bob = new Bob("Bob", 100, 10);
    }

    @Test
    public void canGetType(){
        assertEquals("tank", tank.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(110, tank.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(7, tank.getAttackValue());
    }

    @Test
    public void canAttack(){
        tank.attack(bob);
        assertEquals(93, bob.getHealthValue());
    }

    @Test
    public void canBeAttacked(){
        bob.attack(tank);
        assertEquals(100, tank.getHealthValue());
    }


}
