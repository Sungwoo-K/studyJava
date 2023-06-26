package ch09.genericEx;

import java.util.List;

public class CollectionUtil<T> {


    public int countOccurrences(List<T> list, T target){
        int count = 0;
        for (T element:list){
            if(target.equals(element)){
                count++;
            }
        }
        return count;
    }
}
