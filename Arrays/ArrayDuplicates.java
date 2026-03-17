package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicates {

    public static void main(String[] args) {
        
        int[] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        
        Arrays.sort(arr);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(i == arr.length-1){
                break;
            }
            if(arr[i] == arr[i+1]){
                list.add(arr[i]);
            }
        }return list;
    }
}