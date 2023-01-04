package string;

public class RomanToInteger {

    // Link : https://leetcode.com/problems/roman-to-integer/description/

    public int romanToIntBrute(String s) {

        int count=0;
        for(int i=0;i<s.length();i++){
            if((i+1)<s.length()){
                if(s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                    count+=4;
                    i++;
                }else if(s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                    count+=9;
                    i++;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                    count+=40;
                    i++;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                    count+=90;
                    i++;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                    count+=400;
                    i++;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                    count+=900;
                    i++;
                }
                else if(s.charAt(i)=='I'){
                    count++;
                }
                else if(s.charAt(i)=='V'){
                    count+=5;
                }
                else if(s.charAt(i)=='X'){
                    count+=10;
                }
                else if(s.charAt(i)=='L'){
                    count+=50;
                }
                else if(s.charAt(i)=='C'){
                    count+=100;
                }
                else if(s.charAt(i)=='D'){
                    count+=500;
                }
                else if(s.charAt(i)=='M'){
                    count+=1000;
                }
            }
            else if(s.charAt(i)=='I'){
                count++;
            }
            else if(s.charAt(i)=='V'){
                count+=5;
            }
            else if(s.charAt(i)=='X'){
                count+=10;
            }
            else if(s.charAt(i)=='L'){
                count+=50;
            }
            else if(s.charAt(i)=='C'){
                count+=100;
            }
            else if(s.charAt(i)=='D'){
                count+=500;
            }
            else if(s.charAt(i)=='M'){
                count+=1000;
            }
        }
        return count;


    }


    public int romanToInt(String s) {


        int n = s.length();
        int prev = getIntValue(s.charAt(n-1));
        int num = prev;

        for(int i=n-2;i>=0;i--){

            int curr = getIntValue(s.charAt(i));

            if(curr < prev){
                num-=curr;
            }else{
                num+=curr;
            }

            prev = curr;

        }

        return num;


    }

    public int getIntValue(char c){

        switch(c){

            case 'I' : return 1;

            case 'V' : return 5;

            case 'X' : return 10;

            case 'L' : return 50;

            case 'C' : return 100;

            case 'D' : return 500;

            case 'M' : return 1000;

            default : return -1;
        }

    }


}
