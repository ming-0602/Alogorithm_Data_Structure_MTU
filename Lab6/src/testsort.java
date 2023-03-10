public class testsort {
    public static void main(String[] args) {
        int[] a = {4,2,3,5,1};
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
}
