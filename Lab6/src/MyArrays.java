import java.util.Arrays;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class MyArrays {
    public static void insertionSort(int[] a){
        int len = a.length;
        //if move to right can use a[j +1] = a [j]
        for(int i = 1; i < (len); i++){
            int j = i;
//            int val = a[i];
            while(j > 0 && a[j] < a[j-1]){
                int temp = a[j]; //store the value into a variable
                a[j] = a[j-1]; //declare emlement into element -1
                a[j-1] = temp;//make temp element and element -1 swap space
//                a[j+1] = a[j];
                j -= 1;
//                a[j+1] = val;


            }
        }
    }

    public static void binarySearch(int[] a){
        for(int i = 0; i < a.length -1; i++){
            int index = i;
            if (a[i] < a[index+1]){
                int temp = a[i];
                a[index] = a[index-1];
                a[index-1] = temp;
                index -=1;
            }
        }
    }




}
