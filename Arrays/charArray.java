package Arrays;
import java.util.Scanner;

public class charArray {
    public static void main(String args[]){
        // char arrNames[] = new char[5];
        Scanner in = new Scanner(System.in);
        try
        {
            System.out.println("Enter Your Friends Name: ");

            char[] arrNames = in.next().toCharArray();

            System.out.println("Your Friends Name are ");
            for(int i = 0; i<arrNames.length; i++)
            {
                System.out.println(arrNames[i]);    
            }

        }   
        finally{
            in.close();
        }
    }
}
