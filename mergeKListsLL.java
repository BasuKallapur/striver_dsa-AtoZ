// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class mergeKListsLL {

  public static ListNode mergeTwoLists(ListNode i, ListNode j) {
    ListNode temp = new ListNode(-1);
    ListNode dummy = temp;

    while (i != null && j != null) {
      if (i.val <= j.val) {
        temp.next = i;
        i = i.next;
      } else {
        temp.next = j;
        j = j.next;
      }
      temp = temp.next;
    }
    if (i != null)
      temp.next = i;
    if (j != null)
      temp.next = j;

    return dummy.next;
  }

  public static ListNode mergeKLists(ListNode[] lists) {
    if (lists.length == 0)
      return null;
    if (lists.length == 1)
      return lists[0];
    ListNode head = lists[0];
    for (int j = 1; j < lists.length; j++) {
      ListNode currNode = lists[j];
      if (currNode == null)
        continue;
      head = mergeTwoLists(head, currNode);
    }

    return head;
  }

  // Helper to print a linked list
  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val);
      if (head.next != null)
        System.out.print(" -> ");
      head = head.next;
    }
    System.out.println();
  }

  // Helper to create linked list from array
  public static ListNode createList(int[] arr) {
    ListNode dummy = new ListNode(-1);
    ListNode current = dummy;
    for (int num : arr) {
      current.next = new ListNode(num);
      current = current.next;
    }
    return dummy.next;
  }

  // Main function for testing
  public static void main(String[] args) {
    // Sample input: [[1,4,5],[1,3,4],[2,6]]
    ListNode[] lists = new ListNode[3];
    lists[0] = createList(new int[] {1, 4, 5});
    lists[1] = createList(new int[] {1, 3, 4});
    // lists[2] = createList(new int[] {2, 6});

    ListNode merged = mergeKLists(lists);
    System.out.print("Merged List: ");
    printList(merged);
  }
}
