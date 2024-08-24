import java.util.LinkedList;
import java.util.Stack;

public class ReverseString151 {
    public static void main(String[] args) {
        String ans= " the sky is blue";
        System.out.println(reverseWords(ans));


    }
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces, and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        StringBuilder ans = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
