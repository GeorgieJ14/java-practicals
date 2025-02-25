// Now our strategy pattern example algorithms are ready. We can implement Shopping Cart and payment method will require input as Payment strategy. Item.java

package java_aoop_practicals;

public class Item {

    private String upcCode;
    private int price;
    
    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
