package com.SixLink;

import java.util.Arrays;
import java.util.Stack;

public class twoStack {
    int[] array = new int[10];
    int size1 = 0;
    int size2 = 9;
    public void push1(int item) {
        if (size1>4)
            throw new StackOverflowError();
        array[size1] = item;
        size1++;
    }
    public void push2(int item){
        if (size2 < 5)
            throw new StackOverflowError();
        array[size2] = item;
        size2--;
    }
    public int pop1(){
        if (size1 == 0)
            throw new IllegalStateException();
        return array[--size1];
    }
    public int pop2(){
        if (size2 == 9)
            throw new IllegalStateException();
        return array[++size2];
    }
    public boolean isEmpty1(){
        return (size1 == 0);
    }
    public boolean isEmpty2(){
        return (size2 == 9);
    }
    public boolean isFull1(){
        return (size1 == 4);
    }
    public boolean isFull2(){
        return (size1 == 5);
    }
    @Override
    public String toString(){
        var copy1 = Arrays.copyOfRange(array,0,size1);
        var copy2 = Arrays.copyOfRange(array,size2+1,10);

        return (Arrays.toString(copy1) +" " + Arrays.toString(copy2)) ;
    }
}
