/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author RC_Student_lab
 */
public class Array {

    public static void main(String[] args) {
        
         // Initialize arrays

        int[] price = {200, 350, 700, 400};

        String[] item = {"Shirt", "Pants", "Sneakers", "Jacket"};



        // Calculate sum

        int sumPrice = calculateSum(price);

        System.out.println("Sum: " + sumPrice);



        // Calculate average

        double averagePrice = calculateAverage(price);

        System.out.println("Average: " + averagePrice);



        // Get max and min prices

        int maxPrice = getMaxPrice(price);

        int minPrice = getMinPrice(price);

        System.out.println("Max Price: " + maxPrice);

        System.out.println("Min Price: " + minPrice);



        // Get item with highest price

        String maxItem = getItemWithHighestPrice(price, item);

        System.out.println("Item with Highest Price: " + maxItem);

    }



    // Method to calculate sum

    public static int calculateSum(int[] array) {

        int sum = 0;

        for (int i : array) {

            sum += i;

        }

        return sum;

    }



    // Method to calculate average

    public static double calculateAverage(int[] array) {

        return (double) calculateSum(array) / array.length;

    }



    // Method to get max price

    public static int getMaxPrice(int[] array) {

        int max = array[0];

        for (int i : array) {

            if (i > max) {

                max = i;

            }

        }

        return max;

    }



    // Method to get min price

    public static int getMinPrice(int[] array) {

        int min = array[0];

        for (int i : array) {

            if (i < min) {

                min = i;

            }

        }

        return min;

    }



    // Method to get item with highest price

    public static String getItemWithHighestPrice(int[] price, String[] item) {

        int maxPrice = getMaxPrice(price);

        int index = 0;

        for (int i = 0; i < price.length; i++) {

            if (price[i] == maxPrice) {

                index = i;

                break;

            }

        }

        return item[index];

    }

}

