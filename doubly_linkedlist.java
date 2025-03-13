class Node{
    public int data;
    public Node next;
    public Node back;

    public Node(int data, Node next, Node back){
        this.data= data;
        this.next= next;
        this.back= back;
    }
    public Node(int data){
        this.data= data;
        this.next= null;
        this.back= null;
    }
}
public class doubly_linkedlist {
    public static Node convTo2DLL(int arr[]){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1; i<=arr.length-1; i++){
            Node temp= new Node(arr[i], null, mover);
            mover.next= temp;
            temp.back= mover;
            mover= temp;
        }
        return head;
    }
    //print function
    public static void print(Node head){
        while(head!= null){
            System.out.print(head.data + " ");
            head= head.next;
        }
    }

    //length of linkedlist
    public static int Length(Node head){
        int count= 0;
        Node temp= head;
        while(temp != null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    //remove head
    public static Node removeHead(Node head){
        if(head == null) return head;
        head= head.next;
    return head;
    }

    //remove tail
    public static Node removeTail(Node head){
        if(head== null || head.next==null) return null;
        Node temp= head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next= null;
    return head;
    }

    // //remove kth element
    public static Node removeKthEle(Node head, int k){
        if(head == null) return null;
        Node temp= head;
        int count= 0;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp= temp.next;
        }
        if(temp == null) return head;
        Node tempBack= temp.back;
        Node tempNext= temp.next;
        if(tempBack == null) {
            head= temp.next;
            if(head != null) head.back= null;
            return head;
        }
        if(tempNext == null){
            tempBack.next= null;
            return head;
        }
        tempBack.next= tempNext;
        tempNext.back= tempBack;
    return head;        
    }

    //remove element k (except head: normally won't be asked, it takes some more code)
    public static void removeEleK(Node temp){
        Node tempNext= temp.next;
        Node tempBack= temp.back;

        if(tempNext == null){
            tempNext= null;
            temp.back= null;
            return;
        }
        tempBack.next= tempNext;
        tempNext.back= tempBack;
        return;
    }

    //insert.
    //insert element before head //assuming more than 1 element present
    public static Node insertEleBefHead(Node head, int val){
        Node newNode= new Node(val, head, null);
        head.back= newNode;
    return newNode;
    }

    // insert element before tail 
    public static Node insertEleBefTail(Node head, int val){
        if(head.next == null) return insertEleBefHead(head, val);
        Node temp= head;
        while(temp.next != null){
            temp= temp.next;
        }
        Node tempBack= temp.back;
        Node newNode= new Node(val, temp, tempBack);
        tempBack.next= newNode;
        temp.back= newNode;
    return head;
    }

    // insert element before kth element
    public static Node insertBefKthEle(Node head, int val, int k){
        Node temp= head;
        int count= 0;
        if(k == 1) return insertEleBefHead(head, val);
        while(temp.next != null){
            count++;
            if(count == k){
                break;
            }
            temp= temp.next;
        }
        Node tempBack= temp.back;
        Node newNode= new Node(val, temp, tempBack);
        tempBack.next= newNode;
        temp.back= newNode;
    return head;
    }

    // insert element given node //except head
    public static void insertBefNodeK(Node node, int val){
        Node prev= node.back;
        Node newNode= new Node(val, node, prev);
        prev.next= newNode;
        node.back= newNode;
    return;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};

        // //print doubly linkedlist
        Node head= convTo2DLL(arr);
        // print(head);

        // //print length
        // int len= Length(head);
        // System.out.println("length of DLL is: " + len);

        // //remove head
        // head= removeHead(head);     
        // print(head);   

        // // remove tail
        // head= removeTail(head);
        // print(head);

        // // remove kth element
        // head= removeKthEle(head, 8);
        // print(head);

        // //remove element k
        // removeEleK(head);
        // print(head);


        // INSERT
        
        // // insert element before head
        // head= insertEleBefHead(head, 108);
        // print(head);

        // // insert element before tail
        // head= insertEleBefTail(head, 108);
        // print(head);

        // // insert element before kth element
        // head= insertBefKthEle(head, 108, 1);
        // print(head);
        
        // insert element before node
        insertBefNodeK(head.next.next.next.next, 108);
        print(head);
    }
}
