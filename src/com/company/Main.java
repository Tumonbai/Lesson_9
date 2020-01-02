package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        makeIt();
        makeIt();
        System.out.println("Main method");
        makeIt();
    }
    public static void  makeIt(){
        int a = 8;
        System.out.println(a);
        int b = 9;
        System.out.println(b);
        System.out.println("Result of addition = "+ (a+b));
    }
    public static void test(){
        makeIt();
        System.out.println();
    }
}
