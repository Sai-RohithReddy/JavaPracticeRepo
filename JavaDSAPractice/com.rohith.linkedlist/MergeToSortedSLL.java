public class MergeToSortedSLL {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node second1 = new Node(4);
        Node third1 = new Node(8);

        head1.next = second1;
        second1.next = third1;

        Node head2 = new Node(3);
        Node second2 = new Node(6);
        Node third2 = new Node(7);

        head2.next = second2;
        second2.next = third2;

        Node res = merge(head1, head2);

        DetectCycle.print(res);
    }
    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
    }
}
