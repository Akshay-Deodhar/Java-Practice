package javapractice.year2021.month06.date18;

import javapractice.utils.ListNode;

/**
 * https://leetcode.com/problems/sort-list/
 */

public class LeetCodeP0148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        if(isListSortedNonDescending(head)) {
            return head;
        }
        // System.out.println("head " + head.val);
        ListNode pivot = head, sList = new ListNode(-1_000_000), gList = new ListNode(-1_000_000);
        ListNode temp = head.next, sTemp = sList, gTemp = gList, temp2;
        while(temp != null) {
            temp2 = temp.next;
            if(temp.val > pivot.val) {
                gTemp.next = temp;
                temp.next = null;
                gTemp = gTemp.next;
            } else {
                sTemp.next = temp;
                temp.next = null;
                sTemp = sTemp.next;
            }
            temp = temp2;
        }
        gList = sortList(gList.next);
        sList = sortList(sList.next);
        sList = joinLists(sList, new ListNode(pivot.val));
        sList = joinLists(sList, gList);
        return sList;
        
    }

    public ListNode joinLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode temp = list1;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2;
        return list1;
    }

    private boolean isListSortedNonDescending(ListNode head) {
        ListNode temp = head;
        while(temp.next != null) {
            if(temp.val > temp.next.val) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
