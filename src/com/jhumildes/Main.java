package com.jhumildes;

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;

        IntegerLinkedLists list = new IntegerLinkedLists();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(five);
        System.out.println(" ");
        list.printList();

        list.insertSorted(one);
        System.out.println(" ");
        list.printList();

    }
}
