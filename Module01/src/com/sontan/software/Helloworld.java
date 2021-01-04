package com.sontan.software;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Helloworld {
    public static void main(String[] args) {
        ArrayList arrayList1 = getList();

        System.out.println(arrayList1);
//        method1();

        Customer customer = new Customer();
        customer.eat();

    }

    public static ArrayList getList() {
        //region Description
        System.out.println("Helloworld!!!!!!!");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 123);
        //endregion
        return arrayList;
    }

    private static final int INITIAL_SIZE = 10;

    public static void method1() {
        try {
            FileInputStream fileInputStream = new FileInputStream("fileText.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
