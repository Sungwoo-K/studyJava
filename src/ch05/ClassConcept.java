package ch05;

public class ClassConcept {
    public static void main(String[] args) {
        //OOP(Object Oriented Programming
        //OOP -> CBD(component based design) -> SDA(service oriented architecture)
        //design: 코드 수준의 설계
        //OOP, 공학적인 방법론들은 규모확장과 관련이 있다.
        //단점: boiler-plate의 증가

        OrderInfo order1 = new OrderInfo("ORD001","John Doe","Product A",49.99,2);
        order1.displayOrderDetails();
        System.out.println();
        OrderInfo order2 = new OrderInfo("ORD002","Jane Smith","Product B",99.99,3);
        order2.displayOrderDetails();
        OrderInfo order3 = new OrderInfo();
        order3.setOrderId("ORD003");
        order3.displayOrderDetails();
        System.out.println();
        System.out.println(order3.getOrderId());
    }
}





