package com.SixLink;

import java.util.Stack;

    public class reverse {
        public void setReversed(String str){

        Character newStr = null;
        Stack<Character> stack = new Stack<>();
            for (int i = 0; i <str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuffer reversed = new StringBuffer();
            while (!stack.empty()){
            reversed.append(stack.pop());
        }

            System.out.println(reversed);
    //        System.out.println(newStr);
    }
}
