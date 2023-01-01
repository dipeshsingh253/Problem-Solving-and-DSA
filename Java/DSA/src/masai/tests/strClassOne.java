package masai.tests;

class strClassOne implements stringFunctions{
  // implement all the function inherited by this class
  public void print(String a, String b){
      // This function prints both the strings on the same line separated by space
      
      System.out.println(a+" "+b);
      
  }
  
  
  public int countVowels(String a,String b){
     // This function returns the length of the string having lesser number of vowels. 
    //In case both the strings, have the same number of vowels return the length of the
    //bigger string
    
    int count1 = vowelCount(a);
    int count2 = vowelCount(b);
    
    if(count1>count2){
        return b.length();
    }else if(count1<count2){
        return a.length();
    }
    
    return Math.max(a.length(),b.length());
    
      
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
  
    public int countConsonants(String a,String b){
       // This function returns the length of the string having lesser number of consonants
       // In case both the strings have the same number of consonants, return the length 
       //of the bigger string
        int count1 = consonantCount(a);
        int count2 = consonantCount(b);
        
        if(count1>count2){
            return b.length();
        }else if(count1<count2){
            return a.length();
        }else{
            return a.length() > b.length() ? a.length() : b.length();
        }
       
       
    }

    @Override
    public int valueOfString(String a, String b) {
        return 0;
    }
}