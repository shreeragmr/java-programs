package Arrays;

public class TwoSum {
    public static void main(String[] args) {
         
        int[] arr = {4,6,1,9,2};
        int sum = 11;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] + arr[j] == sum){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
