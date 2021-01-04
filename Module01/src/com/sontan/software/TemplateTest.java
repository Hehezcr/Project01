package com.sontan.software;

import java.util.ArrayList;

/**
 * @author 郑创锐
 * @create 2021/1/4 - 15:52
 */
public class TemplateTest {

    private static int num;
    private static String[] name = new String[]{"Tom", "jerry", "LiMing", "Mike"};

    public static void main(String[] args) {
        System.out.println("TemplateTest.main");
        System.out.println("args = [" + args + "]");
        num = 10;
        System.out.println("num = " + num);
        getname();
        getStrings();
    }

/*
*获得list数组数据
* */
    public static void getStrings() {
        ArrayList<String> strings = new ArrayList<>();

        if (strings == null) {

        }

        if (strings != null) {

        }

        for (String s : name) {
            strings.add(s);
        }

        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
/*
*   获得String数组数据
* */
    public static void getname() {

        for (int i = 0; i < name.length; i++) {
            System.out.println("name = " + name[i]);
        }

        for (String s : name) {
            System.out.println("s = " + s);
        }

        for (int i = 0; i < name.length; i++) {
            String s = name[i];
            System.out.println("s = " + s);

        }
    }

}
