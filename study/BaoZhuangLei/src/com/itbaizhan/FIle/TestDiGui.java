package com.itbaizhan.FIle;

import java.io.File;

public class TestDiGui {


    public static void main(String[] args) {
        File f=new File("D:\\风电资料");
        printFile(f,0);

    }
    static void printFile(File f,int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        //输出文件名
        System.out.println(f.getName());
        if(f.isDirectory()){
            File[] files=f.listFiles();
            for(File temp:files){
                printFile(temp,level+1);
            }
        }
    }
}
