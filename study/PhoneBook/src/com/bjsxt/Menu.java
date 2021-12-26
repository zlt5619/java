package com.bjsxt;
/*
生成项目中的所有菜单
 */

public class Menu {
    //主目录
    public void mainMenu() {
        System.out.println("***********************");
        System.out.println("**     1 添加记录     **");
        System.out.println("**     2 查找记录     **");
        System.out.println("**     3 修改记录     **");
        System.out.println("**     4 删除记录     **");
        System.out.println("**     5 排序记录     **");
        System.out.println("**     6 退出系统     **");
        System.out.println("***********************");
    }

    //添加记录
    public void addMenu() {
        System.out.println("*************************");
        System.out.println("**     1 添加新记录     **");
        System.out.println("**     2 查看全记录     **");
        System.out.println("**     3 返回上一级     **");
        System.out.println("*************************");
    }

    //查找记录
    public void searchMenu() {
        System.out.println("*************************");
        System.out.println("**     1 按姓名查找     **");
        System.out.println("**     2 按年龄查找     **");
        System.out.println("**     3 按性别查找     **");
        System.out.println("**     4 按号码查找     **");
        System.out.println("**     5 按住址查找     **");
        System.out.println("**     6 查看全记录     **");
        System.out.println("**     7 返回上一级     **");
        System.out.println("*************************");
    }

    //修改记录
    public void modifyMenu() {
        System.out.println("*************************");
        System.out.println("**     1 查看全记录     **");
        System.out.println("**     2 修改指定记录   **");
        System.out.println("**     3 返回上一级     **");
        System.out.println("*************************");
    }

    //删除记录
    public void deleteMenu() {
        System.out.println("*************************");
        System.out.println("**     1 查看全记录     **");
        System.out.println("**     2 删除指定记录   **");
        System.out.println("**     3 删除全部记录   **");
        System.out.println("**     4 返回上一级     **");
        System.out.println("*************************");
    }

    //排序记录
    public void orderMenu() {
        System.out.println("*************************");
        System.out.println("**     1 按姓名排序     **");
        System.out.println("**     2 按年龄排序     **");
        System.out.println("**     3 按性别排序     **");
        System.out.println("**     4 查看全部记录   **");
        System.out.println("**     5 返回上一级     **");
        System.out.println("*************************");
    }

    //修改子界面
    public void subModifyMenu() {
        System.out.println("*************************");
        System.out.println("**     1 修改姓名       **");
        System.out.println("**     2 修改年龄       **");
        System.out.println("**     3 修改性别       **");
        System.out.println("**     4 修改号码       **");
        System.out.println("**     5 修改住址       **");
        System.out.println("**     6 返回上一级     **");
        System.out.println("*************************");
    }

//    public static void main(String[] args) {
//        Menu m=new Menu();
//        m.mainMenu();
//        m.addMenu();
//        m.deleteMenu();
//        m.modifyMenu();
//        m.orderMenu();
//        m.searchMenu();
//        m.subModifyMenu();
//    }
}
