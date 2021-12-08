/*
通过Class类的forName方法
 */
public class Test03 {
    public static void main(String[] args) {
        Class clazz = null;
        try {
            clazz = Class.forName("User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz);
    }
}
