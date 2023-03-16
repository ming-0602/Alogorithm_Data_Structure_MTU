import java.util.Arrays;

public class mergesort {
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

    public static void main(String[] args) {
        int[] a = {1,4,2,5,7,3,6};
        MergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}
