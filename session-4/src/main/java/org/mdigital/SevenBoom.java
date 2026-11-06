package org.mdigital;

public class SevenBoom {

    public String sevenBoom(int[] list) {
        for (int num : list) {
            if (String.valueOf(num).contains("7")) {
                return "Boom!";
            }
        }
        return "No booming here";
    }

    static void main() {
        SevenBoom boom = new SevenBoom();

        System.out.println(boom.sevenBoom(new int[]{1, 2, 3, 5, 7, 4, 5, 6, 7,4,3,3}));  // Boom!
        System.out.println(boom.sevenBoom(new int[]{1, 2, 3, 5, 9}));  // No booming here
        System.out.println(boom.sevenBoom(new int[]{1, 2, 3, 5, 97})); // Boom!
    }
}

