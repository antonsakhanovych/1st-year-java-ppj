public class SortedSLL {
    private Node head;
    SortedSLL(){
        this.head = null;
    }

    void addSorted(int val){
	if (this.head == null) {
	    this.head = new Node(val);
	} else {
	    Node tmp = this.head;
	    if (this.head.val() > val) {
		this.head = new Node(val, this.head);
	    } else {
		while (tmp.next() != null && tmp.next().val() < val) {
		    tmp = tmp.next();
		}
		tmp.next(new Node(val, tmp.next()));
	    }
	}
    }
    void show(){
        Node step = this.head;
        while(step != null){
            System.out.print(step.val() + " ");
            step = step.next();
        }
    }
}
