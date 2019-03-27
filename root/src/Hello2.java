package com.epam.courses2;

public class Hello2 {
        class Hello{
        void printClassHello(){
            System.out.println("Hello");
        }
    }
        public static void main (String[]args){
            Hello2 h1 = new Hello2();
            Hello2.Hello h2 = h1.new Hello();
            h2.printClassHello();
        }
}