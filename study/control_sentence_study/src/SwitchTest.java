public class SwitchTest {
    public static void main(String[] args) {
        int grade=(int) (4*Math.random())+1;
        switch (grade){
            case 1:
                System.out.println("大学一年级");
                break;
            case 2:
                System.out.println("大学二年级");
                break;
            case 3:
                System.out.println("大学三年级");
                break;
            default:
                System.out.println("要毕业了");
                break;
        }
    }
}
