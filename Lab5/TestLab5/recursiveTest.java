import org.junit.jupiter.api.Test;


import static java.lang.Long.sum;
import static org.junit.jupiter.api.Assertions.*;


class recursiveTest {

    @Test
    void testmyPow(){
        double input = recursive.myPow(3, 5);
        assertEquals(243.0, input);
    }

    @Test
    void testreverseString(){
        String input = recursive.reverseStr("Hello");
        assertEquals("olleH",input);
        System.out.println(input);
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

    @Test
    void testsum(){
        int[] input = {1,2,3,4};
        int values = recursive.sum(input);
        assertEquals(10, values);
    }


}