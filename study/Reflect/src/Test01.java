/*

通过getClass方法获得class对象
 */

public class Test01 {
    public static void main(String[] args) {
        User u=new User();
        Class clazz=u.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getName());
    }
}
class User{
    private String name;
    private int age;
    public String username;
    public int userage;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void suibian(){ System.out.println("Hello Oldlu"); }
}
