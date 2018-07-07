package com.michalbaczewski.main;

import java.util.Arrays;

public class Sort {

    private int[] unsortedTable;
    private int[] sortedTable;

    public Sort(int[] unsortedTable) {
        this.unsortedTable = unsortedTable;
        this.sortedTable = new int[unsortedTable.length];
    }

    public void sortItBubbleAlgorithm() {
        sortedTable = unsortedTable.clone();
        int tmp;
        for (int j = 0; j < sortedTable.length - 1; j++) {
            for (int i = 0; i < sortedTable.length - 1; i++) {
                if (sortedTable[i] > sortedTable[i + 1]) {
                    tmp = sortedTable[i + 1];
                    sortedTable[i + 1] = sortedTable[i];
                    sortedTable[i] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Sort{" +
                "unsortedTable=" + Arrays.toString(unsortedTable) +
                ", sortedTable=" + Arrays.toString(sortedTable) +
                '}';
    }

    public void printSortResult() {
        System.out.println(toString());
    }

}
