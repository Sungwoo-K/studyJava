package ch09.genericEx;

import java.util.LinkedList;

public class Cache<T> {
    private T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
