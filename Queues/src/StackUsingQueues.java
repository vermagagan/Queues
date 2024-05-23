import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues
{
    public static class Stack
    {
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        
        //isemptyS

        public static Boolean isEmptyS()
        {
            return q1.isEmpty();
        }

        //push
        public static void push(int n)
        {
            while(!q1.isEmpty())
                q2.add(q1.remove());

            q1.add(n);
            
            while(!q2.isEmpty())
                q1.add(q2.remove());
        }

        //pop
        public static int pop()
        {
            if(isEmptyS())
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        //peek
        public static int peek()
        {
            if(isEmptyS())
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmptyS())
        {
            System.out.println(s.pop());
        }
    }
}
