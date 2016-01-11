package pricewatch;

import java.util.Observable;
import java.util.Observer;

public class PriceWatchWebsite extends Observable implements Observer {
    
    private String url;
    /**
     * Creates a new {@link pricewatch.PriceWatchWebsite} with the given URL.
     * @param url the URL of the new {@link pricewatch.PriceWatchWebsite}
     */
    
    public PriceWatchWebsite(String url) {
        this.url = url;
    }
    /**
     * Returns the URL of this {@link pricewatch.PriceWatchWebsite}.
     * @return the URL of this {@link pricewatch.PriceWatchWebsite}
     */
    
    public String getUrl() {
        return this.url;
    }
    
    /**
     * Prints a message about a price change.
     * Notifies all observers of the change in price.
     */
    @Override
    public void update(Observable product, Object argument) {
        PriceChange date = (PriceChange)argument;
        String productName = (String)((Product)product).getName();
        String productStore = (String)((Product)product).getStore();
        Double productPrice = Math.round((Double)((Product)product).getPrice() * 100.0) / 100.0;
        String dateString = date.getDate().toString();
        String finalMessage = String.format("You are subscribed to %s.\nPrice change "
                                            + "of %s on %s at %s to %s.\n",
                                            getUrl(),productName, dateString, productStore,productPrice.toString());
        System.out.println(finalMessage);
        this.setChanged();
        PriceChange newPriceChange = new PriceChange((Product) product);
        this.notifyObservers(newPriceChange);
    }
}