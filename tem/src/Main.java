public class Main {
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

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}