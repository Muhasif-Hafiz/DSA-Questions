public class LargestOddString1903 {
    public static void main(String[] args) {
        String ans="7542351161";
        System.out.println(largestOddNumber(ans));




    }
    public static String largestOddNumber(String num) {


        char ch;
        int ans=0;
        int index=-1;
        char ch1;
        long result=0;
        for(int i=num.length()-1;i>=0;i--){

            ch=num.charAt(i);
            int number=(int)ch-48;

            if(number%2!=0){
                index=i;
                break;
            }

        }


        if(index==-1){
            return "";
        }
        return ""+num.substring(0,index+1);
    }
    public static String converter(String num){
        char ch;
        int ans=0;

       for(int i=0;i<num.length();i++){

            ch=num.charAt(i);
            ans= ((ans * 10) + (int) ch) - 48;

       }



        return ""+ans+"";
    }
}
