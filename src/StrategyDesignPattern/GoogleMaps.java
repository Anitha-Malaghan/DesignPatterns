package StrategyDesignPattern;

public class GoogleMaps {
    public void findPath(String src, String dest, String mode){
        /*
        if(mode == car)
            ---
        else if(mode == bike)
            ----
         */
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorByMode("car");
        //findPath is already mode specific strategy.
        pathCalculatorStrategy.findPath(src, dest);

    }
}
