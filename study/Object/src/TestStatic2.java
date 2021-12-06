public class TestStatic2 {
    static String company="QQ";
    static{

        System.out.println("执行静态初始化工作");
        company="sxt";
        System.out.println(company);
    }

    public static void main(String[] args) {

    }
}
