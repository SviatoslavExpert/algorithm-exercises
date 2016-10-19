package com.akhambir.algorithms.data_structures.add_two_numbers;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void shouldMergeTwoListsWithoutResidues() {
        ListNode listNode1 = new ListNode(2);
        listNode1.setNext(new ListNode(5));
        listNode1.getNext().setNext(new ListNode(1));

        ListNode listNode2 = new ListNode(7);
        listNode2.setNext(new ListNode(3));
        listNode2.getNext().setNext(new ListNode(3));

        ListNode actualObject = new ListNode(9);
        actualObject.setNext(new ListNode(8));
        actualObject.getNext().setNext(new ListNode(4));

        Assert.assertEquals(addTwoNumbers.addTwoNumbers(listNode1, listNode2).toString(), actualObject.toString());

    }

    @Test
    public void shouldMergeTwoListsWithResidues() {
        ListNode listNode1 = new ListNode(4);
        listNode1.setNext(new ListNode(6));
        listNode1.getNext().setNext(new ListNode(1));

        ListNode listNode2 = new ListNode(8);
        listNode2.setNext(new ListNode(4));
        listNode2.getNext().setNext(new ListNode(3));

        ListNode actualObject = new ListNode(2);
        actualObject.setNext(new ListNode(1));
        actualObject.getNext().setNext(new ListNode(5));

        Assert.assertEquals(addTwoNumbers.addTwoNumbers(listNode1, listNode2).toString(), actualObject.toString());
    }

    @Test
    public void shouldMergeTwoListsWithDifferentLengthWithoutResidues() {
        ListNode listNode1 = new ListNode(1);
        listNode1.setNext(new ListNode(4));
        listNode1.getNext().setNext(new ListNode(3));

        ListNode listNode2 = new ListNode(5);

        ListNode actualObject = new ListNode(6);
        actualObject.setNext(new ListNode(4));
        actualObject.getNext().setNext(new ListNode(3));

        Assert.assertEquals(addTwoNumbers.addTwoNumbers(listNode1, listNode2).toString(), actualObject.toString());
    }

    @Test
    public void shouldMergeTwoListsWithDifferentLengthWithResidues() {
        ListNode listNode1 = new ListNode(5);
        listNode1.setNext(new ListNode(9));
        listNode1.getNext().setNext(new ListNode(9));
        listNode1.getNext().getNext().setNext(new ListNode(9));

        ListNode listNode2 = new ListNode(5);

        ListNode actualObject = new ListNode(0);
        actualObject.setNext(new ListNode(0));
        actualObject.getNext().setNext(new ListNode(0));
        actualObject.getNext().getNext().setNext(new ListNode(0));
        actualObject.getNext().getNext().getNext().setNext(new ListNode(1));

        Assert.assertEquals(addTwoNumbers.addTwoNumbers(listNode1, listNode2).toString(), actualObject.toString());
    }
}
