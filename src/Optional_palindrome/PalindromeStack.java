package Optional_palindrome;

import java.util.LinkedList;
import java.util.EmptyStackException;

public class PalindromeStack<T> {
    private LinkedList<T> stack;

    public PalindromeStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }
}
