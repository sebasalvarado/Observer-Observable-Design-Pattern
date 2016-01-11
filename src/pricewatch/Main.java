package pricewatch;

public class Main {
    
    /**
     * Makes some sample calls to methods of Product, Shopper, and PriceWatchWebsite.
     * @param args the usual
     */
    public static void main(String[] args) {
        Product banana = new Product("banana", 0.59, "Loblaw");
        Product cereal = new Product("cereal", 7.49, "Target");
        
        Shopper anya = new Shopper("Anya Tafliovich");
        Shopper paco = new Shopper("Paco Estrada");
        
        
        banana.addObserver(paco);
        cereal.addObserver(paco);
        cereal.addObserver(anya);
        
        
        PriceWatchWebsite priceWatchRUs = new PriceWatchWebsite("www.pricewatchrus.com");
        priceWatchRUs.addObserver(anya);
        cereal.addObserver(priceWatchRUs);
        
        banana.changePrice(0.55);
        cereal.changePrice(10 / 3.0);
        cereal.changePrice(15.42);
        
        /* Sample output (the dates will be different when you run this, of course):
         
         Paco Estrada: price change of banana on Thu Nov 12 23:27:21 EST 2015 at Loblaw to 0.55.
         
         You are subscribed to www.pricewatchrus.com.
         Price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 3.33.
         
         Anya Tafliovich: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 3.33.
         
         Anya Tafliovich: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 3.33.
         
         Paco Estrada: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 3.33.
         
         You are subscribed to www.pricewatchrus.com.
         Price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 15.42.
         
         Anya Tafliovich: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 15.42.
         
         Anya Tafliovich: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 15.42.
         
         Paco Estrada: price change of cereal on Thu Nov 12 23:27:21 EST 2015 at Target to 15.42.
         
         */
    }
}
