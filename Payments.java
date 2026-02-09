 public   class Payments {
   public  int orderId = 0;

    public void CreateOrderId(){
        //orderId = 2;
        System.out.println(" payments: Order id created "+orderId+ prodCat.LAPTOP);

    }

    protected  void refund(){
        System.out.println("  payments: Refund is initiated for your Order id "+ orderId);
    }
 
    public void cancelOrder(){
        System.out.println(orderId + "is cancelled.");
    }
     //public  void processPayment();
    // public  void verifyPayment();
        // public static void main(String[] args) {
        //     Payments p = new Payments();
        //     p.CreateOrderId();
            
        // }

    

}

// Create Order
// Status Check
// Refund 
// Cancel
