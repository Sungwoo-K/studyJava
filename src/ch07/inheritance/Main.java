package ch07.inheritance;

public class Main {
        public static void main(String[] args) {
            Student student = new Student("홍길동", 20, "12345");
            student.introduce(); // 오버라이딩된 introduce 메서드 호출
            student.study(); // Student 클래스의 study 메서드 호출
            System.out.println("---------------------------");

            //업캐스팅
            Person person = student;

            person.introduce();
            //Person 타입으로 Student 타입객체를 형변환 할 수 있다.
            //기본적으로 Person의 필드와 메소드를 사용할 수 있지만
            //Student로 오버라이딩된 Person의 메소드들은
            //오버라이딩된 Student메소드로 나온다.
            //타입이 Person으로 업캐스팅되어서
            //오버라이딩 되지않은 Student메소드들은 사용불가하다
            //person.study(); 실행되지 않는다.

            System.out.println("-----------------------");
            //다운캐스팅
            Person p2 = student;
            PersonManager personManager = new PersonManager();
            personManager.work(p2);
            p2.introduce();

            System.out.println("-----------------------");
            Person p3 = new Lecturer("고대근", 39, 11);
            personManager.work(p3);
            p3.introduce();
        }

}
