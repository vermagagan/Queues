
import java.util.Stack;
public class QueueUsingStacks
{
    public static class Queue
    {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        //IsEmpty
        public static Boolean isEmptyQ()
        {
            return s1.isEmpty();
        }

        //add
        public static void add(int n)
        {
            while(!s1.isEmpty())
                s2.push(s1.pop());
            
            s1.push(n);

            while(!s2.isEmpty())
                s1.push(s2.pop());
        }


        //remove
        public static int remove()
        {
            if(isEmptyQ())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }
        //peek
        public static int peek()
        {
            if(isEmptyQ())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[])
    {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmptyQ())
        {
            System.out.print(q.remove()+"  ");
        }
    }
}
