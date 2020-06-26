package com.SixLink;

import java.lang.reflect.Array;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        String str = "(abcd";
//        var reverse = new reverse();
//        reverse.setReversed(str);
//        var check = new theBalancedExpression();
//        String result = check.balancedExpression(str);
//        System.out.println(result);
        stack stack = new stack();
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.push(1);
        stack.print();
//        stack.push(5);
//        stack.push(6);
        System.out.println(stack.min());
        stack.pop();
        stack.print();
        System.out.println(stack.min());
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//        stack.push(10);
//        int value = stack.pop();
//
//        var result = stack;
//        result.print();
//        System.out.println(value);
//        System.out.println(stack.pop());
//        result.print();
//        stack.pop();
//        result.print();
//        stack.push(5);
//        System.out.println(stack.isEmpty());
//        stack.print();
//        System.out.println(stack.peek());
//        System.out.println(stack);

    }

}
