package Arrays;

import java.util.Scanner;

public class linearSearchArray {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int searchElement, i;
        boolean searchSucessful = false;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Enter the Element to be searched: ");
        Scanner in = new Scanner(System.in);

        try{
            searchElement = in.nextInt();
        }

        finally{
            in.close();
        }

        for( i=0; i<arr.length; i++){
            if(arr[i] == searchElement){
                searchSucessful = true;
                break;
            }
        }

        if(searchSucessful){
            System.out.println("Element Found at location: "+(i+1));
        }

        if(searchSucessful)
            System.out.println("The Element Doesnot Exist in the Array!!!");
        
    }
}
