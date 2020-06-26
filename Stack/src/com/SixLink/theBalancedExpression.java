package com.SixLink;

import java.util.Stack;

public class theBalancedExpression {
    public String balancedExpression(String str){
        Stack<Character>stack = new Stack<>();
        Character closedBract =  (')');
        Character OpenBract =  ('(');
        Character closedPrant=  (']');
        Character OpenPrant =  ('[');
        Character closedSign =  ('>');
        Character OpenSign =  ('<');

        for (int i = 0; i< str.length();i++) {
            Character object = (str.charAt(i));
            if (object.equals(OpenBract) || object.equals(OpenPrant) || object.equals(OpenSign)) {
                stack.push(object);
                continue;
            }
            if (object.equals(closedBract)) {
                if (stack.pop() == OpenBract) {
                    continue;
                }
                else return "Expression NOT Balanced";
            }
            if (object.equals(closedPrant)) {
                if (stack.pop() == OpenPrant) {
                    continue;
                }
                else return "Expression NOT Balanced";
            }
            if (object.equals(closedSign)) {
                if (stack.pop() == OpenSign) {
                    continue;
                }
                else return "Expression NOT Balanced";
            }
        }
        if (stack.empty()){
            return "Expression is Balanced";
        }else return "Expression NOT Balanced";
    }
}
