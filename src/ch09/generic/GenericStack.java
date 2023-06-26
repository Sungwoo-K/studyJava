package ch09.generic;

//스택(Stack)
//메소드 호출
//웹 뒤로가기

import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T item){
        stack.addLast(item);
    }

    public T pop() {
        return stack.removeLast();
    }
}
