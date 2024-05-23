import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseKitems
{
    public static void reverseKnums(Queue<Integer> q, int n)
    {
        int size=q.size()-n;
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<n; i++)
            s.push(q.remove());

        for(int i=0; i<size; i++)
        {
            while(!s.isEmpty())
            {
                q.add(s.pop());
            }
            q.add(q.remove());
        }
    }
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverseKnums(q, 5);
        while(!q.isEmpty())
            System.out.print(q.remove()+"   ");
    }
}
