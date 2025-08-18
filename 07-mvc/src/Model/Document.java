package Model;

/// This is model class that hold the data of the object
/// This is used in presentation layer to get the value display
/// getters and setters used set and get the data from the object
public class Document {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
