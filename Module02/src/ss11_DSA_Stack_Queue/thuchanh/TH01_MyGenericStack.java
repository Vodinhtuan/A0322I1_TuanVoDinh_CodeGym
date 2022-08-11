package ss11_DSA_Stack_Queue.thuchanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class TH01_MyGenericStack<T> {
    LinkedList linkedList = new LinkedList();
    private LinkedList<T> stack;

    public TH01_MyGenericStack() {
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public int size() {
        return stack.size();
    }

}
