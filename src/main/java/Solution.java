import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] res = new int[2];
        int[] map = new int[arr.length - 1];
        Arrays.fill(map, arr.length - 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(i -> (double) arr[i] / arr[map[i]]));
        for(int i = 0; i < arr.length - 1; i++ ) {
            pq.offer(i);
        }
        while(true) {
            int index = pq.poll();
            //System.out.println(arr[index] + " / " + arr[ map[index]]);
            map[index]--;
            if(map[index] != index) {
                pq.offer(index);
            }
            k--;
            if(k == 0) {
                res[0] = arr[index];
                res[1] = arr[map[index] + 1];
                break;
            }

        }

        return res;
    }
}
