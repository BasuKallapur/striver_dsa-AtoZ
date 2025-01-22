import java.util.Arrays;
import java.util.List;

class Node {
    int data;
    Node next;

    // Constructor to initialize Node with data and next reference
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor to initialize Node with data only (next is null)
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class insert_At_End_LL {
    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to insert a new node at the head of the linked list
    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    // Function to create a linked list from a list of integers
    public static Node createLinkedList(List<Integer> arr) {
        if (arr.isEmpty()) {
            return null;
        }
        Node head = new Node(arr.get(0)); // Create the head node
        Node current = head;

        // Iterate through the list and create the linked list
        for (int i = 1; i < arr.size(); i++) {
            current.next = new Node(arr.get(i));
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = createLinkedList(arr);

        // Inserting a new node at the head of the linked list
        head = insertHead(head, val);

        // Printing the linked list
        printLL(head);
    }
}
