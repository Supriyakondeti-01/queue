import java.util.PriorityQueue;
import java.util.Queue;
public class queue1 {
    public static void main(String[] args) {
        Queue <Integer>p1=new PriorityQueue<>();
        p1.offer(30);
        p1.offer(45);
        System.out.println(p1);
        p1.add(20);
        System.out.println(p1);
        p1.poll();
        System.out.println(p1);
        System.out.println(p1.peek());


    }

}
