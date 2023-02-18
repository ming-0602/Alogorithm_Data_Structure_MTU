import java.util.Arrays;
import java.util.StringJoiner;

public class recursive {
    public static double myPow(double x, int y) {
        if (y == 1) {
            return x;
        }
//        return myPow(x, --y) * x;
        return myPow(x, y-1) * x; //y is number of times * x
    }


    public static String reverseStr(String str) {
        if(str.length() == 0) return str;
        return reverseStr(str.substring(1)) + str.charAt(0);
    }


    public static int sum(int[] value) {
        if (value.length == 1) return value[0];
        int[] para_array = Arrays.copyOf(value, value.length - 1);
        return sum(para_array) + value[value.length - 1];
    }




}
