package Linkedlist;

public class MyLinkedList
{
    //private  ListNode head;
    private ListNode dummy = new ListNode(-1);
    public void add(int index, int val)
    {

       /* if(index > 0)
        {
            ListNode pre = head;
            for(int i = 0; i < index - 1; i++)
            {
                pre = pre.next;
            }
            ListNode newNode = new ListNode(val);
            newNode.next = pre.next;
            pre.next = newNode;
        }
        else
        {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }*/
        ListNode newNode = new ListNode(val);
        ListNode cur = dummy;
        for (int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;

    }

    public int get (int index)
    {
        /*
        ListNode cur = head;
        for(int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        return cur.val;
        */
        ListNode cur = dummy.next;
        for(int i = 0; i <index; i++)
        {
            cur = cur.next;
        }
        return cur.val;
    }


    public void set ( int index, int newVal)
    {
        /*
        ListNode cur = head;
        for ( int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        cur.val = newVal;

        */
        ListNode cur = dummy;
        for(int i = 0; i <=index; i++)
        {
            cur = cur.next;
        }
        cur.val = newVal;
    }


    public int remove (int index)
    {
        /*
        ListNode removed = null;
        if(index == 0)
        {
            removed = head;
            head = head.next;
        }
        else
        {
            ListNode pre = head;
            for(int i = 0; i < index-1; i++)
            {
                pre= pre.next;
            }

            removed = pre.next;
            pre.next = pre.next.next;
        }
        return removed.val;
        */
        ListNode res = null;
        ListNode cur = dummy;
        for(int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        res = cur.next;
        cur.next = cur.next.next;

        return res.val;
    }



}

