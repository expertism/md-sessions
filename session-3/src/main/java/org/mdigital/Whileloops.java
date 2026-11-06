package org.mdigital;

public class Whileloops {
    static void main() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        double growthRate = 0.04; // 4%
        double population = 800;  // initial population
        int year = 0;             // present time

        while (population <= 1200) {
            double tempPopulation = population * (1 + growthRate);
            population = tempPopulation;
            System.out.println("Year: " + year + " Population: " + population);
            year++;

        }

        System.out.println("Population first goes over 1200 after " + year + " years");
        System.out.println("Population is: " + population);
    }
}
