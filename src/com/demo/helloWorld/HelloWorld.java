package com.demo.helloWorld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
        private String name;
    private ArrayList list2;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public HelloWorld(String name) {
        this.name = name;
        System.out.println("HelloWorld.HelloWorld");

    }

    public static void main(String[] args)
        {
            //region Description
            System.out.println("helloWrold!!");
            ArrayList<String> list = new ArrayList();
            Date data1 = new Date();
            //endregion

            ArrayList list2 = null;
            list.add("");
            for (String s : list) {
                System.out.println(s);
            }




        }
    public void method(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
