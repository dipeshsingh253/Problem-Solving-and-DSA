package random;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AllTwiceExceptOne {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,1,3,2};

        ans(5,arr);
    }
    public static int ans(int n, int[] arr){

        if(n<2){
            return arr[0];
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);


        int ans= map.entrySet().stream()
                .filter(m -> 1 == m.getValue())
                .map(m -> m.getKey()).findFirst().orElse(0);
        System.out.println(ans);

        return 0;

    }

}
