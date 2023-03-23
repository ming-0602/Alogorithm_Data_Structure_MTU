import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int cnt = 0;
        int[][] numarray = new int[2][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                numarray[j][i] = cnt;
                cnt++;
            }
        }

        display(numarray);

//        System.out.println(numarray[1][2]);

        System.out.println(numarray[0].length);



    }

    public static void display(int[][] array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }


}
