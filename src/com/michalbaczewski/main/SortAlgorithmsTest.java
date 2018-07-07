package com.michalbaczewski.main;

public class SortAlgorithmsTest {
    public static void main(String[] args) {
        int[] unsortedTable = {5, 8, 2, 10, 3};
        Sort sortNo1 = new Sort(unsortedTable);
        sortNo1.sortItBubbleAlgorithm();
        sortNo1.printSortResult();
    }
}
