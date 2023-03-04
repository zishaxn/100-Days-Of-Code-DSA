package arrays;

public class Day19_Pow {
    public static void main(String[] args) {
        double x = 1;
        int n = 2147483647;
        System.out.println(myPowBrute(x, n));
    }

    private static double myPow(double x, int n) {
        double ans = 1.00;
        long nn = n;
        if(nn<0){
            nn=-1*nn;
        }
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0){
            ans=1.00/ans;
        }
        return ans;
    }

    public static double myPowBrute(double x, int n) {
        double ans = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                ans = x * ans;
            }
            return ans;
        }
        else{
            for (int i = n; i < 0 ; i++) {
                ans=ans*x;
            }
            return 1/ans;
        }
    }
}
