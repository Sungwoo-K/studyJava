package ch07.inheritanceEx;

import ch07.inheritanceEx.dessert.Apple;
import ch07.inheritanceEx.dessert.Banana;
import ch07.inheritanceEx.music.Guitar;
import ch07.inheritanceEx.music.Piano;
import ch07.inheritanceEx.work.FullTimeEmployee;
import ch07.inheritanceEx.work.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getColor());
        Banana banana = new Banana();
        System.out.println(banana.getColor());
        System.out.println("----------------------");
        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
        System.out.println("----------------------");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000000);
        fullTimeEmployee.calculateSalary();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculateSalary();
    }

}
