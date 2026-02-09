public class PayTM extends Payments {
    public void processPayment(){
            System.out.println("processing payment for order id "+ orderId);
    }

    public void verifyPayment(){
            System.out.println("verifying payment for order id "+ orderId);
    }

    // @Override 
    // public void CreateOrderId() {
    //      orderId = 30;
    // System.out.println("PAYTM: order Id created"+ orderId);
        
    //}
    public static void main(String[] args) {
        PayTM objone = new PayTM();
        objone.CreateOrderId();
        objone.processPayment();
        objone.refund();
        objone.cancelOrder();
        objone.CreateOrderId();
        objone.orderId = 31;
        objone.CreateOrderId();
        PayU p = new PayU();
        p.CreateOrderId();
        p.orderId = 20;
        p.CreateOrderId();

    }
}
