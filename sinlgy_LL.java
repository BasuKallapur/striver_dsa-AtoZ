class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sinlgy_LL {
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverseLL(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node getMiddleOfLL(Node head) {
        if (head == null || head.next == null)
            return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        // print values
        printLL(head);
        System.out.println();

        // get Middle of LL
        Node middle = getMiddleOfLL(head);
        System.out.println(middle.data);

        // // reverse LL
        // Node newNode= reverseLL(head);
        // printLL(newNode);



        // lets reverse from middle
        Node right = middle.next;
        middle.next = null; // seperate right and left part

        System.out.print("left half: ");
        printLL(head);
        System.out.println();
        System.out.print("right half: ");
        printLL(right);

        System.out.println();
        right= reverseLL(right);
        printLL(right);

        // merge to get final result
        middle.next = right;
        System.out.println();
        System.out.print("after merging: ");
        printLL(head);


        System.out.println("---------------");
        printLL(right);


    }
}
