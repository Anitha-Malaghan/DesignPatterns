package FactoryDesignPattern;

public class Flutter {
    public void setTheme(){

    }
    public void setRefreshRate(){

    }
    //ocp is violating we should split this class.
    public UIFactory getUIFactory(SupportedPlatforms platform){
        return UIFactoryCreator.getUIFactoryForm(platform);

    }

}
