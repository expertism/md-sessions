/*
 * Manchester Digital Session 3
 * Operators in Java
 * Conditionals & Loops
 */

package org.mdigital;

public class Main {
    static void main() {
        System.out.println("It's Thursday Today!");

        /*
         Math Operators
        * = multiply (2*2 = 4)
        - = subtraction (3-2 = 1)
        + = addition
        / = division
        % = mod or modulo
         */

        int number1 = 10;
        int number2 = 10;
        int result = number1 + number2;
        System.out.println(result);

        int number3 = 3;
        int number4 = 20;
        int result2 = number4 / number3;
        int reminder = number4 % number3;
        System.out.println(result2 + " reminder " + reminder);

        /*
        Increment & Decrement
        ++ = increment by one
        -- = decrement by one
         */

        int x = 1;
        System.out.println(++x); // 2
        System.out.println(x); // 2
        System.out.println(x++); // 2 (ideal)
        System.out.println(x); // 3
        System.out.println(x--); // 2

        /*
        Comparison Operators
        == = equal to
        .equals() = strict equal to
        != = not equal to
        !object.equals() = strict not equal to
        > = greater than
        < = less than
        >= = greater than or equal to
        <= = less than or equal to
         */

        int num1 = 2;
        String num2 = "2";
        System.out.println("2".equals(num2));

        /*
        Logical Operators
        && = AND (both true)
        || = OR (one must be true)
        ! = NOT (not true)
         */

        /*
        Advanced Operators
        ?: = shorter if else statement (Ternary Operators)
        (condition) ? (true outcome) : (false outcome)
         */

        int speed = 900;
        String message = (speed >= 120) ? "Too fast" : "You good";
        System.out.println(message);

        /*
        Conditionals
        IF:
        if (condition) {
        code here
        }

        IF/ELSE:
        if (condition) {
        code here
        } else {
        code here
        }

        IF/ELSE IF/ELSE:
        if (condition) {
        code here
        } else if (condition) {
        code here
        } else {
        cod here
        }
         */

        int day = 2;

        if (day <= 5) {
            System.out.println("### Weekday ###");
            if ((day == 2) || (day == 4)) {
                System.out.println("Gym");
            }
        } else {
            System.out.println("### Weekend ###");
            if (day == 7) {
                System.out.println("Gardening");
            }
        }

    }
}
