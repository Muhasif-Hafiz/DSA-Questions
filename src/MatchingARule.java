import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Array.get;

public class MatchingARule {
    public static void main(String[] args) {

    }



    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        int count = 0;


        for (i = 0; i < items.size(); i++) {

                if (ruleKey == "type") {
                    if (items.get(i).get(0).contains(ruleValue)) {
                        count++;
                    }

                }
                else if (ruleKey == "color") {
                    if (items.get(i).get(1).contains(ruleValue)) {
                        count++;
                    }

                }
               else{
                    if (items.get(i).get(2).contains(ruleValue)) {
                        count++;
                    }


            }
        }
        return count;
    }
}
