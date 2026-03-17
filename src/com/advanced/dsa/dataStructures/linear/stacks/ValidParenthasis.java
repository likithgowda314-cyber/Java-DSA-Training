package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class ValidParenthasis {
    static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        // "{[()]} => {'{','[','(',')',']','}'};
        for (char c : s.toCharArray()){
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                // in all the mismatch cases return false
                if (c=='}' && top!='{') return false;
                if (c==']' && top!='[') return false;
                if (c==')' && top!='(') return false;

            }
        }
        // the string is a valid parenthesis if all thr brackets are removed
        // it is invalid even if one chararcter is present in it
        // this will happen when there are mismatched brackets
        return  stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 ="{[()]}";
        String s2 ="{{)[](}}";
        String s3 = " {[]{)(})";
        System.out.println(s1 + " ->"+(isValidParenthesis(s1)? "Valid":"Invalid"));
        System.out.println(s1 + " ->"+(isValidParenthesis(s2)? "Valid":"Invalid"));
        System.out.println(s1 + " ->"+(isValidParenthesis(s3)? "Valid":"Invalid"));
    }
}
