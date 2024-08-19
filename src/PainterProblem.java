import java.util.ArrayList;

public class PainterProblem {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(23);
        arr.add(56);
        arr.add(35);
        arr.add(59);
        arr.add(67);
        arr.add(51);


        int ans=findPages(arr,arr.size(), 2);
        System.out.println(ans);

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int low=0;
        int sum=0;

        for(int num : arr){
            low=Math.max(low, num);
            sum+=num;

        }

        if(m>arr.size()){
            return -1;
        }
        int high=sum;

        while(low<=high){

            int mid=low+(high-low)/2;

            int Pages=TotalPages(arr, mid);

            if(Pages>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;



    }
    public static int  TotalPages(ArrayList<Integer> arr, int pages){

        int totalPages=0;
        int students=1;

        for(int i=0;i<arr.size();i++){

            if(totalPages+arr.get(i)<=pages){
                totalPages+=arr.get(i);

            }else{

                students++;
                totalPages=arr.get(i);
            }
        }
        return students;
    }
}
