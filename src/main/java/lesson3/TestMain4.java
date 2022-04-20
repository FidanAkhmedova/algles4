package lesson3;

import lesson3.queue.Queue;
import lesson3.queue.QueueImpl;
import lesson3.stack.StackImpl;

import java.util.*;

public class TestMain4 {

    public static void main(String[] args) {
        testLinkedList();
//        testHomeWork();
//        testIterator();
    }

    private static void testLinkedList() {
        StackImpl<Integer> stack1 = new StackImpl<>(7);
        LinkedDeque<Integer> deque = new LinkedDeque<>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);
        deque.insertRight(5);
        deque.insertRight(6);
        deque.insertRight(7);
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();

//


        System.out.println(deque.getFirst() + " first");
      //  System.out.println(deque.getLast() + " last");
//        deque.removeRight();
        //deque.removeLeft();
       /*  deque.removeRight();
        deque.removeRight();
        deque.removeRight();
        deque.removeRight();deque.removeRight();*/


        deque.display();
       /* TwoSideLinkedListImpl<Integer> linkedList = new TwoSideLinkedListImpl<Integer>();
        //TwoSideLinkedListImpl<Integer> linkedList = new  <Integer>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertMiddle(111, 1);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(11);
//
        linkedList.display();
//
        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 111: " + linkedList.contains(111));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));
//
        System.out.println("remove first: " + linkedList.removeFirst());
        linkedList.remove(4);
        linkedList.remove(111);
//
        linkedList.display();
*/
    }

    private static void testHomeWork() {

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();

        //ДОЛЖНО РАБОТАТЬ!
        for (Integer value : linkedList) {
            System.out.println("value: " + value);
        }
    }


    private static void testIterator() {
        List<Integer> linkedList = new java.util.LinkedList<>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5, 6, 7, 8, 9);























































































































/*        for (Integer integer : linkedList) {
            System.out.println(integer);
        }*/

        ListIterator<Integer> iterator = linkedList.listIterator();
        //first:reset
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer + " до него " + iterator.previous());
            iterator.next();
            if (!iterator.hasNext()) {
                break;
            }
        }
    }
}
