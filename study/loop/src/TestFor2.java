/*
 * 可以同时传入两个参数，在for循环里使用
 *
 */
public class TestFor2 {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }
    }
}
