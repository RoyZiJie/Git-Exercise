
# Github Exercise
## Car Rental Sort

Roy(ZiJie) Zhang 

This repository is hosted at:
https://github.com/RoyZiJie/Git-Exercise.git

This Java application provides two features for sorting data related to a car rental company:
1.  **Revenue Sort**: Sorts an array of integers representing rental prices.
2.  **Car Model Sort**: Sorts an array of strings representing car models.


## Features:

### RevenueSort

The `RevenueSort` class sorts an array of integers that represent the rental prices of cars.  It provides functionality to sort these prices in ascending order.

- **Constructors**:
- `RevenueSort()`: Initializes an empty array of rental prices.
- `RevenueSort(int[] revenues)`: Initializes the class with a specified array of rental prices.

- **Methods**:
- `void sort()`: Sorts the rental prices in ascending order.
- `int[] getRevenues()`: Returns the sorted array of rental prices.
- `static int[] SortRentalPrices(int[] rentalPrices)`: A static method that sorts the given array of rental prices.


### CarModelSort

The `CarModelSort` class sorts an array of strings that represent car models. It provides functionality to sort these car models in alphabetical order.

- **Constructors**:
  - `CarModelSort()`: Initializes an empty array of car models.
  - `CarModelSort(String[] carModels)`: Initializes the class with a specified array of car models.

- **Methods**:
  - `void sort()`: Sorts the car models in alphabetical order.
  - `String[] getCarModels()`: Returns the sorted array of car models.
  - `static String[] SportCarModels(String[] carModels)`: A static method that sorts the given array of Sport car models.


## Example:

You can run the application to see the sorting in action. Here's how you can use both features:

### Run the RevenueSort

To sort rental prices, you can instantiate the `RevenueSort` class or use the static method directly:

```java
public static void main(String[] args) {
    // Example for RevenueSort
    int[] rentalPrices = {550, 450, 250, 150, 300};
    System.out.println("Original Rental Prices: " + Arrays.toString(rentalPrices));
    System.out.println("Sorted Rental Prices: " + Arrays.toString(RevenueSort.sortRentalPrices(rentalPrices)));
}
```
### Run the CarModelSort

To sort Sport car models, you can instantiate the `CarModelSort` class or use the static method directly:

```java
public static void main(String[] args) {
    // Example for CarModelSort   
    String[] models = {"Porsche", "McLaren", "Lotus", "Bugatti"};
    System.out.println("Original Car Models: " + Arrays.toString(models));
    System.out.println("Sorted Car Models: " + Arrays.toString(SportCarModels(models)));
    }
}
```
## Testing:

JUnit tests are provided to validate the sorting functionality. To run the tests:

Make sure that you have JUnit 5 included.
Execute the test classes RevenueSortTest and CarModelSortTest in your Eclipse IDE or build tool.


# Conclusion

This application serves as a basic implementation of sorting functionalities for revenue and car models, thank you for your interest in the Car Rental Sort ! 





