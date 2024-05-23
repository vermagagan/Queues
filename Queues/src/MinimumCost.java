import java.util.PriorityQueue;
public class MinimumCost
{
    public static int minCost(int len[], int size)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<size; i++)
            pq.add(len[i]);

        int res=0;
        while(pq.size()>1)
        {
            int first = pq.poll();
            int sec = pq.poll();
            res += first+sec;
            pq.add(first+sec);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int len[] = {4, 3, 2, 6};
        int size=len.length;
        System.out.println("The minimum cost ot join ropes is: "+minCost(len, size));
    }
}
