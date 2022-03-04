import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{

            System.out.print("Enter the First integer: ");
            int firstInt = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int secondInt = sc.nextInt();
            
            int result = firstInt + secondInt;
            
            System.out.println("Sum = "+result);
        }
        finally{
            sc.close();
        }
    }
}