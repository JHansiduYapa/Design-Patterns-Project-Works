public class MacFactory implements GUIFactory{
    @Override
    public Renderable createButton() {
        return new MacButton();
    }

    @Override
    public Renderable createMenu() {
        return new MacMenu();
    }
}
