package ch09.genericEx2;

import ch06.listEx2.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("김성우", 12,12));


        for (Object a:list) {
            if(a instanceof Student){
                System.out.println(((Student) a).getName());
            }
            System.out.println(a);

//            파일철 같은걸로 정리
//            파일철 <학생장부>
//            파일철 <선생장부>
//            기능은 <제네릭>에 들어가는 타입에 따라 기능이 달리한다.
        }
    }
}
