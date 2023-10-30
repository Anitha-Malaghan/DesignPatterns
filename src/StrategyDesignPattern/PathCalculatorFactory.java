package StrategyDesignPattern;

public class PathCalculatorFactory {
    public static  PathCalculatorStrategy getPathCalculatorByMode(String mode){
        if(mode.equals("car")){
            return new CarPathCalcStrategy();
        } else {
            return new BikePathCalcStrategy();
        }
    }

}
