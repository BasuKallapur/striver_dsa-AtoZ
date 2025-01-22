class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data= data1;
        this.next= next1;
    }
    Node(int data1){
        this.data= data1;
        this.next= null;
    }
}
public class linkedlist {
    private static Node convArr2LL(int arr[]){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1; i<=arr.length-1; i++){
            Node temp= new Node(arr[i]);
            mover.next= temp;
            mover= temp;
        }
        return head;
    }

    //length of LinkedList
    private static int lenOfLL(Node head){
        int count= 0;
        Node temp= head;
        while(temp != null){
            temp= temp.next;
            count++;
        }   
    return count;
    }

    //remove head of LinkedList
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head= head.next;
        }
    }
    
    //remove head
    public static Node removeHead(Node head){
        if(head == null) return head;
        head= head.next;
    return head;
    }
    //remove tail
    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp= head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next= null;
    return head;
    }

    //remove kth element
    public static Node removeKthElement(Node head, int k){
        if(head == null) return head;
        if(head.data == k){
            head= head.next;
        return head;
        }
        Node temp= head;
        Node prev= null;
        while(temp != null){
            if(temp.data == k){
                prev.next= prev.next.next;
                break;
            }
            prev= temp;
            temp= temp.next;
        }
    return head;
    }

    //remove element k
    public static Node removeElementK(Node head, int k){
        if(head == null) return head;
        if(k == 1){
            head= head.next;
            return head;
        }
        Node temp= head;
        Node prev= null;
        while(temp != null){
            if(temp.data == k){
                prev.next= prev.next.next;
                break;
            }
            prev= temp;
            temp= temp.next;
        }
    return head;
    }

    //insert head 
    public static Node insertAtBeginning(Node head, int val){
        return new Node(val, head);
    }

    //insert at the end
    public static Node insertAtEnd(Node head, int val){
        if(head == null) return new Node(val);
        Node temp= head;
        while(temp.next != null){
            temp= temp.next;
        }
        Node newNode= new Node(val);
        temp.next= newNode;
        return head;

    }

    //insert new element at kth position
    public static Node insertElementAtK(Node head, int k, int ele){
        if(head == null){
            if(k == 1){
                return new Node(ele, head);
            }
        }
        Node temp= head;
        int count =0;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newNode= new Node(ele);
                newNode.next= temp.next;
                temp.next= newNode;
                break;
            }
            temp= temp.next;
        }
    return head;
    }

    //

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        Node head= convArr2LL(arr);

        // int n= lenOfLL(head);
        // System.out.println("length of LL is: " + n); //length of LinkedList
        
        // head= removeHead(head);  //removes head
        // print(head);

        // head= removeTail(head);
        // print(head);

        // head= removeKthElement(head, 1);
        // print(head);

        // head= removeElementK(head, 2);
        // print(head);

        // head= insertAtBeginning(head, 100);
        // print(head);        // or without using function.
        // head= new Node(100, head);
        // print(head);

        // head= insertAtEnd(head, 108);
        // print(head);

        // head= insertElementAtK(head, 3, 108);
        // print(head);
        

    }
}
