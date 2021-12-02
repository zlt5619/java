/**
 * 一个学生类
 */
public class SxtStu {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("学习中");
    }

    public void kickball() {
        System.out.println("踢球中");
    }

    //构造方法
    SxtStu(){

    }

    public static void main(String[] args) {
        SxtStu s1=new SxtStu();
    }
}
