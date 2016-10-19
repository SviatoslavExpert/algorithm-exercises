package com.akhambir.algorithms.data_structures.add_two_numbers;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String toString() {
        if(this.next == null) {
            return "[ " + this.val + " ]";
        }

        ListNode ln = this;

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        for( ; ; ln = ln.next) {
            sb.append(ln.val);
            if (ln.next == null) {
                return sb.append(" ]").toString();
            }
            sb.append(", ");
        }
    }
}
