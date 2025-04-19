package Factory;

import Factory.components.*;

public class IOSUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }
}
