public class TestOverLoad {
    public static void main(String[] args) {
        add();
        int a=10;
        add(a);
    }

    static void add(){
        System.out.println("方法一");
    }

    static void add(int a){
        System.out.println("方法2");
    }
}
