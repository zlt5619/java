public class TestMethod1 {
    public static void main(String[] args) {
        love();
        int a=10;
        int b=20;
        int sum;
        sum=addNum(a,b);
        System.out.println(sum);
    }

    public static void love(){
        System.out.println("I Love You");
        System.out.println("我爱你");
    }

    public static int addNum(int a,int b){
        return a+b;
    }
}
