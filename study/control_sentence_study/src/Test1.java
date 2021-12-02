public class Test1 {
    public static void main(String[] args) {
        //生成三个骰子
        int i=(int) (6*Math.random())+1;
        int j=(int) (6*Math.random())+1;
        int k=(int) (6*Math.random())+1;
        int count;
        count=i+j+k;
        if(count>15){
            System.out.println("手气不错");
        }
        if(count>10&&count<15){
            System.out.println("手气一般");
        }
        if(count<10){
            System.out.println("手气太差");
        }

        System.out.println("得了"+count+"分");
    }
}
