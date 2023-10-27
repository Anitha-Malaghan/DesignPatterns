package FactoryDesignPattern;

import FactoryDesignPattern.Components.AndroidButton;
import FactoryDesignPattern.Components.AndroidMenu;
import FactoryDesignPattern.Components.Button;
import FactoryDesignPattern.Components.Menu;
import FactoryDesignPattern.UIFactory;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton(){
        return new AndroidButton();
    }

    @Override
    public Menu createMenu(){
        return new AndroidMenu();
    }

}
