import java.util.LinkedList;
import java.util.Queue;
public class generateBinarynums
{
    public static void generateBinarynumbers(int n)
    {
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-- > 0)
        {
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void printQueue(Queue<String> q)
    {
        while(!q.isEmpty())
            System.out.print(q.remove()+" ");
    }
    public static void main(String args[])
    {
        int n=15;
        generateBinarynumbers(n);
        //System.out.println(n%2);
    }
}
