import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String x[]){
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int k = 3;
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

            // Remove indicesw out of window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) { //  3 <= 2 
                dq.pollFirst();
                // remove 1 
                // 3's index store dq = 1

            }
            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }   
            dq.addLast(i); 
            // add = 1
            // add = 3
            //

            if (i >= k - 1) { 
                // 0 >= 2
                // 1 >= 2
                // 2 >= 2
                result.add(nums[dq.peekFirst()]); 3 
            }

        
    //     dq.addLast(40);
    //    int index = ((List<Integer>) dq).indexOf(40);
    //    System.out.println(index);
    }

}