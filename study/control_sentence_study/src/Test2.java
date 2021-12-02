public class Test2 {

    public static void main(String[] args) {
        double r=4*Math.random();
        double area=Math.PI*r*r;
        double circle=2*Math.PI*r;

        System.out.println("半径:"+r);
        System.out.println("周长:"+circle);
        System.out.println("面积:"+area);

        if (circle>area){
            System.out.println("周长数值大于面积数值");
        }else {
            System.out.println("面积数值大于周长数值");
        }
    }
}
