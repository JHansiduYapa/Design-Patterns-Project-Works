// this concrete class create objects of same type at runtime
// by calling createbutton and createmenu
// this encapsulates always calling new method and reduce error that create same type windows items
public class WindowsFactory implements GUIFactory{
    @Override
    public Renderable createButton() {
        return new WindowsButton();
    }

    @Override
    public Renderable createMenu() {
        return new WindowsMenu();
    }
}
