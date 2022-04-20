package lesson3;

public interface TwoSideLinkedList<E>  extends LinkedList<E> {

    void insertLast(E value);
    //void insertMiddle(E value);

    E getLast();
}
