public class MyMath {
    //Return the Smallest Number
    public static int smallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    //Find the Value After power (Negative && Positive)
    public static double power(int a, double b){
        int i; int ans;
        if(b > 0){
            ans = 1;
            for(i = 0; i < b; i++){
                ans *= a;
            }
            return ans;
        }else{//for negative value
            ans = a;
            for(i = 0; i > b; i--){
                ans*= a;
            }
            double negative = 1/ans;
            return negative;
        }
    }


    public static int SumofNumber(int a) {
        int i;int tem = 0;
        for (i = 0; i <= a; i++) {
            tem += i;
        }
        return tem;
    }




}
