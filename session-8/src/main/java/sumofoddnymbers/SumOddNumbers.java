package sumofoddnymbers;

import java.util.ArrayList;
import java.util.List;

public class SumOddNumbers {

    public int addSum(List<Integer> num) {
        int sum = 0;
        for (int snum : num) {
            sum += snum;
        }
        return sum;
    }

    public static List<List<Integer>> generatePyramid(int numRows) {
        List<List<Integer>> pyramid = new ArrayList<>();
        int currentOdd = 1;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                row.add(currentOdd);
                currentOdd += 2;
            }
            pyramid.add(row);
        }
        return pyramid;
    }

    static void main() {
        SumOddNumbers summer = new SumOddNumbers();

        List<List<Integer>> pyramid = generatePyramid(10);

        for (List<Integer> currentRow : pyramid) {
            int rowSum = summer.addSum(currentRow);

            System.out.println("sum: " + rowSum);
        }
    }
}
