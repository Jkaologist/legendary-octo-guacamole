package com.jonk;

import java.util.Arrays;

public class ZigZagConversion {
    public static String zigZag(String s, int numRows) {
        StringBuilder strBuilder = new StringBuilder();
        if (numRows == 1) {
            return s;
        }
        String everyOther = "";
        String everyOtherOther = "";
        if (numRows == 2) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    everyOther += s.toCharArray()[i];
                } else {
                    everyOtherOther += s.toCharArray()[i];
                }
            }
            return everyOther + everyOtherOther;
        }

        String[][] arr = new String[numRows][s.length()];
        String direction = "Down";
        int currRow = 0;
        int xCoord = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            String currChar = String.valueOf(s.toCharArray()[i]);
            if (direction == "Down") {
                arr[currRow][xCoord] = currChar;
                if (currRow == numRows - 1) {
                    direction = "Diag";
                    continue;
                }
                currRow++;
                continue;
            }
            else if (direction == "Diag") {
                if (currRow == 0) {
                    direction = "Down";
                    continue;
                }
                currRow--;
                xCoord++;
                arr[currRow][xCoord] = currChar;
                continue;
            }
        }
        System.out.print("After" + Arrays.deepToString(arr));
        return "";
    }
}
