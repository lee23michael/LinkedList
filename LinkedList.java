package Linkedlist;

public class LinkedList
{
    public static void main(String[] args)
    {
        MyLinkedList myList = new MyLinkedList();
        myList.add(0, 1);
        myList.add(1, 3);
        myList.add(0, 10);
        myList.add(0, -3);
        myList.add(2, 4);
        
        myList.set(0,100);
        myList.remove(3);

        for(int i = 0; i < 4; i++)
        {
            System.out.print(myList.get(i) + "->");
        }
        System.out.println("null");
        //runTest1();

    }


    public static void runTest1()
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode point = node1;

        while ( point != null)
        {
            System.out.print(point.val + "->");
            point = point.next;
        }
        System.out.println("Null");
    }
}
class ListNode
{
    int val;
    ListNode next;
    public ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}