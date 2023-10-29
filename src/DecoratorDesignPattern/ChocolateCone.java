package DecoratorDesignPattern;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    //Act as base constructor
    public ChocolateCone(){}

    //Act as addonconstructor
    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription(){
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDescription()+" + Chocolate Cone" ;
        }
        else{
            return "Chocolate Cone";
        }
    }
    @Override
    public int getCost(){
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost() + 30;
        }
        return 30;

    }
}
