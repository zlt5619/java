public class TestStatic {
    int id;
    String name;

    static String company = "北京尚学堂";

    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic u = new TestStatic(101, "zlt");
        TestStatic.printCompany();
        TestStatic.company = "阿里";
        TestStatic.printCompany();
    }
}
