public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // APPROACH
        // if a1 == null && a2 != null || a1 != null && a2 == null return 0
        // if a1.info == a2.info call equal(a1.next, a2.next)
        // return 1

        // EXECUTION
        // if one of the lists is empty and the other is not return 0 (not equal)
        if((a1 == null && a2 != null) || (a1 != null && a2 == null)) return 0;
        // if both lists are empty return 1 (equal)
        if(a1 == null && a2 == null) return 1;

        // if a next node exists, call equals on the next node
        if(a1.next != null) return equal(a1.next, a2.next);

        // if contents of a1 and a2 are not the same return 0 and stop
        if(a1.info != a2.info) return 0;

        return 1;
        // if a1.info == a2.info call equal(a1.next, a2.next)
        /*if(a1.info == a2.info){
            if(a1.next != null && a2.next != null) {
                equal(a1.next, a2.next);
            }
        }*/
        // return 1
    }
}