import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {
        // APPROACH
        // initialize TreeSet "unique" (unique words sorted)
        // loop through each element in words and add to "unique"

        // initialize first node in "linkedWords" with the value of first word in unique, pointing to null

        // set "afterMe" to point to "linkedWords" (aka what linkedWords is pointing to aka initially first node)
        // loop through elements 1 through length of "unique"
            // set afterMe.next.next to value of length of element pointing to null
            // update afterMe to afterMe.next

        // EXECUTION
        // initialize TreeSet "unique" (unique words sorted)
        TreeSet<String> unique = new TreeSet<>();
        // loop through each element in words and add to "unique"
        for(String w : words){
            unique.add(w);
        }

        // add elements in "unique" to ArrayList
        ArrayList<String> wordsList = new ArrayList<>();
        for(String e : unique){
            wordsList.add(e);
        }

        //Collections.sort(wordsList);
        //String first = wordsList.get(0);
        // initialize first node in "linkedWords" with the value of first word in unique, pointing to null
        ListNode linkedWords = new ListNode(wordsList.get(0).length(), null);

        // set "afterMe" to point to "linkedWords" (aka what linkedWords is pointing to aka initially first node)
        ListNode afterMe = linkedWords;

        // loop through elements 1 through length of "wordsList"
        for(int i = 1; i < wordsList.size(); i++) {
            // set afterMe.next (what what the node pointed at by afterMe is pointing to) to value of length of element, pointing to null
            afterMe.next = new ListNode(wordsList.get(i).length(), null);
            // update afterMe to afterMe.next
            afterMe = afterMe.next;
        }
        return(linkedWords);
    }
}