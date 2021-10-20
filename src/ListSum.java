public class ListSum {
    public int sum(ListNode list, int thresh) {
        // APPROACH
        // if list is null return null
        // if list.info < threshold return sum(list.next)
        // otherwise return list.info + sum(list.next)

        // EXECUTE
        // if list is null return 0
        if(list == null) return 0;
        // if list.info <= (if the number is the threshold don't count it) threshold return sum(list.next) aka move to the next node
        if(list.info <= thresh) return sum(list.next, thresh);
        // otherwise return list.info + sum(list.next)
        return list.info + sum(list.next, thresh);
    }
}