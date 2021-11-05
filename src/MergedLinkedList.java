import java.util.LinkedList;

public class MergedLinkedList {
    public static void main(String[] args) {

ListNode node = new ListNode(1);
        node = addFront(node,9);
        node = addFront(node,5);
        node = addFront(node,2);
        node = addFront(node,9);
        node = addBack(node,6);
//        node =deletek(node,2);
        node =deletek(node,9);
     
while(node!=null)
{
    System.out.println(node.val);
    node =node.next;
}


    }

    public static ListNode addFront(ListNode node , int data)
    {

     //make new node
        ListNode newNode = new ListNode(data);

        //connect newNode to node
        newNode.next =node;
        // move node to newNode
        node = newNode;

        return node;

    }

    public static ListNode addBack(ListNode node , int data)
    {

   //make new node
        ListNode newNode = new ListNode(data);

        //travers to end
        ListNode curr = node;
        while (curr.next != null)
            curr = curr.next;
        //point last node to newNode
        curr.next = newNode;
        return node;

    }

    public static ListNode deletek(ListNode node , int data)
    {

    //return if null
        if (node == null)
            return node;

        //if data is first elements or first elements
        while (node.val == data && node != null)
        {
            node =node.next;

            if (node == null)
                break;
        }

        // if only 1 or elements
        if (node == null)
            return node;

        //find all data to be removed
        ListNode curr = node;

        while (curr.next != null)
        {
            if (curr.next.val == data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }



        return node;

    }
    public static ListNode delete(ListNode node , int data)
    {

        if (node == null) return node;

        ListNode current = node;
        while (current.next != null)
        {
            if (current.next.val == data)
            {
                current.next=current.next.next;
                break;
            }
            current = current.next;
        }


        return node;

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode next = head;


        while (l1 != null || l2 != null)
        {

            if (l1==null) {
                next.next = l1;
                break;
            }
            else if (l2 == null) {
                next.next = l2;
                break;
            }
            if (l1.val < l2.val)
            {
                next.next = l2;
                l2 = l2.next;
            }else
            {
                next.next =l1;
                l1 = l1.next;
            }
            next = next.next;
        }
        return head.next;
    }
}
  class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }

  }
