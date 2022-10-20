package Main;

import implementation.MySinglyCircularLinkedList;
import jdk.internal.icu.text.UnicodeSet;

public class MyMain {
    public static void main(String[] args) {
        MySinglyCircularLinkedList circcularLinkedList = new MySinglyCircularLinkedList();
        circcularLinkedList.traverse();
        UnicodeSet circularLinkedList;
        System.out.println(circularLinkedList.size());
        int element;
        circcularLinkedList.addFirst(element:10);
        circcularLinkedList.addLast(element:20);
        circcularLinkedList.addLast(element:30);
        circcularLinkedList.traverse();
        System.out.println(circularLinkedList.size());
    }
}
