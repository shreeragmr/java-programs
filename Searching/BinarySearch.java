package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // sorted!
        int result = search(arr, 40);

        System.out.println(result != -1 ? "Number found at index:" + result : "Not found");

    }

    public static int search(int[] arr, int num) {
        
        int start = 0, end = arr.length-1;

        while(start < end){

            int mid = (start + end)/2;

            if(arr[mid] == num){
                return mid;
            }

            else if(arr[mid] < num){
                start++;
            }

            else {
                end--;
            }
        }
        return -1;
    }
}
