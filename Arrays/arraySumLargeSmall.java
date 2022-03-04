package Arrays;

import java.util.Scanner;

public class arraySumLargeSmall {
    public static void main(String args[]){
        int arr[] = new int[5];
        System.out.print("Enter the eements of the Array: ");
        Scanner in = new Scanner(System.in);
        try{
            for(int i =0; i<arr.length; i++)
                arr[i]=in.nextInt();
        }
        finally{
            in.close();
        }
int small = arr[0], large = arr[0], sum = 0;
System.out.println("Contents: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
            if(small>arr[i]){
                small = arr[i];
            }
            if(large<arr[i]){
                large = arr[i];
            }
            sum=sum+arr[i];
        }

        System.out.println("Smallest element in the array: "+small);
        System.out.println("Largest element in the array: "+large);
        System.out.println("Sum of elements of array: "+sum);

    }
}
