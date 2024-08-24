public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String s="(()())(())";
        String ans=removeOuterParentheses(s);
        System.out.println(ans);

    }
    public static String removeOuterParentheses(String s) {

        StringBuilder ans= new StringBuilder();
        int count=0;
        boolean visited=true;

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            if(c=='(') count++;
            if(c==')') count--;

            if((count==1 && c=='(') || count==0){
                continue;

            }
            else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
