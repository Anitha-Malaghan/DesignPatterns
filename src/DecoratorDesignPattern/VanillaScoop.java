package DecoratorDesignPattern;

public class VanillaScoop implements  IceCreamConeConstituents{
    private  IceCreamConeConstituents iceCreamConeConstituents;
    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;

    }
    @Override
    public int getCost(){
        return iceCreamConeConstituents.getCost()+30;
    }
    public String getDescription(){
        return iceCreamConeConstituents.getDescription()+" + VanillaScoop";
    }
}
