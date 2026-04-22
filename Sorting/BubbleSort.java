public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {5, 3, 1, 7, 2};

        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
       
        boolean swapped = true;

        while(swapped){

            swapped = false;

            for(int i = 0; i < arr.length-1; i++){

                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
