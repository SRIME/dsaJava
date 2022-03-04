package Arrays;

public class addTwoDMatrix {
    public static void main(String args[]){
        int a = 3, b=2, c=4, d=2;
        int arr[][] = new int[a][b];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 1;
        arr[2][1] = 1;
        int arr2[][] = new int[c][d];
        arr2[0][0] = 1;
        arr2[0][1] = 1;
        arr2[1][0] = 1;
        arr2[1][1] =1;
        arr2[2][0] = 1;
        arr2[2][1] = 1;

        
        if(a==c&&b==d){

            for(int i = 0; i<arr.length; i++){
                for(int j=0; j<2; j++){
                    arr[i][j] = arr[i][j] + arr2[i][j];
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if(a!=c || b!=d){
            System.out.println("Wrong Dimensions of Array");
        }
            
            
    }
}
