package com.SixLink;

import java.util.Arrays;

public class stack {
    private int[] array = new int[5];
    private int size = 0;

    public stack(){

    }
    public int pop(){
        if (size <= 0)
            throw new IllegalStateException();
        int copy= array[size-1];
        size--;
        newArray(size);
        return copy;
    }

    public void push(int item){
        if(isEmpty()){
            newArray(5);
        }
        if (array.length <= size){
            newArray(size*2);
        }
        array[size] = item;
        size++;
    }

    private int[] newArray(int length){
        var copyArray = array;
        array = new int[length];
        for (int i = 0; i<size;i++){
            array[i] = copyArray[i];
        }
        return array;
    }

    public int peek(){
        if (size<=0){
            throw new IllegalStateException();
        }
        return array[size-1];
    }
    public boolean isEmpty(){
        return (size <= 0);
    }
    public void print(){
        int[] printArray = new int[size];
        for (int i = 0;i<size;i++){
            printArray[i] = array[i];
        }
        System.out.println(Arrays.toString(printArray));
    }
    public int min(){
        int min = array[0];
        for (int i = 1; i<size;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public String toString(){
        int[] copy = Arrays.copyOfRange(array,0, size);
        return Arrays.toString(copy);
    }
}
