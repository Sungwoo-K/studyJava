package ch06.listEx;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("cherry");
        list.add("apple");
        list.add("banana");

        System.out.println(list.size());
        System.out.println("-------------------");
        System.out.println(list.get(1));
        System.out.println("-------------------");
        list.remove("banana");
        list.add("strawberry");
        list.add(2, "orange");
        System.out.println(list);
        System.out.println("리스트가 비어있나요? : " + list.isEmpty());
        System.out.println("-------------------");

        //9번 순번정렬 (검색함)
        Collections.sort(list);
        System.out.println();
        System.out.println("-------------------");

        //10번 긴 문자열 찾기
        String longestResult = "";
        for (String name : list) {
            if(name.length() > longestResult.length()){
                longestResult = name;
            }
        }
        System.out.println("가장 긴 문자열은 : " + longestResult);
        System.out.println("-------------------");
        //11번 짧은 문자열 찾기
        String shoutestName = list.get(0);
        for (String name : list) {
            if(name.length() < shoutestName.length()){
                shoutestName = name;
            }
        }
        System.out.println("가장 짧은 문자열은 : " + shoutestName);
        System.out.println("-------------------");

        //12번 대문자로 변환
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
        System.out.println(list);
        System.out.println("-------------------");
        //13번 요소들 거꾸로 배치
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("-------------------");
        //14번 list 에 있는 체리요소 확인
        if(!list.contains("CHERRY")) {
            System.out.println("체리가 없습니다.");
        } else {
            System.out.println("체리가 있습니다.");
        }
        System.out.println("-------------------");

        //15번 리스트의 마지막 요소 확인
        list.remove(list.size() - 1);
        System.out.println(list);
    }
}
