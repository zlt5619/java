import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class clazz = User.class;
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("==============");
        Method m = clazz.getMethod("setName", String.class);
        System.out.println(m.getName());
        System.out.println("==============");
        Object o = clazz.newInstance();
        m.invoke(o, "oldlu");
        Method method1 = clazz.getMethod("getName");
        Object value = method1.invoke(o);
        System.out.println(value);

    }
}
