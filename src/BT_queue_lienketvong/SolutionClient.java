package BT_queue_lienketvong;

public class SolutionClient {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.Queue queue = new Solution.Queue();
        System.out.println(solution.isEmpty(queue));
        solution.enQueue(queue,1);
        solution.enQueue(queue,2);
        solution.enQueue(queue,3);
        solution.enQueue(queue,4);
        solution.displayQueue(queue);
        System.out.println();
        System.out.println(solution.deQueue(queue));
        System.out.println(solution.deQueue(queue));
        System.out.println(solution.isEmpty(queue));
    }
}
