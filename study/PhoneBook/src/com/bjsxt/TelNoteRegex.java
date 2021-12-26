package com.bjsxt;

import java.util.Scanner;

/*
数据校验类
 */
public class TelNoteRegex {
    /**
     * 对菜单输入选项的验证 *
     *
     * @param min
     * @param max
     * @return
     */
    public int menuItemValidate(int min, int max) {
        //定义验证菜单项的正则表达式
        String regex = "[1-9]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确数字，最小为：" + min + "," + "\t" + "最大为：" + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("您输入的菜单项不符，请重新输入！");
                }

            } else {
                System.out.println("输入数字错误，请检查！");
            }
        }

    }

    /*** 对用户输入姓名的验证 * @return */
    /* 对用户输入姓名的验证 * 字母可以是大写或者小写，长度 1-10 之间的 * @return */
    public String nameValidate() {
        String regex = "[a-zA-Z]{1,10}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的名字，全部由字母组成，可以包含大小写，长度在1-10位");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }


    }

    /*** 对用户输入年龄的验证 * 年龄的格式要求：10-99 之间的 * @return */
    public String ageValidate() {
        String regex = "[1-9]{1}[1-9]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的年龄，在10-99之间");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }

    }

    /*** 对用户输入性别的验证 * 性别的输入要求：男（m 或 M） 女（f 或 F） * @return */
    public String sexValidate() {
        String regex = "[m|M|f|F]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的性别，男性（m或M），女性（f或F）");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }
    }

    /*** 对用户输入电话号码的验证 * 电话号码要求：允许带有区号的座机号，允许手机号 * @return */
    public String telNumValidate() {
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的电话，带区号的座机或11位的手机");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }

    }

    /*** 对用户输入地址的验证 * 地址格式要求：字母或者数字，长度 1,50 * @return */
    public String addressValidate() {
        String regex = "\\w{1,50}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的地址，字母或者数字，长度 1,50");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您的输入有误，请重新输入");
            }
        }

    }

}
