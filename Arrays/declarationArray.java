package Arrays;

import java.util.Scanner;

public class declarationArray{
    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Enter the array elements");
            
            for(int i=0; i<5; i++){
                arr[i] = sc.nextInt();
            }
            
            System.out.println("The array elements are: ");
            for(int i=0; i<5; i++){
                System.out.println("arr[ "+i+" ] = " + arr[i]);
                // System.out.println(arr[i]);
            }
        }
        finally{
            sc.close();
        }

    }
}