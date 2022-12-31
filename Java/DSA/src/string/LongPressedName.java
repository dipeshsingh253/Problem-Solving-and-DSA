package string;

public class LongPressedName {

    // Link : https://leetcode.com/problems/long-pressed-name/description/


    public boolean isLongPressedName(String name, String typed) {

        int namePointer = 0;
        int typedPointer = 0;

        int n = name.length();
        int t = typed.length();

        while(namePointer < n && typedPointer < t){

            if(name.charAt(namePointer) == typed.charAt(typedPointer)){
                namePointer++;
                typedPointer++;




                if(namePointer == n){
//  System.out.println(name.charAt(namePointer-1) + " " + typed.charAt(typedPointer-1));
                    for(int i=typedPointer;i<t;i++){
                        //  System.out.println(name.charAt(namePointer-1) + " " + typed.charAt(typedPointer-1));
                        if(typed.charAt(i) != name.charAt(namePointer-1)){
                            return false;
                        }
                    }

                    return true;

                }

            }else if(typedPointer > 0 && typed.charAt(typedPointer) == typed.charAt(typedPointer-1)){
                typedPointer++;
            }else{
                return false;
            }

        }

        if(namePointer < n) {

            return false;

        }else if(typedPointer < t){
            return false;
        }else{
            return true;
        }




    }

}



// alex
// aaleex

// 0 0
// 1 1
// 1 2
// 2 3
// 3 4
// 3 5
// 4 6

// saeed => s:1 a:1 e:2 d:1
// ssaaedd => s:2 a:2 e:1 d:2