public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        // APPROACH (non-recursion)
        // initialize pointer to a1 current1
        // iniitalize pointer to a2 current2

        // if one list is empty and the other is not return 0

        // while current1 != null loop through its nodes
            // if current1.info != current2.info return 0
            // set current1 to current1.next and current2 to current2.next
        // return 1

        // EXECUTION (non-recursive)
        // if one list is empty and the other is not return 0
        /*
        if((a1 == null && a2 != null) || (a1 != null && a2 == null)) return 0;
        // initialize pointer to a1 current1
        ListNode current1 = a1;
        // initalize pointer to a2 current2
        ListNode current2 = a2;

        // while current1 != null loop through its nodes
        while(current1 != null && current2 != null) {
            // if current1.info != current2.info return 0
            if(current1.info != current2.info){return 0;}
            // set current1 to current1.next and current2 to current2.next
            current1 = current1.next;
            current2 = current2.next;
        }
        // return 1
        return 1;
*/


        // EXECUTION (recursive)
        // if the next node in one of the Linkedlists is null and the next node in the other is not
        // the LinkedLists are not equal sizes, return 0
        /*if((a1 == null && a2 != null) || (a1 != null && a2 == null)) return 0;
        if((a1.next == null && a2.next != null) || (a1.next != null && a2.next == null)) return 0;

        // only call equals if a1.info == a2.info
        if(a1.info == a2.info) {
            if(a1.next != null){equal(a1.next, a2.next);}
        } else {
            // otherwise return 0
            return 0;
        }

        // if we make it this far that means all the elements are equal
        return 1;*/


        // if a1.info != a2.info return 0
        // if a1.next != null && a2.next != null continue to check for equivalency
            // if a1.info == a2.info call equal()
            // return 1

        /*ListNode current1 = a1;
        ListNode current2 = a2;

        if((current1 == null && current2 != null) || (current1 != null && current2 == null)) return 0;
        if(current1 == null && current2 == null) return 1;

        if(current1 != current2) return 0;
        // while current1 != null loop through its nodes
        while(current1.next != null || current2.next != null) {
            current1 = current1.next;
            current2 = current2.next;
            // if current1.info != current2.info return 0
            if(current1.info != current2.info){return 0;}
            // set current1 to current1.next and current2 to current2.next

        }

        return 1;*/

        if(a1 == null && a2 == null) return 1;
        if((a1 == null && a2 != null) || (a1 != null && a2 == null)) return 0;

        if(a1.next!=null || a2.next!=null){
            if(a1.info == a2.info) return equal(a1.next, a2.next);
        }
        return 1;

    }
}