package Arrays;

import java.util.Scanner;

public class binarySearchArray {
    public static void main(String args[]) {
        int arr[] = new int[5], searchElement;
        

        

        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 1;
        arr[3] = 12;
        arr[4] = 9;

        System.out.println("Enter the Element to be searched: ");
        Scanner in = new Scanner(System.in);

        try {
            searchElement = in.nextInt();
        } finally {
            in.close();
        }
        binarySearch(arr, searchElement);

    }    
    public static void binarySearch(int arr[], int searchElement){
        int i;
        boolean searchSuccessful = false;
        boolean searchSuccessfulInMid = false;
        // Sorting the array using bubble sort
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for(i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        // Searching the array using binary search
        int midElement = arr.length / 2;
        if (searchElement == arr[midElement]) {
            searchSuccessfulInMid = true;
        }
        if (searchElement < arr[midElement]) {
            for (i = 0; i < ((arr.length / 2)-1); i++) {
                if (searchElement == arr[i]) {
                    searchSuccessful = true;
                    break;
                }
            }
        }
        if (searchElement > arr[midElement]) {
            for (i = midElement+1; i < arr.length; i++) {
                if (searchElement == arr[i]) {
                    searchSuccessful = true;
                    break;
                }
            }
        }

        if (searchSuccessful || searchSuccessfulInMid) {
            if (searchSuccessful)
                System.out.println("Element Found at location: " + (i + 1));
            if (searchSuccessfulInMid)
                System.out.println("Element Found at location: " + (midElement + 1));
        }
        if (!searchSuccessful && !searchSuccessfulInMid) {
            System.out.println("Element not available in the array!!!");
        }

    }
    

}
