package livesession.L14_16;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInBuild {
    public static void main(String[] args) {
        PriorityQueue<Character> chars = new PriorityQueue<>();
        chars.add('v');
        chars.add('i');
        chars.add('s');
        chars.add('w');
        chars.add('a');
        System.out.println(chars);
        System.out.println(chars.poll());
        System.out.println(chars);
        System.out.println(chars.peek());
        System.out.println(chars);
        chars.remove();
        System.out.println(chars);
        chars.remove();
        System.out.println(chars);
        chars.remove();
        System.out.println(chars);
    }
}
