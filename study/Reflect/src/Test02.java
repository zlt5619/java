/*
通过class静态属性获取class对象
 */

public class Test02 {
    public static void main(String[] args) {
        Class clazz = User.class;
        System.out.println(clazz);
        System.out.println(clazz.getName());
    }
}
