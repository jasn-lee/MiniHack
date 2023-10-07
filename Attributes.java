import org.w3c.dom.Node;

public class Attributes<E> {
    public E timeWorked;
    public E goals;
    public E points;

    private Attributes<E> next;

    public E getTimeWorked() {
        return timeWorked;
    }
    public void setTimeWorked(E data) {
        this.timeWorked = data;
    }

    public E getGoals() {
        return goals;
    }
    public void setGoals(E data) {
        this.goals = data;
    }

    public E getPoints() {
        return points;
    }
    public void setPoints(E data) {
        this.points = data;
    }


    public Attributes<E> getNext() {
		return next;
	}
	public void setNext(Attributes<E> next) {
		this.next = next;
	}
    
}
