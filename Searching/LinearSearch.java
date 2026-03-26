package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int result = search(arr, 40);

        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The given number is found at index:" + result);
        }
    }

    public static int search(int[] arr, int number){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }return -1;
    }
}
