public class kthElementSortedArray {
    public static void main(String[] args) {
        int []arr1={100, 112, 256, 349, 770};
        int [] arr2  ={72, 86, 113, 119, 265, 445, 892};
        long ans=kthElement(7,arr1,arr2);
        System.out.println(ans);

    }
    public static  long kthElement(int k, int arr1[], int arr2[]) {


        int count=0;
        int i=0;
        int j=0;
        int n1=arr1.length;
        int n2=arr2.length;
        long element=-1;

        while(i<n1 && j<n2){

            if(arr1[i]<arr2[j]){

                element=arr1[i];
                i++;
            }else{
                element=arr2[j];
                j++;
            }
            count++;
            if(count==k){
                return element;
            }
        }

        while(i<n1){
            element=arr1[i];
            i++;
            count++;
            if(count==k){
                return element;
            }
        }
        while(j<n2){
            element=arr2[j];
            j++;
            count++;
            if(count==k){
                return element;
            }
        }
        return element;
    }
}
