import java.util.HashMap;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {

        String [] strs = {"flower","flow","flight"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);


    }
    public static String longestCommonPrefix(String[] strs) {

        HashMap<Character,Integer> map = new HashMap<>();

        char prefix=strs[0].charAt(0);

        for(int i=0;i<strs[0].length();i++){

            if(prefix!= strs[i].charAt(i)){
                break;
            }
            map.put(prefix,0);
            prefix=prefix++;
        }
        return prefix;

    }
}
