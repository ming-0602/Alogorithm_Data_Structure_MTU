import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void insert(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        int testresult = MyArrays.insert(arr, 3, 2, 1);
        assertEquals(4, testresult);





    }


}