package array;

import java.util.List;

public class CountItemsMatchingRule {

    //Question Link : https://leetcode.com/problems/count-items-matching-a-rule/
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index;
        int ans = 0;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        for (List<String> item : items) {

            if (item.get(index).equals(ruleValue)) {
                ans++;
            }

        }

        return ans;
    }
}
