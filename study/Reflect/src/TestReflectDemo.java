import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ReflectDemo rd = new ReflectDemo();
        if (args != null && args.length > 1) {
            Class clazz = ReflectDemo.class;
            Method[] methods = clazz.getMethods();
            for (String str : args) {
                for (int i = 0; i < methods.length; i++) {
                    if (str.equalsIgnoreCase(methods[i].getName())) {
                        methods[i].invoke(rd);
                        break;
                    }
                }
            }
        } else {
            rd.method1();
            rd.method2();
            rd.method3();
        }
    }
}
