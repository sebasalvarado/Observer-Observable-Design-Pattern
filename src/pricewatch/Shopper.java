package pricewatch;


import java.util.Observable;
import java.util.Observer;

public class Shopper implements Observer{
    
    private String name;
    
    /**
     * Creates a new {@link pricewatch.Shopper} with the given name.
     * @param name name of the new {@link pricewatch.Shopper}
     */
    // constructor
    public Shopper(String name) {
        this.name = name;
    }
    /**
     * Returns the name of this {@link pricewatch.Shopper}.
     * @return the name of this {@link pricewatch.Shopper}
     */
    // getName
    public String getName() {
        return this.name;
    }
    /**
     * Prints a message about a price change.
     */
    
    @Override
    
    public void update(Observable observable, Object argument) {
        PriceChange priceChange = (PriceChange)argument;
        Product observedProduct = priceChange.getProduct();
        String productName = observedProduct.getName();
        String productStore = observedProduct.getStore();
        // rounds to two decimal places
        Double productPrice = Math.round(observedProduct.getPrice() * 100.0) / 100.0;
        PriceChange changed = (PriceChange)argument;
        String dateString = changed.getDate().toString();
        String finalMessage = String.format("%s: price change of %s on %s at"
                                            + " %s to %s.\n",getName(), productName,dateString,
                                            productStore,productPrice.toString());
        System.out.println(finalMessage);
    }
}
