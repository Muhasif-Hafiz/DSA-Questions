import java.util.Arrays;

public class Pangram1832 {
    public static void main(String[] args) {

        String name="thequickbrownfoxjumpsoverthelazydog";
boolean isFilled=checkIfPangram(name);
        System.out.println(isFilled);




    }
    public  static  boolean checkIfPangram(String sentence) {
        int length=sentence.length();
           char[] arr= sentence.toCharArray();
        int count=0;

        for(int i=0;i<length;i++){


            for (int j = 0; j <length ; j++) {

                char ch= (char) (97+i);

                if(ch==arr[j]){
                    count++;
                }
            }
        }
        if(count>=26){
            return true;
        }
return false;

    }
}
