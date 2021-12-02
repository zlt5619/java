/*
* 使用 while/for 循环 0-130 之间的数字，每行显示 5 个数字
* ???
* */

public class TestWhile2 {
    public static void main(String[] args) {
        int a=0;
        while(a<131){
            System.out.print(a+"\t");
            if(a%5==4){
                System.out.println();
            }
            a++;
        }
    }
}
