package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button;
import FactoryDesignPattern.Components.IosButton;
import FactoryDesignPattern.Components.IosMenu;
import FactoryDesignPattern.Components.Menu;

public class IOSFactory implements  UIFactory {
    @Override
    public Button createButton(){
        return new IosButton();
    }

    @Override
    public Menu createMenu(){
        return new IosMenu();
    }
}
