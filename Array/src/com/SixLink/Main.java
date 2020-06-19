package com.SixLink;

public class Main {

    public static void main(String[] args) {
        var array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insertAt(50, 1);

        array.print();
//        array.insert(50);
//        array.insert(60);
//        array.insert(70);
//        array.insert(80);
//        array.insert(90);
//        var matchArray = new Array(3);
//        matchArray.insert(10);
//        matchArray.insert(10);
//        matchArray.insert(10);



//        array.removeAt(1);
//        array.print();
//        System.out.println("Target index is: " + array.indexAt(40));
//        array.max();
//
////        System.out.println("Matching items are: ");
////        array.intersection(matchArray).print();
//
//        array.reverseArray();
    }
}
