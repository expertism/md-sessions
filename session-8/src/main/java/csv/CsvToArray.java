package csv;

import java.util.Arrays;


public class CsvToArray {
    static void main() {
        String csv = "abc,def,ghi\njkl,mno,pqr\nstu,vwx,yza";
        String[] rows = csv.split("\n");

        String[][] data = new String[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            data[i] = rows[i].split(",");
        }

        System.out.println(Arrays.deepToString(data));
    }
}
