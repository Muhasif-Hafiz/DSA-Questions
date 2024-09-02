public class CountInversion {
    public static void main(String[] args) {
      long [] arr={2,4,1,3,5};
        System.out.println(inversionCount(arr, arr.length));
    }
    static long inversionCount(long arr[], int n) {
        return mergeSort(arr, 0, arr.length -1);
    }
     public static long mergeSort(long [] arr, int left, int right){


         long count = 0;
         if (left < right) {
             int mid = left + (right - left) / 2;

             count += mergeSort(arr, left, mid);
             count += mergeSort(arr, mid + 1, right);

             count += mergeArrays(arr, left, mid, right);
         }
         return count;


     }
     public static long mergeArrays(long [] arr, int left, int mid, int right){
         long count=0;
         int n1= mid-left+1;
         int n2= right-mid;

         long [] leftArray=new long[n1];
         long [] rightArray= new long[n2];

         for(int i=0;i<n1;++i){
             leftArray[i]=arr[left + i];
         }
         for(int j=0;j<n2;++j){
             rightArray[j]=arr[mid+1+j];
         }
         int i=0;
         int j=0;
int k=left;
         while(i<n1 && j<n2){

             if(leftArray[i]<=rightArray[j]){
                 arr[k++]=  leftArray[i++];
             }else{

                 arr[k++]= rightArray[j++];

                  count += (mid + 1) - (left + i);  // VERY VERY VERY IMPORTANT LINE !!!!!!!!!


             }
         }
         while(i<n1) {
             arr[k++]=  leftArray[i++];
         }
         while(j<n2) {
             arr[k++]=  rightArray[j++];
         }

return count;

     }
}
