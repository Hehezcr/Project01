package com.sontan.software;

public class Helloworld {

    private static final Customer customer = new Customer();
    public static final int NUM = 1;
    public static final int NUM2 = 2;
    public static final String NATION = "China";
    public static void main(String[] args) {
        System.out.println("helloworld!");
        customer.eat();
    }

    public void testUpdate(){
        System.out.println(NUM);
    }

}
