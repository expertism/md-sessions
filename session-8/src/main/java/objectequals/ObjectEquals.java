package objectequals;

import java.util.Map;

public class ObjectEquals {

    public static void main() {
        Map<String, Integer> firstObj = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> secondObj = Map.of("a", 1, "b", 2, "c", 3 );
        Map<String, Integer> thirdObj = Map.of("a", 1, "b", 2, "d", 3);

        if (secondObj.keySet().containsAll(firstObj.keySet())) {
            System.out.println("Contains all keys: True");
        } else {
            System.out.println("Contains all keys: False");
        }

        if (firstObj.keySet().containsAll(thirdObj.keySet())) {
            System.out.println("Contains all keys: True");
        } else {
            System.out.println("Contains all keys: False");
        }

    }
}
