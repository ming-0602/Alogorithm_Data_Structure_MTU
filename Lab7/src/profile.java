import java.util.Arrays;
import java.util.Random;

public class profile {
    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length-1; i++){
            int val = a[i];
            int j = i -1;
            while(j >= 0 && a[j] > val){
                a[j+ 1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
    }


    public static void MergeSort(int[] a){
        if(a.length <= 1 ){return;}
        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length+i];
        }



        MergeSort(first);
        MergeSort(second);
        merge(first, second, a);

    }


    public static void merge(int[] first, int[] second, int[] a){
        int ifirst = 0 ; int isecond = 0; int j = 0;
        while(ifirst < first.length && isecond < second.length){
            if (first[ifirst] < second[isecond]){
                a[j] = first[ifirst];
                ifirst++;
            }
            else {
                a[j] = second[isecond];
                isecond++;
            }
            j++;
        }
        while(ifirst < first.length){
            a[j] = first[ifirst];
            ifirst++;
            j++;
        }

        while(isecond < second.length){
            a[j] = second[isecond];
            isecond++;
            j++;
        }
    }

    public static void selectionsort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    int tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                }

            }

        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] a = new int[50000];
        int[] b = new int[50000];
        int[] c = new int[50000];
        int[] d = new int[50000];

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(0,100);
            b[i] = rnd.nextInt(0,100);
            c[i] = rnd.nextInt(0,100);
            d[i] = rnd.nextInt(0,100);

        }

//        long startTime = System.nanoTime();
//        selectionsort(a);
//        long stopTime = System.nanoTime();
//        System.out.println(stopTime - startTime);

        long startTime = System.currentTimeMillis();
        selectionsort(a);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        long startTime1 = System.currentTimeMillis();
        selectionsort(a);
        long stopTime1 = System.currentTimeMillis();
        System.out.println(stopTime1 - startTime1);

        long startTime2 = System.currentTimeMillis();
        selectionsort(b);
        long stopTime2 = System.currentTimeMillis();
        System.out.println(stopTime2 - startTime2);

        long startTime3 = System.currentTimeMillis();
        selectionsort(b);
        long stopTime3 = System.currentTimeMillis();
        System.out.println(stopTime3 - startTime3);

        long startTime4 = System.currentTimeMillis();
        selectionsort(c);
        long stopTime4 = System.currentTimeMillis();
        System.out.println(stopTime4 - startTime4);

        long startTime5 = System.currentTimeMillis();
        selectionsort(c);
        long stopTime5 = System.currentTimeMillis();
        System.out.println(stopTime5 - startTime5);

        long startTime6 = System.currentTimeMillis();
        Arrays.sort(d);
        long stopTime6 = System.currentTimeMillis();
        System.out.println(stopTime6 - startTime6);

        long startTime7 = System.currentTimeMillis();
        Arrays.sort(d);
        long stopTime7 = System.currentTimeMillis();
        System.out.println(stopTime7 - startTime7);




    }
}
