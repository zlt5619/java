import java.lang.reflect.Field;

public class Test05 {
    public static void main(String[] args) throws Exception {
        Class clazz = User.class;
        Field field = clazz.getField("username");
        System.out.println(field);
        System.out.println(field.getName());

        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }
        System.out.println("==============");
        fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }


    }
}
