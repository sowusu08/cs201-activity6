public class ListCount {
    public int count(ListNode list) {
        // APPROACH
        // if the list is null return 0
        // otherwise call count on list.next and add 1

        // EXECUTION
        // if the list is null return 0
        if(list == null) return 0;
        // otherwise call count on list.next, add 1, and return
        return 1 + count(list.next);
    }
}
