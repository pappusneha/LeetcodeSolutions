package org.practise;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
      ListNode result = mergeTwoLists(new ListNode(1 , new ListNode(2, new ListNode(4))),
              new ListNode(1, new ListNode(3, new ListNode(4))));

      while(result != null){
          System.out.println(result.val);
          result = result.next;
      }
    }

    private static ListNode mergeTwoLists(ListNode listNode, ListNode listNode1) {

        ListNode dummy = new ListNode();
        ListNode result = dummy;

        while(listNode != null && listNode1 != null){
            if(listNode.val > listNode1.val){
                result.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                result.next = listNode;
                listNode = listNode.next;
            }
            result = result.next;
        }
        result.next = (listNode != null) ? listNode : listNode1;
        return dummy.next;
    }

}


