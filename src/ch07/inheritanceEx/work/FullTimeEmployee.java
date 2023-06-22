package ch07.inheritanceEx.work;

public class FullTimeEmployee extends Employee{
    private int salary;

    public FullTimeEmployee(int salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        super.calculateSalary();
        System.out.println((this.salary / 12) + "원 입니다.");
    }
}
