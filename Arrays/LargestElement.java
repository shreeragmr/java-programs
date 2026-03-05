package Arrays;

public class LargestElement{
    public static void main(String[] args) {
        
        int[] arr = {23,15,43,25,65,86,45,89};
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){

            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("The largest number in the array is "+ largest);
    }
}