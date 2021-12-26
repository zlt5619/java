/*
使用嵌套循环，打印输出 5*5 的方阵，格式如下：
 * # * # *
 # * # * #
 * # * # *
 # * # * #
 * # * # *
 */
public class TestFor5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 25; i++) {
            if (i % 2 == 0) {
                System.out.print("*" + " ");
            } else {
                System.out.print("#" + " ");
            }
            if (count == 4) {
                System.out.println();
                count = -1;
            }
            count++;
        }
    }
}
