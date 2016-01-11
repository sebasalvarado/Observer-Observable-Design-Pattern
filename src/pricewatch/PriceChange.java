package pricewatch;

import java.util.Date;

/**
 * An object that records a change in price of a {@link pricewatch.Product}.
 *
 * @author Sebastian Alvarado
 */
public class PriceChange {
    private Product product; // a Product whose price changed
    private Date date; // the Date when the change occurred
    
    /**
     * Creates a new {@link pricewatch.PriceChange} for the given
     * {@link pricewatch.Product}.
     *
     * @param product
     *          the {@link pricewatch.Product} whose price changed
     */
    public PriceChange(Product product) {
        this.product = product;
        this.date = new Date();
    }
    
    /**
     * Returns the {@link pricewatch.Product} whose price changed.
     *
     * @return the {@link pricewatch.Product} whose price changed
     */
    public Product getProduct() {
        return product;
    }
    
    /**
     * Returns the {@link java.util.Date} of the price change.
     *
     * @return the {@link java.util.Date} of the price change
     */
    public Date getDate() {
        return date;
    }
}