package ch05;

//주문정보
//상거래 시스템의 기본
//물건구매, 예약, 배달, 중고거래
public class OrderInfo {
    private String orderId; // 주문번호
    private String customerName; // 고객명
    private String productName; // 제품명
    private double totalPrice; // 주문금액
    private int quantity ; // 주문수량(개수)

    public OrderInfo(String orderId, String customerName, String productName, double totalPrice, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public OrderInfo() {

    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Quantity: " + quantity);
    }



    public void increaseQuantity(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("수량이 추가되었습니다. 총 수량: " + quantity);
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        String temp = this.orderId;
        return temp;
    }
}
