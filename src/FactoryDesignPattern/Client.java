package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.changeColor();
    }
}
