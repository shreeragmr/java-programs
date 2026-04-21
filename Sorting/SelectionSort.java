public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {5, 3, 1, 7, 2};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++){

            int minIndex = i;

            for(int j = i+1; j < arr.length; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr, i , minIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp; 
    }
}
