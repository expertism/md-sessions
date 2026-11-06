package org.mdigital;

import java.util.ArrayList;
import java.util.Arrays;

public class ZooTrip {
    public static void main() {
        ArrayList<String> bus = new ArrayList<>(Arrays.asList(
                "Ryan",
                "Brandon",
                "Rebecca",
                "Richard",
                "Jessica",
                "Brian",
                "Antoinne",
                "Grace",
                "Zee",
                "Ibrahim"
        ));
        bus.remove("Rebecca");
        bus.remove("Ibrahim");
        bus.add(0, "Ibrahim");
        bus.add("Rebecca");
        bus.remove("Ryan");
        bus.add(9, "Ryan");


        System.out.println(bus);
    }
}
