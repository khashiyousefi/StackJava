package com.SixLink;

import java.lang.reflect.Array;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String str = "(abcd";
        var reverse = new reverse();
        reverse.setReversed(str);
        var check = new theBalancedExpression();
        String result = check.balancedExpression(str);
        System.out.println(result);


    }

}
