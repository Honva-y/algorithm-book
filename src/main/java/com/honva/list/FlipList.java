package com.honva.list;

/**
 * Description 链表反转
 * @Author honva
 * @Date 2020/5/4
 **/
public class FlipList {

    public static void main(String[] args) {
        ListNode init = new ListNode();
        ListNode head = new ListNode();
        for (int i = 1; i < 6; i++) {
            ListNode curr = new ListNode();
            curr.setValue(i);
            if(init.value==null) {
                init = curr;
                head = curr;
            }else {
                init.nextNode = curr;
                init = curr;
            }
        }
        ListNode before = head;
        while (head!=null){
            System.out.println(head.value);
            head = head.nextNode;
        }

        ListNode after = method(before);
        System.out.println("转换过后");

        while (after!=null){
            System.out.println(after.value);
            after = after.nextNode;
        }
    }
    public static ListNode method(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode tempNode = curr.nextNode;
            curr.nextNode = pre;
            pre = curr;
            curr = tempNode;
        }
        return pre;
    }

    public static class ListNode{
        Integer value;
        ListNode nextNode = null;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public ListNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }
    }
}


