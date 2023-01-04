package stackandqueues;

import java.util.Stack;

public class ValidParentheses {


    // Link : https://leetcode.com/problems/valid-parentheses/description/
    public boolean isValid(String s) {

        // if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' ){
        //     return false;
        // }
        Stack<Character> STACK = new Stack<Character>();

        if(s.length()%2 == 1)
            return false;

        for(int i=0;i<s.length();i++){
            if(!STACK.empty()){
                if(STACK.peek()=='(' && s.charAt(i)==')'){
                    STACK.pop();
                }else if(STACK.peek()=='{' && s.charAt(i)=='}'){
                    STACK.pop();
                }else if(STACK.peek()=='[' && s.charAt(i)==']'){
                    STACK.pop();
                }else{
                    STACK.push(s.charAt(i));
                }
            }
            else{
                STACK.push(s.charAt(i));
            }
        }
        if(STACK.empty()){
            return true;
        }
        return false;
    }

}
