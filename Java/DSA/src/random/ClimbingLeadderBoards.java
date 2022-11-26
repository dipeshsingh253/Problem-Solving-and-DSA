package random;

import java.util.*;

public class ClimbingLeadderBoards {
    public static void main(String[] args) {
    List<Integer> ranked = new ArrayList<>();
    Collections.addAll(ranked,100,90,90,80);
    List<Integer> player = new ArrayList<>();
    Collections.addAll(player,70,80,105);

    List<Integer> ans = new ArrayList<>();

    for (int p : player){
        ranked.add(p);
        List<Integer> ranks = returnRanks(ranked);
        System.out.println(ranks);
        for (int i=0;i<ranked.size();i++){

            if(ranked.get(i)==p){
                ans.add(ranks.get(i));
                System.out.println(ranks.get(i));
                break;
            }
        }
//        System.out.println(ranked);
    }

    }

    public static List<Integer> returnRanks(List<Integer> ranked){
        Collections.sort(ranked,Collections.reverseOrder());
        List<Integer> ans = new ArrayList<>();
        int rank = 1;
        ans.add(rank);
        for (int i=1;i<ranked.size();i++){
            if (ranked.get(i)==ranked.get(i-1)){
                ans.add(rank);
            }else {
                ans.add(++rank);
            }
        }

        return ans;
    }


}
