import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
int [] arr={1,1,2,2,2,3,3};
       // System.out.println(Arrays.toString(plusOne(arr)));
       // System.out.println(Arrays.toString(plusOne(arr)));
removeDuplicates(arr);

    }
    static int [] plusOne(int [] digits){
      int n=digits.length;
      for(int i=n-1;i>=0;i--){
          if(digits[i]<9){
              digits[i]++;
              return digits;
          }
          digits[i]=0;
      }
      int [] newNumber=new int[n+1];
      newNumber[0]=1;
      return newNumber;

    }
    static int secondLargetst(int [] arr){
        int Largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                secondLargest=Largest;
                Largest=arr[i];

            }else if(arr[i]<Largest && arr[i]>secondLargest){
               secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    static void swap(int [] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void removeDuplicates(int [] arr) {
       //[1,1,2,2,2,2,3,3]
        for(int i=0;i<arr.length;){
            for(int j=1;j<arr.length;){
                if(arr[j]!=arr[i]){
                   j++;
                }else{
                    swap(arr,j,i);
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
