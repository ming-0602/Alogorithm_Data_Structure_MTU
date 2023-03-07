import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean isPalindrome(int x){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = 0; i < String.valueOf(x).length(); i++) {
            list.add(String.valueOf(String.valueOf(x).charAt(i)));
        }
        int sizeoflist = list.size();
        int tem = list.size()-1;
        for(int i = 0; i < sizeoflist; i++){
            reverse.add(list.get(tem));
            tem--;
        }
//
        int result = Integer.parseInt(String.join("", reverse));

        if(result == x){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));


//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> reverse = new ArrayList<>();
//        for (int i = 0; i < String.valueOf(1221).length(); i++) {
//            list.add(String.valueOf(String.valueOf(1221).charAt(i)));
//        }
//        int sizeoflist = list.size();
//        int tem = list.size()-1;
//        for(int i = 0; i < sizeoflist; i++){
//            reverse.add(list.get(tem));
//            tem--;
//        }
////
//        int result = Integer.parseInt(String.join("", reverse));
//        System.out.println(result);
    }
}