import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void testInsertionSort(){
//        int[] a = {4,7,2,9,1,3};
        String[] a = {"boy","ball", "apple", "car", "train", "open"};
        MyArrays.insertionSort(a);
        String[] expected = {"apple","ball","boy","car","open","train"};
        assertEquals(Arrays.toString(expected), Arrays.toString(a));
    }

//    @Test
//    void testBinarySearch(){
//        int [] a = {2,4,6,1,7,3,8,10,9,5};
//        MyArrays.binarySearch(a);
//        int[] expected = {1,2,3,4,5,6,7,8,9,10};
//        assertEquals(Arrays.toString(expected),Arrays.toString(a));
//    }


}