package org.mdigital;

public class Main {
    static void main() {
        Calc add = new Calc();
        // to access a method init the class and call the class
        int num2 = 10;
        int result = add.add(num2);
        System.out.println(result);
    }
}