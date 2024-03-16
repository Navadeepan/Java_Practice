import java.util.PriorityQueue;

public class priorityqueue {
    public static  void main (String[] args){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for( int i = 10; i > 0; i--){
            queue.add(i);
        }
        System.out.println(queue);

        System.out.println("_____________________________________");

        // peek - first value of queue
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("_____________________________________");

        // poll - remove first value of queue
        System.out.println(queue.poll());System.out.println(queue);

        System.out.println("_____________________________________");

    }
}