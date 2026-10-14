import java.util.ArrayDeque;
import java.util.Queue;
public class Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque <Integer> a1=new ArrayDeque<>();
        a1.push(40);
        a1.push(399);
        a1.push(42);
        System.out.println(a1);
        a1.pop();
        System.out.println(a1);

        a1.offer(96);
        a1.offer(56);
        System.out.println(a1);

        a1.poll();
        System.out.println(a1);
        System.out.println(a1.peek());





    }
}
