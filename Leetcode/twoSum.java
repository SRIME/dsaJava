/** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.*/

package Leetcode;

import java.util.Scanner;

public class twoSum {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int target1;
        Scanner in = new Scanner(System.in);
        
        try{
            System.out.println("Enter the Elements of the Array: ");
            for (int i = 0; i < arr.length; i++)
                arr[i] = in.nextInt();
            System.out.println("Enter the Target Element: ");
            target1= in.nextInt();
            findTwoSum(arr,target1);
        }
        finally{
            in.close();
        }

    }

    public static void findTwoSum(int arr[], int target1){
        int i,j;
        
        for(i=0; i<arr.length-1; i++){
            for(j=i; j<arr.length-i-1; j++){
                if(target1 == arr[i]+arr[j]){
                    System.out.println("The index of two Integers who add up to "+target1+" are: "+i+ " and "+j);
                    break;
                }
            }
        }
    }
}
