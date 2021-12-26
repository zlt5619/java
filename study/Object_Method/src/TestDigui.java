/*
会报错，无法结束递归
 */
public class TestDigui {
    public static void main(String[] args) {
        aa();
    }

    public static void aa() {
        System.out.println("aa");
        bb();
    }

    public static void bb() {
        System.out.println("bb");
        aa();
    }
}
