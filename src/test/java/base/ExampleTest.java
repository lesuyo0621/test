package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleTest {

    @Test
    public void addTest(){
        Example ex = new Example();
        assertEquals(3, ex.add(1, 2));
    }

    @Test
    public void multipleTest(){
        Example ex = new Example();
        assertEquals(4, ex.multiple(2, 2));
    }

    @Test
    public void divideTest(){
        Example ex = new Example();
        assertEquals(2, ex.divide(4, 2));
    }
}
