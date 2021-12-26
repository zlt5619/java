/*
1) 通过键盘输入用户的月薪，每年是几个月薪水。
(2) 输出用户的年薪
(3) 输出一行字“如果年薪超过 10 万，恭喜你超越 90%的国人”，“如果年薪超过 20 万，恭喜你超越 98%的国人”。
(4) 键盘输入数字 88，则退出程序（使用 break 退出循环）
 */

import java.util.Scanner;

public class AnuualSalaryDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*****我的薪水计算器******");
        System.out.println("1、输入88，退出程序\n");

        while (true) {
            System.out.println("请输入月薪");
            int monthSalary = s.nextInt();
            int yearSalary = monthSalary * 12;
            if (monthSalary == 88) {
                break;
            }
            System.out.println("你的年薪是：" + yearSalary);
            if (yearSalary > 100000) {
                System.out.println("你的工资打败了中国90%的人");
            }

        }
    }
}
