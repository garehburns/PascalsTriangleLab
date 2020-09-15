package lab7;

import java.util.Scanner;

public class Lab7 {
    public static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(generateNthLine(i, j) + "  ");
                }
                System.out.println();
            }
        }
    }

    public static int generateNthLine(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        }
        else {
            return generateNthLine(i - 1, j - 1) + generateNthLine(i - 1, j);
        }
    }

    public static void main(String[] args) {
        System.out.print("Which row of Pascal's Triangle would you like to see? ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        pascalsTriangle(row);
    }
}