import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    Building savoy;
    Jane jane;

    @Before
    public void setup(){
        savoy = new Building(100);
        jane = new Jane("Jane", 85, 15);
    }

    @Test
    public void buildingHasHealth(){
        assertEquals(100, savoy.getHealthValue());
    }

    @Test
    public void buildingCanBeAttacked(){
        jane.attack(savoy);
        assertEquals(85, savoy.getHealthValue());
    }
}
