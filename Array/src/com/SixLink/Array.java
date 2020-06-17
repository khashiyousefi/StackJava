package com.SixLink;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int[] copyArray;
    private int index = 0;
    private int length;

    public Array(int length){
        setArray(length);
    }
    private void setArray(int length){
        int[] array = new int[length];
        this.array = array;
        this.length = length;
    }

    private void transferArray(){
        for (int i = 0; i < copyArray.length; i++){
            array[i] = copyArray[i];
        }
    }

    public void insert(int item){
        if (index < length) {
            array[index] = item;
            index++;
        }else {
            length++;
            copyArray = array;
            setArray(length);
            //transferArray();
            System.arraycopy(copyArray,0,array,0,copyArray.length);
            //array = copyArray;
            insert(item);
        }
    }
    public void removeAt(int index){
        copyArray = array;
        length--;
        int validIndex = 0;
        setArray(length);
        for (int i = 0; i< copyArray.length;i++){
            if (i == index){
                continue;
            }
            array[validIndex] = copyArray[i];
            validIndex++;

        }


    }
    public void print(){
        System.out.println(Arrays.toString(array));


    }
    public void indexOf(){

    }
}
