package patterns;

import oop.patterns.Counter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    @Test
    void shouldIIncrementCounter(){
        Counter counterOne = Counter.getInstance();
        counterOne.incrementCounter();

        Counter counterTwo = Counter.getInstance();
        counterOne.incrementCounter();

        assertEquals(counterTwo, counterOne);
    }
}
