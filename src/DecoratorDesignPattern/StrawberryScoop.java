package DecoratorDesignPattern;

public class StrawberryScoop  implements  IceCreamConeConstituents{
    private  IceCreamConeConstituents iceCreamConeConstituents;
    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;

    }
    @Override
    public int getCost(){
        return iceCreamConeConstituents.getCost()+30;
    }
    public String getDescription(){
        return iceCreamConeConstituents.getDescription()+" + StrawberryScoop";
    }
}
