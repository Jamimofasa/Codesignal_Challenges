public class SingleLinkedList {

    private Node head;

    public boolean isEmpty()
    {
        return (head == null);

    }

    public void addToFront(int data)
    {
        //make new node
        Node node = new Node();
        //insert data
        node.data = data;
        //connect new node to head
        node.next = head;
        head = node;
    }

    public void addToBack(int date)
    {
        Node node = head;
        Node newNode = new Node();
        // search to back of linked list
        while (node.next != null)
            node =node.next;
        newNode.data = date;
        node.next = newNode;

    }
     public void deleteAfter(int data)
     {
         Node after = new Node();
         after.data = data;
         Node node = head;

         while (node.next != null && node.data != after.data)
         {
             node = node.next;

         }
         if (node.next != null)
             node.next = node.next.next;

         if (node.next == null)
         {
             System.out.printf("%d does not exist in this list\n", data);

         }

     }
    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    @Override
    public String toString()
    {
        String s ="";
        Node node = head;

        while (node != null){
            s += "<-" + Integer.toString(node.data) ;
            node = node.next;
        }System.out.print("null");
        return s;
    }

    public static void main(String[] args)
    {

        SingleLinkedList j = new SingleLinkedList();
        j.addToFront(3);
        j.addToFront(2);
        j.addToBack(7);
        j.deleteFirst();
        j.deleteAfter(5);

        System.out.println(j.toString());

    }

}
class Node{
    Node next;
    int data;
}
