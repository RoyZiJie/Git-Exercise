package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevenueSortTest {

	 @Test
	    public void testSortRevenues() {
	        int[] revenues = {6000, 4000, 8000, 1200};
	        RevenueSort revenueSort = new RevenueSort(revenues);
	        revenueSort.sort();
	        int[] sortedRevenues = revenueSort.getRevenues();
	        
	        // Expected sorted order
	        int[] expected = {1200, 4000, 6000, 8000};
	        assertArrayEquals(expected, sortedRevenues);
	    }
	    
	    @Test
	    public void testEmptyRevenues() {
	        RevenueSort revenueSort = new RevenueSort();
	        revenueSort.sort();
	        assertArrayEquals(new int[0], revenueSort.getRevenues());
	    }
	    
	    @Test
	    public void testSortRentalPrices() {
	        int[] rentalPrices = {550, 450, 250, 150, 300};
	        int[] sortedPrices = RevenueSort.SortRentalPrices(rentalPrices);
	        
	        // Expected sorted order
	        int[] expected = {150, 250, 300, 450, 550};
	        assertArrayEquals(expected, sortedPrices);
	    }
	}