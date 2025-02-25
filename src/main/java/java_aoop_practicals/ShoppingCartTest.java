// Notice that payment method of shopping cart requires payment algorithm as argument and doesn’t store it anywhere as instance variable. Let’s test our strategy pattern example setup with a simple program. ShoppingCartTest.java

package java_aoop_practicals;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        
        cart.addItem(item1);
        cart.addItem(item2);
        
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
