package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    //Singleton Design Pattern
    public static Flipkart getInstance(){
        if(instance == null) {
            instance = new Flipkart();
        }
        return instance;

    }
    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }
    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }

}
