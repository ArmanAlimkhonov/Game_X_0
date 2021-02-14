package com.company.X_and_0;

import java.util.Random;

public class ComputerBecomeSmarter {
    public static int[][] getVariants(int i, int j) {
        if (i == 0) {
            if (j == 0) {
                return new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 } };
            } else if (j == 1) {
                return new int[][] { { 0, 2 }, { 1, 1 }, { 0, 0 } };
            } else {
                return new int[][] { { 1, 2 }, { 1, 1 }, { 0, 1 } };
            }
        } else if (i == 1) {
            if (j == 0) {
                return new int[][] { { 0, 0 }, { 1, 1 }, { 2, 0 } };
            } else if (j == 1) {
                return new int[][] { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 2 }, { 2, 1 }, { 2, 0 }, { 1, 0 }, { 0, 0 } };
            } else {
                return new int[][] { { 2, 2 }, { 1, 1 }, { 0, 2 } };
            }
        } else {
            if (j == 0) {
                return new int[][] { { 1, 0 }, { 1, 1 }, { 2, 1 } };
            } else if (j == 1) {
                return new int[][] { { 1, 1 }, { 2, 2 }, { 2, 0 } };
            } else {
                return new int[][] { { 1, 2 }, { 2, 1 }, { 1, 1 } };
            }
        }
    }
//
//    public static boolean tryWinOnNextTurn() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameTable[i][j] == COMPUTER) {
//                    int[][] variants = getVariants(i, j);
//                    int rowIndex = new Random().nextInt(variants.length);
//                    for (int k = 0; k < variants.length; k++) {
//                        int number = variants[rowIndex][0] * 3 + variants[rowIndex][1] + 1;
//                        if (isCellFree(number)) {
//                            makeTurn(number, COMPUTER);
//                            return true;
//                        }
//                        rowIndex++;
//                        if (rowIndex >= variants.length) {
//                            rowIndex = 0;
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
}
