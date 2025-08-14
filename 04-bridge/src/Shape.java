abstract class Shape {
    // bridge to the color class
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// implement the child class
// abstract class is used because color can access the child class
// any place
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}

// this is square class that
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}