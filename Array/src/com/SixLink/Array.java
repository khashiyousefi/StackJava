package com.SixLink;

import java.sql.SQLOutput;
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

//        if (array.length == count){
//            int[] newArray = new int[count * 2];
//            for (int i = 0; i < count; i++){
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//
//        array[count] = item;
//        count ++;
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

    public void max(){
        int max = 0;
        for (int i = 1; i < length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The Max Value is: " + max);
    }

    public void reverseArray(){
        int lastIndex = length-1;
        int[] reverseArray = new int[length];
        for (int i = 0; i < length;i++){

            if (i > lastIndex){
                break;
            }

            reverseArray[lastIndex] = array[i];
            reverseArray[i] = array[lastIndex];
            lastIndex--;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    public Array intersection(Array otherArray){
        var intersected = new Array(length);

        for(int item : array){
            if (otherArray.indexAt(item) >= 0){
                intersected.insert(item);
            }
        }
        return intersected;
    }

    public void removeAt(int index){
        copyArray = array;
        length--;
        int validIndex = 0;
        setArray(length);
        for (int i = 0; i<= length;i++){
            if (i == index){
                continue;
            }
            array[validIndex] = copyArray[i];
            validIndex++;

        }

//        for (int i = index; i < count-1;i++)
//            array[i] = array[i+1];
//
//        //length--;
//        count--;
     }
    public void insertAt(int item, int index){
        if ((index > length-1) || (index < 0)){
            System.out.println("Please enter an index in range to be inserted");
        }else {
            length++;
            copyArray = array;
            setArray(length);
            System.arraycopy(copyArray,0,array,0,copyArray.length);
            //array[index]= item;
            for(int i = length-1; i > index; i--){
                array[i]= array[i-1];
            }
            array[index] = item;
        }
    }

    public int indexAt(int target){

        for (int i = 0; i < length; i++){
            if (array[i] == target){
                indexOf = i;
                break;
            } else indexOf = -1;
        }
        return indexOf;
    }
    public void print(){
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < length; i++){
//            System.out.println(array[i]);
//        }


    }

}
