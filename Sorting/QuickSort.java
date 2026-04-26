public class QuickSort {
    public static void main(String[] args) {

         int[] arr = {5, 3, 8, 4, 2};
         quicksort(arr,0,arr.length-1);

         for(int a:arr){
            System.out.print(a + " ");
         }
    }

    private static void quicksort(int[] arr, int l, int r) {

        if(l < r){
            int p = partition(arr,l,r);
            quicksort(arr, l, p);
            quicksort(arr, p+1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        
        int pivot = arr[l];

        int i = l-1, j = r+1;

        while(true){
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if(i >= j) return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
