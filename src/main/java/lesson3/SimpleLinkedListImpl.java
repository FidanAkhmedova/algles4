package lesson3;

import java.util.Iterator;

public class SimpleLinkedListImpl<E> implements LinkedList<E>, Iterable<E>{

    protected Node<E> first;
    protected Node<E> last;
    protected int size;

    @Override
    public void insertFirst(E value) {
        Node <E> newNode = new Node<>(value, first, null );
        if (first != null )
            first.prev = newNode;
        first = newNode;
        size++;

    }
    @Override
    public void insertMiddle(E value, int position) {
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = first;
        first = removedNode.next;
        removedNode.next = null;
        size--;
        return removedNode.value;
    }
    @Override
    public boolean contains(E value) {
        return indexOf(value) != null;
    }

    private Node<E> indexOf(E value) {
        Node<E> current = first;

        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public E removeLast () {
        if (isEmpty()) {
            return null;
        }
        if (size == 1){
            E removedValue = last.value;
            remove(last.value);
            return removedValue;
        }

        Node<E> removedNode = last;
        last = removedNode.prev;
        removedNode.prev = null;
        last.next = null;
        size--;
        return removedNode.value;
    }

    @Override
    public boolean remove(E value) {

        Node<E> previous = null;
        Node<E> current = first;

        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == first) {
            removeFirst();
            return true;
        }
        previous.next = current.next;
        current.next = null;
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        if (isEmpty())
            return;
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "empty";
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = first;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        return sb.append("]").toString();

    }

    @Override
    public E getFirst() {
        if (isEmpty()){
            return null;
        }
        return first.value;
    }


    @Override
    public Iterator<E> iterator() {

        return null /*new ListIterator<>()*/;
    }

/*    private class ListIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

//        reset()
    }*/
}
