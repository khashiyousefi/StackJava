package com.SixLink;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class linkedListStack {

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void push(int value){
        Node node = new Node(value);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int pop(){
        if (first == null)
            throw new NoSuchElementException();
        int result = last.value;
        Node current = first;
        if (first == last){
            first = last = null;
            size--;
            return result;
        }
        while(current != null){
             if (current.next == last){
                last = current;
                last.next = null;
                size--;
            }
            current = current.next;
        }
        return result;
    }

    public void toArray(){
        if (first == null){
            System.out.println("[]");
            return;
        }
        int[] array = new int[size];
        Node current =  first;
        int i = 0;
        while(current != null){
            array[i] = current.value;
            current = current.next;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
