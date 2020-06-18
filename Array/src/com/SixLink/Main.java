package com.SixLink;

public class Main {

    public static void main(String[] args) {
        var array = new Array(4);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);


        array.removeAt(1);
        array.print();
        array.indexAt(5);
    }
}
