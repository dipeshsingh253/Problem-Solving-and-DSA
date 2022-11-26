package random;

import java.util.*;
import java.io.*;
class KillEnemies{
    
	  
	  public static int killEnemies(int n, int[] arr){
	      
	      int sum1 = 0;
	      int sum2 = 0;

		  for(int i=0;i<n;i++){
			  if(i%2==0){
				  sum1+=arr[i];
			  }else {
//				  System.out.println("Odd :"+i);
				  sum2+=arr[i];
			  }
		  }
		  System.out.println(sum1+" "+sum2);
          return sum1>sum2?sum2:sum2;
//		  return 0;
	  }
	  

	  public static void main(String[] args){
	   // int k=1;
	   // while(k<41){
	   //     System.out.println(k);
	   //     k = k+2;
	   // }

//		FastReader s =new FastReader();

		int tc = 1;

		for(int i=0;i<tc;i++){
		    int n = 25;
		    int[] arr = {51, 59 ,90 ,35, 14 ,85 ,48 ,49 ,65 ,88, 20 ,62 ,34 ,38, 46, 40, 44 ,100, 86, 44 ,36 ,83 ,20 ,43 ,99};


//            int ans = killEnemies(n,arr,0)>killEnemies(n,arr,1)?killEnemies(n,arr,0) : killEnemies(n,arr,1);
			int ans = killEnemies(n,arr);
            System.out.println("Ma ans :"+ ans);

			System.out.println("Expected :" +829);
		}

	  }

	  
//
//        static class FastReader{
//    	    BufferedReader br;
//    	    StringTokenizer st;
//
//    	    public FastReader()
//    	    {
//    	      br = new BufferedReader(new InputStreamReader(System.in));
//    	    }
//
//    	    String next(){
//
//    	    while (st == null || !st.hasMoreElements()){
//    		try { st = new StringTokenizer(br.readLine()); }
//    		catch (IOException e) { e.printStackTrace(); }
//    	      }
//    	      return st.nextToken();
//    	    }
//
//
//    	    int nextInt() { return Integer.parseInt(next()); }
//
//    	    long nextLong() { return Long.parseLong(next()); }
//
//    	    double nextDouble(){ return Double.parseDouble(next()); }
//
//    	    String nextLine(){
//    	      String str = "";
//    	      try { str = br.readLine(); }
//    	      catch (IOException e) { e.printStackTrace(); }
//    	      return str;
//    	    }
//	  }

}