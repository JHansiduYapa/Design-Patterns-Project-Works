/// normally from shape class if we want to incorporate with colors
///  we have to make subclasses for each color
///  RedSquare RedCircle, GreenSquare GreenCircle, .... this can be very large of classes
/// difficult to manage
///
/// solution when we link a color object Now the shape can delegate any color-related work to the linked color object.
public class Main {
    public static void main(String[] args) {
        // make the object of the circle and call the composition object of
        // color composition object
        Shape rCircle = new Circle(new Red());
        rCircle.draw();

        // create a another class
        Shape gCircle = new Circle(new Blue());
        gCircle.draw();
    }
}