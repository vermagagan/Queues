import java.util.LinkedList;
import java.util.Queue;
public class Interleave
{
    public static void interLeave(Queue<Integer> q)
    {
        Queue<Integer> firsthalf=new LinkedList<>();
        int size=q.size()/2;
        for(int i=0; i<size; i++)
            firsthalf.add(q.remove());

        while(!firsthalf.isEmpty())
        {
            System.out.print(firsthalf.peek()+" ");
            q.add(firsthalf.remove());
            
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);

        // while(!q.isEmpty())
        //     System.out.print(q.remove()+"  ");
    }
}
