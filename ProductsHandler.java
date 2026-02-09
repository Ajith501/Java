public class ProductsHandler {
    // get product details
    // quantity Handler
    // Payment Handler

    public void getProductDetails(int productId){
        
        try{
        if (productId > 150){

            throw new ProductExceptions("Invalid product ID.");
        }else{
            System.out.println("Product details found for product id: "+ productId);
        }
    }catch(ProductExceptions ex){
        System.out.println(ex.getMessage());
    }
    }

    public void checkInventory(int productId,  int quantity){
            try {
                if(quantity <10) {
                    System.out.println(" Inventory DB Updated");
                }
                else {
                    throw new InventoryExceptions("Out of Stock.");
                }
            } catch (InventoryExceptions  ex) {
                // TODO: handle exception

                System.out.println(ex.getMessage());
            }
    }

    public void processPayment(int productId, int quantity, int price){
            try {
                if(price <= 100){
                    System.out.println("Payment SUccesful.");
                }
                else{
                    throw new PaymentExceptions("Insuffiecient Funds.");
                }
            } catch (PaymentExceptions ex) {
                System.out.println(ex.getMessage());
            }
    }

    public static void main(String[] args) {
        ProductsHandler ph = new ProductsHandler();
        ph.getProductDetails(151);
        ph.processPayment(0,0,100);
        ph.checkInventory(0, 6);
    }
}
