package Arrays;
import java.util.Scanner;
public class intArray {
    public static void main(String args[]){
        System.out.println("Please Enter the contents of Array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        try{
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("The Elements You Entered are displayed using forloop are: ");
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
            // System.out.println("The Elements You Entered are displayed using if condition are: ");
            // printArr(arr,0);
            System.out.println("The Elements You Entered are displayed using while loop are: ");
            int j=0;
            while(j!=arr.length)
            {
                System.out.println(arr[j]);
                j++;
            }
            System.out.println("The Elements You Entered are displayed using forEach loop are: ");
           
            for(int i: arr){
                System.out.println(arr[i]);
            }
        }
        finally{
            sc.close();
        }
    }
    // public static void printArr(int arr[], int i){
    //     if(i!=arr.length)
    //         {
    //             System.out.println(arr[i]);
    //             printArr(arr,i++);
    //         }
    // }
}
