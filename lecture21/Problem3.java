public class Problem3 {
    static Node arrayToList(int[] arr){
        int lastInd = arr.length - 1;
        Node head = new Node(arr[lastInd], null);
        for (int i = lastInd - 1; i >=0 ; i--) {
            head = new Node(arr[i], head);
        }
        return head;
    }
    static void showList(Node head){
        Node step = head;
        while(step != null){
            System.out.print(step.val + " ");
            step = step.next;
        }
        System.out.println();
    }

    static Node[] extract(Node head){
        Node headEvenNode = null;
        Node headOddNode = null;
        Node lastEvenNode = null;
        Node lastOddNode = null;
        Node step = head;
        while (step != null){
            if(step.val % 2 == 0){
                if(lastEvenNode != null){
                    lastEvenNode.next = step;
                } else {
                    headEvenNode = step;
                }
                lastEvenNode = step;

            } else {
                if(lastOddNode != null){
                    lastOddNode.next = step;
                } else {
                    headOddNode = step;
                }
                lastOddNode = step;
            }

            step = step.next;
        }
        lastEvenNode.next = null;
        lastOddNode.next = null;
        return new Node[]{headEvenNode, headOddNode};
    }

    public static void main(String[] args) {
        int[] tab = { 2, 1, 4, 3, 6, 5, 7, 8 };
        Node head = arrayToList(tab);
        showList(head);
        Node[] nodes = extract(head);
        showList(nodes[0]);
        showList(nodes[1]);
    }
}
