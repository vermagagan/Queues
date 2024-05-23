import java.util.LinkedList;
import java.util.Queue;
public class maxofAll
{
    public static void maxAll(int arr[], int k)
    {
        Queue<Integer> q=new LinkedList<>();
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<i+3 && j<arr.length; j++)
            {
                if(max < arr[j])
                    max=arr[j];
            }
            q.add(max);
        }
        printQueue(q);
    }
    public static void printQueue(Queue<Integer> q)
    {
        while(!q.isEmpty())
            System.out.print(q.remove()+" ");
    }
    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k=3;
        maxAll(arr, k);
    }
}
