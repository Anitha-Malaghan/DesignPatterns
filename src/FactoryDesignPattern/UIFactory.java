package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button;
import FactoryDesignPattern.Components.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
