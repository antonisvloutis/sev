package gr.aueb.sev.chapter17.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList(){
        head = tail = null;
    }

    /**
     * Inserts a node in the list at front.
     *
     * @param t the node value to insert..
     */

    public void insertFront(T t){
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        //if(head != null){
        if(isEmpty()){
            tmp.getNext().setPrev(tmp);
        }else{
            tail = tmp;
        }
        head = tmp;
    }

    /**
     * Inserts a node in the list at end.
     * Time complexity is 0(1)
     * @param t the node value to insert
     */

    public void insertEnd(T t){
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;

        //if (tmp.getPrev() == null){
        if (isEmpty()){
            head = tmp;
        }else{
            tmp.getPrev().setNext(tmp);
        }
    }

    /**
     * Deletes the first node in list.
     * Time complexity is 0(1)
     */

    public void deleteFront(){
        if (isEmpty()) return;
        if (head.getNext() == null){
            head = tail = null;
        }else{
            head = head.getNext();
            head.setPrev(null);
        }
    }

    /**
     * Deletes the last node in list.
     * Time complexity is 0(1)
     */

    public void deleteEnd(){
        if (isEmpty()) return;
        if (head.getNext() == null){
            head = tail = null;
        }else{
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    /**
     * Searches for a node in the list with a value t.
     * Time complexity is linear.
     * @param t the node to search for
     * @return  a reference to the  node if exists, null otherwise
     */
    public Node<T> get(T t){
        for(Node<T> n = head; n != null; n = n.getNext()){
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }

    /**
     * Traverses the list.
     * Time complexity is linear.
     */
    public void traverse(){
        for(Node<T> n = head; n != null; n = n.getPrev()){
            System.out.println(n);
        }
    }

    public boolean isEmpty(){
        return (head == null) && (tail == null);
    }
}
