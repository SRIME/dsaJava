package Arrays;

public class bubbleSort {
    public static void main(String args[]) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 12;
        arr[3] = 45;
        arr[4] = 19;

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted Array: ");

        for(int i=0 ; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}