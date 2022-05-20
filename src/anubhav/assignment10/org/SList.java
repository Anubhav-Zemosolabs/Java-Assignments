package anubhav.assignment10.org;


public class SList<E> {
    private Node<E> headLink = new Node<E>();

    SListIterator<E> iterator() { return new SListIterator<>(headLink); }

    @Override
    public String toString() {
        if(headLink.next == null) return "SList: [blank]";

        SListIterator<E> it = this.iterator();
        StringBuilder str = new StringBuilder("");
        while(it.hasNext()) {

            str.append(it.Next().e).append(" , ");
        }
        return str.toString();
    }
}
