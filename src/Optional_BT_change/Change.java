package Optional_BT_change;

import BT_stack.Stack;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (num != 0){
            if(num%2 == 1){
                num = (num-1)/2;
                stack.push(1);
                continue;
            }else
                num = num/2;
                stack.push(0);
        }
        stack.push(0);
        System.out.println("He nhi phan la: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
