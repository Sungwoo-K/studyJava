package ch05;

public class ClassEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("John");
        student1.setStudentGrade(10);

        student1.printStudentInfo();

        Student student2 = new Student("Lisa",11,16);
        student2.printStudentInfo();
        student2.promoteGrade();
        student2.printStudentInfo();

        String name = "jon";
        String name1 = "Jin";
    }
}
