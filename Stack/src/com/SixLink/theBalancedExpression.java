package com.SixLink;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class theBalancedExpression {
    private final List<Character> open = Arrays.asList('(', '{','[','<');
    private final List<Character> close = Arrays.asList(')','}',']','>');
    private Character closedBract =  (')');
    private Character openBract =  ('(');
    private Character closedPrant=  (']');
    private Character openPrant =  ('[');
    private Character closedSign =  ('>');
    private Character openSign =  ('<');
    private Character closedCurly =  ('}');
    private Character openCurly =  ('{');
    private Stack<Character>stack = new Stack<>();
    public String balancedExpression(String str){



        for (int i = 0; i< str.length();i++) {
            Character object = (str.charAt(i));
            isOpen(object);
            if (!isClosed(object)) return "Expression NOT Balanced";
        }
        if (stack.empty()){
            return "Expression is Balanced";
        }else return "Expression NOT Balanced";
    }


    private void isOpen(Character item){
        if (open.contains(item))
            stack.push(item);
    }

    private boolean isClosed(Character item){
        if (stack.empty()) return false;
        if (item.equals(closedBract))
            return  (stack.pop() == openBract);
        else if (item.equals(closedPrant))
            return (stack.pop() == openPrant);
        else if (item.equals(closedSign))
            return (stack.pop() == openSign);
        else if (item.equals(closedCurly))
            return (stack.pop() == openCurly);
        else return true;
    }

}
