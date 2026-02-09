public class PayU extends Payments {
//     public void processPayment(){
//         System.out.println("processing payment for order id "+ orderId);
// }

// public void verifyPayment(){
//         System.out.println("verifying payment for order id "+ orderId);
// }
public static void main(String[] args) {
    PayU objone = new PayU();
    objone.CreateOrderId();
    objone.processPayment();
    objone.refund();
    objone.orderId = 30;
    objone.CreateOrderId();
    objone.processPayment();
}

//@Override
public void processPayment() {
    // TODO Auto-generated method stub
    System.out.println("Payment processed for the order " + orderId);
    //throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
}

//@Override
public void verifyPayment() {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'verifyPayment'");
    System.out.println("Payment verified for order" + orderId);
}
}
