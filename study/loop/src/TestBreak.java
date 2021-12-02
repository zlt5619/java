public class TestBreak {
    public static void main(String[] args) {
        int count=0;
        while(true){
            count++;
            int i= (int) (100*Math.random());
            if(i==88){
                break;
            }
        }
        System.out.println("used"+count+"次");
    }
}
