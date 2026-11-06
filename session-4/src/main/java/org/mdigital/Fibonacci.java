package org.mdigital;

public class Fibonacci {
    static void main() {
    int stop = 7;
    int a = 0;
    int b = 1;

    for (int i = 0; i <= stop; i++){
        System.out.println(a);
        int temp = a + b;
        a = b;
        b = temp;
    }

    }
}
