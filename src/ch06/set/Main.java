package ch06.set;

import ch06.mapEx.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("양수열", 20);
//        Student s2 = new Student("박재욱", 10);
//        Student s3 = s1;
//        Student s4 = new Student("박재욱", 10);
//
//        System.out.println("s1 : " + s1.hashCode());
//        System.out.println("s2 : " + s2.hashCode());
//        System.out.println("s3 : " + s3.hashCode());
//        System.out.println("s4 : " + s4.hashCode());
//
//        System.out.println(s1.equals(s3));
//
//        // 객체 추가
//        Set<String> sets = new HashSet<>();
//        sets.add("apple");
//        sets.add("banana");
//        sets.add("cherry");
//        sets.add("durian");
//        sets.add("elderberry");
//
//        // 객체 탐색/조회
//        for (String s : sets){
//            System.out.println(s);
//        }
//
//        System.out.println(sets.contains("cherry"));
//
//        // 삭제
//        sets.remove("cherry");

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("durian");
        list.add("elderberry");
        list.add("durian");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------------");
        for (String s : new TreeSet<>(list)){
            System.out.println(s);
        }


    }
}
