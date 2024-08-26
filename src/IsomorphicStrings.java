import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        boolean ans = isIsomorphic("aa", "ab");
        System.out.println(ans);

    }

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();


        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            char ss = s.charAt(i);
            char tt = t.charAt(i);


            if (map.containsKey(ss)) {

                if (map.get(ss) == tt) {

                } else {
                    return false;
                }
            } else {

                map.put(ss, tt);
            }

            if (map2.containsKey(tt)) {
                if (map2.get(tt) != ss) {
                    return false;
                }
            } else {
                map2.put(tt, ss);
            }

        }
        return true;

    }
}
