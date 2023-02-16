import java.util.Arrays;
import java.util.StringJoiner;

public class recursive {
    public static double myPow(double x, int y) {
        if (y == 1) {
            return x;
        }
        return myPow(x, --y) * x;
    }

    public static String reverse(String str) {
        if (str.length() == 1) return str;

        String[] arr = str.split("");
        String[] newarr = new String[arr.length];
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[index];
            index--;
        }
        String s = String.join("", newarr);
        return s;

    }

//    public static int sum(int[] values){
//        int length = values.length;
//        int sum = 0;
//        for(int i = 0; i < length; i++){
//            sum += values[i];
//        }
//        return sum;
//    }
//
//    public static int[] copyOf(int[] original){
////        if(original.length == 1) return original;
////        int[] tem = new int[original.length];
////        int index = original.length-1;
////        for(int i = 0; i < index-1; i++){
////            tem[i] = original[index];
////        }
////        return tem;
//
//
//
//    }

    public static int sum(int[] value) {
        if (value.length == 1) return value[0];
        int[] para_array = Arrays.copyOf(value, value.length - 1);
        return sum(para_array) + value[value.length - 1];
    }


}
