package lesson09;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls_933 {
    //Sử dụng Queue:
    public void RecentCounter() {
    }
    Queue<Integer> myQueue = new LinkedList<>();
    public int ping(int t) {
        myQueue.add(t);

        //Nếu peek < t-3000 -> remove ra
        int peek = myQueue.peek();
        while (peek < t - 3000) {
            myQueue.remove();
            peek = myQueue.peek();
        }
        //Return số phần tử còn lại của queue
        return myQueue.size();
    }
}
