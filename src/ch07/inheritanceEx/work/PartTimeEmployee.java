package ch07.inheritanceEx.work;

public class PartTimeEmployee extends Employee{
    private int wage = 100000;
    private int workingHoursPerMonth = 80;
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println((this.wage * workingHoursPerMonth) + "원 입니다.");
    }
}
