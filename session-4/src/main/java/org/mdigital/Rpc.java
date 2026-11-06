package org.mdigital;

import java.util.Scanner;

public class Rpc {
    public String rpcChooser() {
        int num = (int)(Math.random() * 3) + 1;

        if (num == 1) {
            return "rock";
        } else if (num == 2){
            return "paper";
        } else {
            return "scissors";
        }
    }

    public String checkResult(String comp, String choice) {
        if ((comp.equals("rock") && choice.equals("r")) ||
                (comp.equals("paper") && choice.equals("p")) ||
                (comp.equals("scissors") && choice.equals("s"))) {
            return "It's a tie!";
        }
        else if ((comp.equals("rock") && choice.equals("p")) ||
                (comp.equals("paper") && choice.equals("s")) ||
                (comp.equals("scissors") && choice.equals("r"))) {
            return "You win!";
        }
        else {
            return "You lose!";
        }
    }

    public static void main() {
        Rpc rpc = new Rpc();
        Scanner input = new Scanner(System.in);

        System.out.print("Your choice (r, p or s): ");
        String choice = input.nextLine().toLowerCase();

        String compChoice = rpc.rpcChooser();
        System.out.println("Computer chose: " + compChoice);

        String result = rpc.checkResult(compChoice, choice);
        System.out.println(result);
        input.close();
    }
}
