import java.lang.reflect.Field;

public class Test06 {
    public static void main(String[] args) throws Exception {
        Class clazz = User.class;
        Field field = clazz.getField("username");
        //为成员变量输入值
        Object obj = clazz.newInstance();
        field.set(obj, "zlt");
        Object o = field.get(obj);
        System.out.println(o);


    }
}
