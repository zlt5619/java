import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz=User.class;
        Method[] methods=clazz.getMethods();
        for(Method m:methods){
            System.out.println(m.getName());
        }
        methods=clazz.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(m.getName());
        }
        System.out.println("==============");
        Method m=clazz.getMethod("setName",String.class);
        System.out.println(m.getName());

    }
}
