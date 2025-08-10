public interface GUIFactory {
    /// This abstract factory interface used create specific classes
    /// of gui components
    Renderable createButton();
    Renderable createMenu();
}
