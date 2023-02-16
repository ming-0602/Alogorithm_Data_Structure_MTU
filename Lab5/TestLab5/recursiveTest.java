import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class recursiveTest {

    @Test
    void testmyPow(){
        double input = recursive.myPow(3, 5);
        assertEquals(243.0, input);
    }

    @Test
    void testreverseString(){
        String input = recursive.reverse("Hello");
        assertEquals("olleH",input);
    }

    @Test
    void testarraylist(){
        int[] input = {1,2,3,4};
        assertEquals(10, recursive.sum(input));
    }

    @Test
    void testarray(){
        int[] input = {1,2,3,4};
        int[] expected = {1,2,3};
        assertEquals(expected,input);
    }


}