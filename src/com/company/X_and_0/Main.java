package com.company.X_and_0;

public class Main {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("   ");
                if (j != cols - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != rows - 1) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("---");
                    if (j != cols - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }
    }
}
