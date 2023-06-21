package ch06.mapEx;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        //2번
        students.put("23-001", new Student("김성우", 28));
        students.put("23-002", new Student("김스캉", 27));
        students.put("23-003", new Student("강민기", 25));
        students.put("23-004", new Student("최준형", 29));
        students.put("23-005", new Student("정재현", 25));

        //3번
        Student callStudent = students.get("23-002");

        //4번
        students.remove("23-002");

        //5번
        for (String key : students.keySet()){
            System.out.println("이름 : " + students.get(key).getName() + ", 나이 : " + students.get(key).getAge());
        };
        System.out.println("-----------------------------");

        //6번
        int ageAverage = 0;
        int sum = 0;
        for (String key : students.keySet()){
            sum += students.get(key).getAge();
        };
        ageAverage = sum / students.size();
        System.out.println("나이의 평균값 : " + ageAverage);

        //7번
        int mostBiggerAge = 0;
        Student oldStudent = null;
        for (String key : students.keySet()) {
            if(students.get(key).getAge() > mostBiggerAge){
                mostBiggerAge = students.get(key).getAge();
            }
        }
        for (String key : students.keySet()) {
            if(students.get(key).getAge() == mostBiggerAge){
                oldStudent = students.get(key);
            }
        }
        System.out.println("가장 나이가 많은 학생 : " + oldStudent.getName());
        System.out.println("-----------------------------");

        //8번
        List<Student> stu = new ArrayList<>(students.values());
        stu.sort(Comparator.comparing(Student::getName));
        for (Student student : stu){
            System.out.println("이름 : " + student.getName() + ", 나이 : " + student.getAge());
        };
        System.out.println("-----------------------------");
        //9번
        for (Student student : students.values()) {
            if (student.getName().contains("성우")){
                System.out.println(student.getName());
            }
        }
        System.out.println("-----------------------------");
        //10번
        for (Student student : students.values()) {
            if (student.getName().equals("최준형")){
                System.out.println(true);
                break;
            }
        }


    }
}
