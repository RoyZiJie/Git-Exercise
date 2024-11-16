package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarModelSortTest {

	 @Test
	    public void testSortCarModels() {
	        String[] carModels = {"Toyota", "Honda", "Nissan", "Subaru"};
	        CarModelSort carModelSort = new CarModelSort(carModels);
	        carModelSort.sort();
	        String[] sortedCarModels = carModelSort.getCarModels();
	        
	        // Expected sorted order
	        String[] expected = {"Honda", "Nissan", "Subaru", "Toyota"};
	        assertArrayEquals(expected, sortedCarModels);
	    }
	    
	    @Test
	    public void testEmptyCarModels() {
	        CarModelSort carModelSort = new CarModelSort();
	        carModelSort.sort();
	        assertArrayEquals(new String[0], carModelSort.getCarModels());
	    }
	    
	    @Test
	    public void testSportCarModels() {
	        String[] models = {"Porsche", "McLaren", "Lotus", "Bugatti"};
	        String[] sortedModels = CarModelSort.SportCarModels(models);
	        
	        // Expected sorted order
	        String[] expected = {"Bugatti", "Lotus", "McLaren", "Porsche"};
	        assertArrayEquals(expected, sortedModels);
	    }
	}