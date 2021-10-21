public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        // 1/ EVALUATING POINTERS
        // these first two if statements only work on the POINTERS to the first nodes
        // we must use .info() to get the content of the actual nodes
        // aka all actual nodes will not be null

        // if both pointers nodes are null return 1
        if(a1 == null && a2 == null) return 1;
        // if pointer is null and the other is not return 0 (the lists are unequal)
        if((a1 == null && a2 != null) || (a1 != null && a2 == null)) return 0;

        // 2. EVALUATING NODES
        // if at least one list's node is not null (the other can be null, this would mean the lists are unequal)
        if(a1.next!=null || a2.next!=null){
            // and the contents of the two nodes are the same, continue to call equal() on subsequent nodes
            if(a1.info == a2.info) return equal(a1.next, a2.next);
        }
        // if we make it this far, that is calling equal() on all parallel nodes
        // does not lead to a return of 0, return 1
        return 1;

    }
}