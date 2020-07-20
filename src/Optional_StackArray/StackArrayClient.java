package Optional_StackArray;

public class StackArrayClient {
    public static void main(String[] as) throws Exception {
        StackArray stack = new StackArray(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println(stack.isFull());
//        stack.push(0);

        System.out.printf("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
//        stack.pop();

        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
    }
}
