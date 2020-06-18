package com.SixLink;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int[] copyArray;
    private int index = 0;
    private int count;
    private int length;
    private int indexOf;

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

        if (array.length == count){
            int[] newArray = new int[count * 2];
            for (int i = 0; i < count; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[count] = item;
        count ++;
//        if (index < length) {
//            array[index] = item;
//            index++;
//        }else {
//            length++;
//            copyArray = array;
//            setArray(length);
//            //transferArray();
//            System.arraycopy(copyArray,0,array,0,copyArray.length);
//            //array = copyArray;
//            insert(item);
//        }
    }
    public void removeAt(int index){
//        copyArray = array;
//        length--;
//        int validIndex = 0;
//        //setArray(length);
//        for (int i = index; i< length;i++){
//            if (i == index){
//                continue;
//            }
//            array[validIndex] = copyArray[i];
//            validIndex++;
//
//        }
        for (int i = index; i < count-1;i++)
            array[i] = array[i+1];

        //length--;
        count--;
    }

    public void indexAt(int target){

        for (int i = 0; i < count; i++){
            if (array[i] == target){
                indexOf = i;
                break;
            } else indexOf = -1;
        }
        System.out.println(target + " Index is: " + indexOf);
    }
    public void print(){
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < count; i++){
            System.out.println(array[i]);
        }


    }

}
