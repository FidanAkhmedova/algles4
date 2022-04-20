package lesson3;
public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E>{

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size == 1) {
            last = first;
        }
        else if (size == 2){
            last.prev = first;
        }
        if (first.next != null){
            System.out.println("insert node " + value + "  -> next "+ first.next.value);
        }

        if (first.prev != null){

            System.out.println("node " + value + "  -> prev "+ first.prev.value);
        }
    }
    @Override
    public void insertMiddle(E value, int position) {
        super.insertMiddle(value, position);
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        else if (size == position){
            insertLast(value);
            return;
        }
        Node<E> newNode = new Node<>(value, null, null);
        Node<E> current = first;
        int i = 0;
        while (current != null) {
            if (i == position-1) {
                newNode.prev = current;
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            i++;
            current = current.next;
        }
    }

    @Override
    public void insertLast(E value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        //last.next = last = new Node<>(value, null, null);
        Node<E> newNode = new Node<>(value, null, last);
        last.next = newNode;
        System.out.println("last.prev = " + last.prev.value);
        System.out.println("last = " + last.value);

        last = newNode;
        System.out.println("last.prev = " + last.prev.value);
        System.out.println("last = " + last.value);


        if (last.next != null ){
            System.out.println("insert node " + value + " last -> next "+ last.next.value);
        }
        if ( last.prev != null)
            System.out.println("node " + value + " last -> prev "+ last.prev.value);

        size++;
        if (size == 2){
            first.next = last;
        }
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if (isEmpty()) {
            last = null;
        }
        else if (size == 1){
            last = first;
        }

        return removedValue;
    }

    @Override
    public E removeLast() {
        E removedValue = super.removeLast();
        if (isEmpty()) {
            last = null;
        }
        else if (size == 1){
          last = first;
        }
        return removedValue;
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
        if (current == last) {
            last = previous;
            last.next = null;
        }

        previous.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    @Override
    public E getLast() {
        if (isEmpty()){
            return null;
        }
        return last.value;
    }
}
