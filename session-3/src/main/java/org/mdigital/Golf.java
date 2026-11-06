package org.mdigital;

public class Golf {
    static void main() {
        String[] shotNames = {"Hole in one!", "Eagle", "Birdie", "Par", "Bogey", "Double Bogey", "Quit"};

        int par = 5;
        int strokes = 3;

        if (strokes == 1) {
            System.out.println(shotNames[0]);
        } else if (strokes <= par - 2) {
            System.out.println(shotNames[1]);
        } else if (strokes == par - 1) {
            System.out.println(shotNames[2]);
        } else if (strokes == par) {
            System.out.println(shotNames[3]);
        } else if (strokes == par + 1) {
            System.out.println(shotNames[4]);
        } else if (strokes == par + 2) {
            System.out.println(shotNames[5]);
        } else if (strokes >= par +3) {
            System.out.println(shotNames[6]);
        }
    }
}
