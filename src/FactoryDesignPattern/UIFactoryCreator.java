package FactoryDesignPattern;

public class UIFactoryCreator {
    public static UIFactory getUIFactoryForm(SupportedPlatforms platform){
        if (platform == SupportedPlatforms.ANDROID){
            return new AndroidFactory();
        }
        else {
            return new IOSFactory();

        }

    }
}
