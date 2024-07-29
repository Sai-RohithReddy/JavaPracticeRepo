public class DetectCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        print(head);

        Node loopStartNode = getLoopStartNode(head);
        if (loopStartNode != null) {
            System.out.println("Loop started at: " + loopStartNode.data);
        } else {
            System.out.println("No Cycle detected.");
        }

        removeCycle(head);

        loopStartNode = getLoopStartNode(head);
        if (loopStartNode != null) {
            System.out.println("Loop started at: " + loopStartNode.data);
        } else {
            System.out.println("No Cycle detected.");
        }

        print(head);

    }
    public static boolean isCycle(Node head) {
        Node sp = head;
        Node fp = head;

        while (fp != null && sp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (fp == sp) return true;
        }
        return false;
    }
    public static void print(Node head) {
        if (isCycle(head)) {
            System.out.println("Cycle detected!");
            return;
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) System.out.print(" -> ");
                current = current.next;
            }
            System.out.println(" -> null");
        }
    }
    public static Node getLoopStartNode(Node head) {
        Node sp = head;
        Node fp = head;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if (sp == fp) {
                Node temp = head;
                while (sp != temp) {
                    temp = temp.next;
                    sp = sp.next;
                }
                return sp;
            }
        }
        return null;
    }
    public static void removeCycle(Node head) {
        Node sp = head;
        Node fp = head;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if (sp == fp) {
                Node temp = head;
                while (sp.next != temp.next) {
                    temp = temp.next;
                    sp = sp.next;
                }
                sp.next = null;
                return;
            }
        }
    }
}
