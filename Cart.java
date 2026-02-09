public class Cart {
    public void AddToCart(){
        System.out.println("Item 1 addded to cart.");
    }
    public void UpdateCart(){
        System.out.println("Your cart is updated");
    }
    public void ViewCart(){
        System.out.println("There are 2 items waiting in your cart.");
    }

    public void DeleteCart(){
        System.out.println("Item 1 deleted from your cart.");
    }
    public static void main(String[] args) {
        System.out.println("Your Cart");
        Cart cartobject = new Cart();
        cartobject.AddToCart();
        cartobject.ViewCart();
        cartobject.UpdateCart();
        cartobject.DeleteCart();
    }
}
