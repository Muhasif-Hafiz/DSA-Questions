import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));

    }
    public  static boolean isAnagram(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,'n');
        }

        for(int i=0;i<t.length();i++){

            char ch= t.charAt(i);

            if(map.containsKey(ch)){

                map.remove(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}
