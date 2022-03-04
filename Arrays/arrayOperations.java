package Arrays;

import java.util.Scanner;

public class arrayOperations {
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int choice=0;
        try{

            while(choice!=3){
                System.out.println("1. Insert Element at beginning of the array");
                System.out.println("2. Insert Element at the end of the array");
                System.out.println("3. Exit");
                
                System.out.println("Enter Your Choice");
                choice = sc.nextInt();
                switch(choice){
                    case 1: insertBegArray(arr, arr.length);   break;
                    case 2: insertEndArray();   break;
                    // case 3: exit(0);
                    default: System.out.println("Wrong choice!!!"); break;
                }
                
            }
        }
        finally{
            sc.close();
        }
    }
    public static void insertBegArray(int a[], int l){

    }
    public static void insertEndArray(){
    }
    
}
