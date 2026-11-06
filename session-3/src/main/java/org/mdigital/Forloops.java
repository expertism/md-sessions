package org.mdigital;

public class Forloops {
    static void main() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int total = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 || i % 5 == 0 ) {
                System.out.println(i);
                total += i;

            }
        }
        System.out.println(total);

        String text = "Hello";
        int times = 3;
        String result = "";

        for (int i = 0; i < times; i++) {
            result += text;

        }
        System.out.println(result);

        String timesTables = "";
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                timesTables += (col * row) + "\t";
            }
            timesTables += "\n";

        }
        System.out.println(timesTables);

        // FOR OF LOOP
        // for (element : iterable) {code}
        String[] albums = { "Thriller", "Folklore", "Nevermind" };

        for (String album : albums) {
            System.out.println(album);
        }
    }
}
