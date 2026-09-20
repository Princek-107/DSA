import java.util.*;

public class Main {
    public static void main(String[] args) {

        // =========================
        // MIN HEAP
        // =========================

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);
        minHeap.add(15);

        System.out.println("Min Heap: " + minHeap);

        // Smallest element
        System.out.println("Top: " + minHeap.peek());

        // Remove smallest
        System.out.println("Removed: " + minHeap.poll());

        System.out.println("After poll: " + minHeap);


        // =========================
        // MAX HEAP
        // =========================

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);
        maxHeap.add(15);

        System.out.println("\nMax Heap: " + maxHeap);

        // Largest element
        System.out.println("Top: " + maxHeap.peek());

        // Remove largest
        System.out.println("Removed: " + maxHeap.poll());

        System.out.println("After poll: " + maxHeap);
    }
}