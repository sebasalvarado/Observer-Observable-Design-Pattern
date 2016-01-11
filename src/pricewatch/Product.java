package pricewatch;

import java.util.Observable;

/** A product in a store. **/
public class Product extends Observable {
    private String name;
    private String store;
    private double price;
    /**
     * Creates a {@link pricewatch.Product} with the given name, price, and store.
     * @param name name of the new {@link pricewatch.Product}
     * @param price price of the new {@link pricewatch.Product}
     * @param store store of the new {@link pricewatch.Product}
     */
    public Product(String name, double price, String store) {
        this.name = name;
        this.price = price;
        this.store = store;
    }
    
    /**
     * Returns the name of this {@link pricewatch.Product}.
     * @return the name of this {@link pricewatch.Product}
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Returns the price of this {@link pricewatch.Product}.
     * @return the price of this {@link pricewatch.Product}
     */
    // getPrice
    
    public double getPrice() {
        return this.price;
    }
    /**
     * Returns the store of this {@link pricewatch.Product}.
     * @return the store of this {@link pricewatch.Product}
     */
    
    public String getStore() {
        return this.store;
    }
    
    /**
     * Changes the price of this {@link pricewatch.Product} to newPrice. All
     * observers are notified, if the price is changed.
     * @param newPrice the new price of this {@link pricewatch.Product}
     */
    
    public void changePrice(double newPrice) {
        this.price = newPrice;
        // say that it changed
        setChanged();
        // create a new PriceChange object
        PriceChange changed = new PriceChange(this);
        this.notifyObservers(changed);
    }
    
    @Override
    
    /**
     * @return The String representation of this product.
     */
    public String toString() {
        return String.format("%s at %s costs %.2f.\n",
                             name, store, price);
    }
}