public class TestaSAPCommerce {
    public static void main(String[] args) {
        SAPCommerce sapCommerce = new SAPCommerce();

        sapCommerce.addToCart();
        sapCommerce.updateItemFromCart();
        sapCommerce.removeItemFromCart();
    }
}
