package sort;

import java.util.Arrays;

public class CarModelSort {
    private String[] carModels;

    // Default constructor
    public CarModelSort() {
        this.carModels = new String[0]; // default empty array
    }

    public CarModelSort(String[] carModels) {
        this.carModels = carModels;
    }

    public void sort() {
        Arrays.sort(this.carModels);
    }

    public String[] getCarModels() {
        return this.carModels;
    }

    // Static method for sport car models
    public static String[] SportCarModels(String[] carModels) {
        CarModelSort carModelSort = new CarModelSort(carModels);
        carModelSort.sort();
        return carModelSort.getCarModels();
    }

    // Example
    public static void main(String[] args) {
       
        String[] models = {"Porsche", "McLaren", "Lotus", "Bugatti"};
        System.out.println("Original Car Models: " + Arrays.toString(models));
        System.out.println("Sorted Car Models: " + Arrays.toString(SportCarModels(models)));
    }
}
