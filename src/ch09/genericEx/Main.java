package ch09.genericEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int target = 1;   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        System.out.println("--------------------");
        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String strTarget = "apple";   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<String> util2 = new CollectionUtil<>();
        int occurrenceCount2 = util2.countOccurrences(strList, strTarget);

        System.out.println("Number of occurrences of " + strTarget + ": " + occurrenceCount2);



    }
}
