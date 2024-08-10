import java.util.*;
public class DuplicateNumbers {
    public static void main(String[] args) {
int [] arr={1,2,2,3,4,3};

        System.out.println(duplicates(arr));
    }
    static void swap(int [] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static List<Integer>  duplicates(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list =new ArrayList<>();
        for(int j=0;j<arr.length;j++) {
            if (arr[j] != j + 1) {
                list.add(arr[j]);
            }
        }
        return list;
    }
}
