public class Node {
    private final int val;
    private Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
    int val(){
        return this.val;
    }
    Node next(){
        return this.next;
    }
    void next(Node next){
        this.next = next;
    }


}
