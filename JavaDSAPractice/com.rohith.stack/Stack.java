public class Stack {
    public Node top;

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        Node res = top;
        top = top.next;
        return res.data;
    }

    
}
