import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
    public static void main(String[] args) {
        Class clazz=User.class;
        try {
            Constructor constructor=clazz.getConstructor(String.class,int.class);
            Object o=constructor.newInstance("zlt",18);
            User user=(User) o;
            System.out.println(user.getName()+"\t"+user.getAge());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
