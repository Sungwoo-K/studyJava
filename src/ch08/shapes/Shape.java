package ch08.shapes;

public interface Shape {
    // 인터페이스에는 추상 메서드를 선언할 수 있습니다.
    // 이 메서드는 도형의 넓이를 계산하는 역할을 할 것입니다.
    double calculateArea();
    // 또 다른 추상 메서드를 선언하여 도형의 둘레를 계산할 수 있도록 합니다.
    double calculatePerimeter();
}
