package com.akhambir.algorithms.data_structures;

public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return somethingRec(l1, l2, 0);
    }

    private ListNode somethingRec(ListNode a, ListNode b, int add) {
        if(a == null && b == null)
            return add != 0 ? new ListNode(add) : null;

        int sum = getValue(a) + getValue(b) + add;

        ListNode line = new ListNode(sum % 10);
        line.next = somethingRec(getNext(a), getNext(b), sum / 10);

        return line;
    }

    private int getValue(ListNode ln){
        return null != ln ? ln.val : 0;
    }

    private ListNode getNext(ListNode ln) {
        return ln != null ? ln.next : null;
    }
}
