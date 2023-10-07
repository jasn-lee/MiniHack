import org.w3c.dom.Node;

public class Arena<T> {
    public Attributes<T> head;
    public Attributes<T> tail;

    private int count;


    public boolean add(T s) {
		Attributes<T> newNode = new Attributes<T>();
		newNode.setTimeWorked(s);
		if (count == 0) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
		
		count++;
		return true;
	}



    
}
