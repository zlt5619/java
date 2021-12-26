public class Test08 {
    public static void main(String[] args) {
        Class clazz = User.class;
        //获取类名
        String className = clazz.getName();
        System.out.println(className);
        //获取包名
//        Package p = clazz.getPackage();
//        System.out.println(p.getName());
        //获取超类
        Class superClass = clazz.getSuperclass();
        System.out.println(superClass.getName());
        //获取该类实现的所有接口
        Class[] interfaces = clazz.getInterfaces();
        for (Class inter : interfaces) {
            System.out.println(inter.getName());
        }
        System.out.println("end");
    }
}
