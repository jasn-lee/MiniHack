public class Node {
    private Person person;
    private Node next;

    public Person getPerson() {
        return person;
    }
    
/// setBook (Book book) ///
/// Input : Object of Type -- Book ///
/// Output: sets the variable book as the input ///
    public void setPerson(Person person) {
        this.person = person;
    }

/// getNext () ///
/// Input : n/a ///
/// Output: returns the next node ///
    public Node getNext() {
        return next;
    }

/// setNext (the particular node you want to set next from) ///
/// Input : Node Type of next ///
/// Output: sets the next ///
    public void setNext(Node next) {
        this.next = next;
    }
    
}
