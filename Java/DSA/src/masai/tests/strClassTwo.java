package masai.tests;

class strClassTwo implements stringFunctions{
  // implement all the function inherited by this class
  public String print(String a,String b){
      // This functions prints string a and string b on two different lines
       System.out.println(a);
        System.out.println(b);
  }
    public int countVowels(String a,String b){
       // This function returns the length of the string having more number of vowels. 
      //In case both the strings, have the same number of vowels return the length of the smaller string
    
      
        int count1 = vowelCount(a);
        int count2 = vowelCount(b);
        
        
        if(count1>count2){
            return a.length();
        }else if(count1<count2){
            return b.length();
        }else{
            return a.length() < b.length() ? a.length() : b.length();
        }
       
      
    }
    
    
    public int countConsonants(String a,String b){
       // This function returns the length of the string having more number of consonants
       // In case both the strings have the same number of consonants, return the
       //length of the smaller string
    
        int count1 = consonantCount(a);
        int count2 = consonantCount(b);
        
        if(count1>count2){
            return a.length();
        }else if(count1<count2){
            return b.length();
        }else{
            return a.length() < b.length() ? a.length() : b.length();
        }
       
        
        
    }
    
    
    
    int vowelCount(String s){
      
      int cnt = 0;
      
      for(char c : s.toCharArray()){
          
          if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117){
              cnt++;
          }
          
      }
      
      return cnt;
      
    }
  
  
  
    int consonantCount(String s){
      
      int cnt = 0;
      
      for(char c : s.toCharArray()){
          
          if(c != 97 || c != 101 || c != 105 || c != 111 || c != 117){
              cnt++;
          }
          
      }
      
      return cnt;
      
    }
}