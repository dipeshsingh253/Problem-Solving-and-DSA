public class SplitTwoStringsToMakePalindrome{

    // Question Link : https://leetcode.com/problems/split-two-strings-to-make-palindrome/description/


    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()==1)
               return true;
           int n = b.length()-1;
           if(a.charAt(0) == b.charAt(n)){
               int i;
               for(i=1;i<a.length()/2;i++){
                   if(a.charAt(i)!=b.charAt(n-1)){
                       break;
                   }
                   n--;
               }
               if(i==a.length()/2)
                   return true;
               int temp = i;
               if(a.charAt(i)==a.charAt(a.length()-i-1)){
                   while(i<a.length()/2){
                       int j=a.length()-i-1;
                       if(a.charAt(i)!=a.charAt(j)){
                           break;
                       }
                       i++;
                       j--;
                   }
               }
               if(b.charAt(i)==b.charAt(b.length()-i-1) && i!=a.length()/2){
                   i=temp;
                   while(i<a.length()/2){
                       int j=a.length()-i-1;
                       if(b.charAt(i)!=b.charAt(j)){
                           return false;
                       }
                       i++;
                       j--;
                   }
               }
               if(i==a.length()/2)
                   return true;
           }if(b.charAt(0) == a.charAt(b.length()-1)){
               int i;
               for(i=1;i<a.length()/2;i++){
                   if(b.charAt(i)!=a.charAt(n-1)){
                       break;
                   }
                   n--;
               }
               if(i==a.length()/2)
                   return true;
               
               int temp = i;
               if(a.charAt(i)==a.charAt(a.length()-i-1)){
                   while(i<a.length()/2){
                       int j=a.length()-i-1;
                       if(a.charAt(i)!=a.charAt(j)){
                           break;
                       }
                       i++;
                       j--;
                   }
               }
               if(b.charAt(i)==b.charAt(b.length()-i-1) && i!=a.length()/2){
                   i=temp;
                   while(i<a.length()/2){
                       int j=a.length()-i-1;
                       if(b.charAt(i)!=b.charAt(j)){
                           return false;
                       }
                       i++;
                       j--;
                   }
               }
               if(i==a.length()/2)
                   return true;
           }
           return false;   
       }


}
