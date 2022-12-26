package array;

import java.util.PriorityQueue;

public class MaxValueOfEquation {

    // Question Link : https://leetcode.com/problems/max-value-of-equation/description/


    public int findMaxValueOfEquation(int[][] points, int k) {


        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (a.getKey() == b.getKey() ? a.getValue() - b.getValue() : b.getKey() - a.getKey()));
        int res = Integer.MIN_VALUE;
        for (int[] point : points) {
            while (!pq.isEmpty() && point[0] - pq.peek().getValue() > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                res = Math.max(res, pq.peek().getKey() + point[0] + point[1]);
            }
//            pq.offer(new Pair<>(point[1] - point[0], point[0]));
            pq.offer(new Pair(point[1] - point[0], point[0]));


        }
        return res;


    }

    public int findMaxValueOfEquation2(int[][] points, int k) {

        int max = Integer.MIN_VALUE;
        int ans = 0;
        int mod = 0;
        int flag = 1;

        for(int i = 0;i<points.length-1;i++)
        {
            if(flag<i+1){
                flag = i+1;
            }
            for(int j = flag;j<points.length;j++)
            {
                mod = points[i][0]-points[j][0];
                if(mod<0)
                    mod = -mod;
                if(mod>k)
                    break; // x coordinate are sorted
                ans = points[i][1]+points[j][1]+mod;
                if(max<ans)
                {
                    max = ans;
                    flag = j-1;
                }
            }
        }
        return max;


    }

    class Pair {
        Integer key;
        Integer value;

        public Pair() {
        }

        public Pair(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }


}
