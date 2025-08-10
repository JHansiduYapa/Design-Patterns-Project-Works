public interface Renderable {
    /// This interface use to render objects in to screen
    void render();
}

/// concrete products
class WindowsButton implements Renderable {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class MacButton implements Renderable {
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

class WindowsMenu implements Renderable {
    public void render() {
        System.out.println("Rendering Windows Menu");
    }
}

class MacMenu implements Renderable {
    public void render() {
        System.out.println("Rendering Mac Menu");
    }
}