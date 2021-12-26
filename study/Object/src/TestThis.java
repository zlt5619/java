public class TestThis {
    int a, b, c;

    TestThis() {
        System.out.println("正要初始化的对象" + this);
    }

    TestThis(int a, int b) {
        ////调用无参的构造方法，必须放第一行
        this();
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c) {
        //调用带参的构造方法，必须放第一行
        this(a, b);
        this.c = c;
    }

    void sing() {

    }

    void eat() {
        System.out.println(this);
        sing();

    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(1, 2);
        hi.eat();
    }
}
