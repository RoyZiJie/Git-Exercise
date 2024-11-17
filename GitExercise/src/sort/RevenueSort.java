package sort;

import java.util.Arrays;

public class RevenueSort {
    private int[] revenues;

    // Default constructor
    public RevenueSort() {
        this.revenues = new int[0]; // default empty array
    }

    public RevenueSort(int[] revenues) {
        this.revenues = revenues;
    }

    public void sort() {
        Arrays.sort(this.revenues);
    }

    public int[] getRevenues() {
        return this.revenues;
    }

    // Static method for sorting rental prices
    public static int[] SortRentalPrices(int[] rentalPrices) {
        RevenueSort revenueSort = new RevenueSort(rentalPrices);
        revenueSort.sort();
        return revenueSort.getRevenues();
    }

    // Example 
    public static void main(String[] args) {
        
        int[] rentalPrices = {550, 450, 250, 150, 300};
        System.out.println("Original Rental Prices: " + Arrays.toString(rentalPrices));
        System.out.println("Sorted Rental Prices: " + Arrays.toString(SortRentalPrices(rentalPrices)));
        
// test
        
    }
}
