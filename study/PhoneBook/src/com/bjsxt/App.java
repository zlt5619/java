package com.bjsxt;
/*
电话本项目入口类

 */
public class App {
    //控制主菜单
    public void start(){
        Menu m=new Menu();
        Operate operate=new Operate();
        TelNoteRegex regex=new TelNoteRegex();
        while (true){
            m.mainMenu();
            int item = regex.menuItemValidate(1,6);
            switch(item){
                case 1: operate.addLogic();break;
                case 2: operate.searchLogic();break;
                case 3: operate.modifyLogic();break;
                case 4: operate.deleteLogic();break;
                case 5: operate.orderLogic();break;
                case 6: System.exit(0);
            }
        }

    }
    //启动电话本项目
    public static void main(String[] args) {
        App app=new App();
        app.start();
    }
}
