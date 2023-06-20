package ch06.map;




import ch06.listEx2.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 해시맵: 추가할 때 정렬 안함, 성능이 좀 더 좋음
        // 트리맵: 추가할 때 이진 트리로 정렬함, 성능이 떨어짐
        Map<String, Student> students = new HashMap<>();

        // 객체추가 create
        // 키(key, 유일값): 학번
        // 값(value): 학생정보
        // 맵변수.put(엔트리(K, V))
        students.put("e-01-00001", new Student("강애진", 5, 5));
        students.put("e-01-00002", new Student("김소현",6, 6));
        students.put("e-01-00003", new Student("김성우",7, 7));
        students.put("e-01-00004", new Student("조정빈",8,8));

        // 객체 검색/조회 read
        // 맵변수.keyset() -> key 목록을 반환
        // 일반적으로 Map, 연관배열, dictionary, key-value pair
        // 자료구조는 정렬해서 저장하지 않음
        for (String key : students.keySet()){
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
        }
        // 맵변수.values() -> 값 목록을 반환함
//        for (Student student : students.values()){
//            System.out.println(student.getName());
//        }

        System.out.println("----------------------");
        //해시맵을 정렬된 트리맵으로 변환

        for (String key : new TreeMap<>(students).keySet()){
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
        }
        System.out.println("----------------------");

        // 객체의 값 수정 update
        Student s = students.get("e-01-00001");
        s.setName("김스캉");
        // 객체삭제 delete
        students.remove("e-01-00003");

        for (String key : students.keySet()){
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
        }
    }
}
