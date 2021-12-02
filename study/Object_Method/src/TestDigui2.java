/*
算n的阶乘
 */
public class TestDigui2 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int n=20;
        long result;
        result=factorial(n);
        long endTime=System.currentTimeMillis();
        System.out.println(result);
        System.out.println("耗时："+(endTime-startTime));
    }

    public static long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
