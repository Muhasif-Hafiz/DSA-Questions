public class RowWithMax1 {
    public static void main(String[] args) {
        int [][]arr ={{0,0, 1, 1, 1},
                {0,0, 0, 1, 1},
                {1, 1, 1, 1,1},
                {0, 0, 0, 0,0},
                {0,1,1,1,1}};


     int ans=rowWithMax1s(arr);

        System.out.println(ans);

    }
    public static int lowerBound(int [] arr){

        int low=0;
        int high=arr.length-1;


        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==1){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return arr.length-low;

    }
    public  static int rowWithMax1s(int arr[][]) {

        int index=-1;
        int max_Count=0;

        for(int i=0;i<arr.length;i++){


            int total=lowerBound(arr[i]);

            if(total>max_Count){
                max_Count=total;
                index=i;
            }

        }
        return index;

    }
}
