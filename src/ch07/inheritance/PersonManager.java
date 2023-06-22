package ch07.inheritance;

public class PersonManager {
    public void work(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if(p instanceof Lecturer) {
            ((Lecturer) p).teach();
        }

    }
}
