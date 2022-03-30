import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

    CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Test
    public void isOn() {
        assertEquals(false,coffeeMaker.isOn());
        coffeeMaker.turnOn();
        assertEquals(true,coffeeMaker.isOn());
    }

    @Test
    public void addCoffee() {
        coffeeMaker.addCoffee(10);
        assertEquals(10,coffeeMaker.getScoopsCoffee());
    }

    @Test
    public void addWater() {
        coffeeMaker.addWater(10);
        assertEquals(10,coffeeMaker.getCupsWater());
    }

    @Test
    public void brewCoffee() {
        coffeeMaker.brewCoffee();
        assertEquals(false, coffeeMaker.isOn());
        assertEquals(0, coffeeMaker.getCupsWater());
    }

    @Test
    public void pour() {
        coffeeMaker.setCupsCoffee(10);
        coffeeMaker.pour(5);
        assertEquals(5,coffeeMaker.getCupsCoffee());
        coffeeMaker.setCupsCoffee(10);
        coffeeMaker.pour(15);
    }
}