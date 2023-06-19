package ch06.listEx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        List<Student> list2 = new ArrayList<Student>();
        list.add(new Student("John", 10, 9));
        list.add(new Student("List", 12, 8));
        list.add(new Student("John", 9, 11));
        list.add(new Student("Alice", 10, 10));
        list.add(new Student("James", 11, 13));
        for (Student student : list) {
            if(student.getName().equals("John")){
                student.displayStudent();
            }
        }
        System.out.println("-----------------");
        for (Student student : list) {
            if(student.getGrade() > 10){
                student.displayStudent();
            }
        }
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 :");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요 :");
        int age = sc.nextInt();
        System.out.print("학년을 입력해주세요 :");
        int grade = sc.nextInt();
        list.add(new Student(name, age, grade));
        for (Student student : list) {
           student.displayStudent();
        }
        System.out.println("-----------------");
        //문제 5번
        //문제 6번
        for (Student student : list) {
            if(student.getName().equals("Alice")) {
                student.setAge(5);
                break;
            }
        }
        for (Student student : list) {
            student.displayStudent();
        }
        System.out.println("-----------------");
        for (Student student : list) {
            if (student.getGrade() < 12) {
                list2.add(student);
            }
        }
        for (Student student : list2) {
            student.displayStudent();
        }
        System.out.println("-----------------");
        //문제 9번

        //문제 10번
        int sum = 0;
        int numStudent = 0;
        for (Student student : list) {
            sum += student.getAge();
            numStudent++;
        }
        int studentAgeAverage = sum / numStudent;
        System.out.println("모든 학생의 나이의 평균은 : " + studentAgeAverage + "입니다.");
    }
}
