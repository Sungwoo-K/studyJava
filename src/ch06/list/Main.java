package ch06.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<자료형> 변수명 = new ArrayList<자료형>();
        // 자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형>을 넣는다.
        // 자료형을 매개변수로 받는 것을 제네릭(generic)
        // 매개변수의 자료형은 원시 자료형(primitive type)은 안 됨
        List<String> list = new LinkedList<String>();
        List<Integer> listInt = new ArrayList<Integer>();

        //객체 추가
        list.add("김성우");
        list.add("남소나");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        //특정 위치의 값을 변경
        list.set(0, "강애진");
        list.set(1, "김성우");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        System.out.println(list.size());

        System.out.println("----------------------");

        list.add("이현미");
        list.add("김소현");
        for (String name : list) {
            System.out.println(name);
        }

        list.remove(1);
        System.out.println("----------------------");

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("----------------------");
        list.add(2,"김성우");
        for (String name : list) {
            System.out.println(name);
        }
        //            요소추가   전체 탐색      요소삭제/삽입
        //ArrayList     빠름      빠름          느림(많이)
        //LinkedList    느림      느림          빠름
    }
}
