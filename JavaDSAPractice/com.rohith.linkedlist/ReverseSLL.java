public class ReverseSLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(1);
        Node forth = new Node(11);

        head.next = second;
        second.next = third;
        third.next = forth;

        print(head);

        Node res = reverse(head);

        print(res);
    }
    public static Node reverse(Node head) {
        Node current = head;
        Node nxt = null;
        Node prev = null;

        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        return prev;
    }

    public static void print(Node head) {
        Node current = head;
        
        while (current != null) {
            
            System.out.print(current.data);
            
            if (current.next != null) {
                System.out.print(" --> ");
            }
            
            current = current.next;
        }
        System.out.println(" --> null");
    }
}
