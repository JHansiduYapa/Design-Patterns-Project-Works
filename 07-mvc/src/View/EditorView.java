package View;

public class EditorView implements IView{
    /// This class object is responsible for showing the content of what is passed to the method
    /// This work with the model and
    @Override
    public void view(String s) {
        // get and format the string
        String formattedString = String.format("View in editor: %s",s);
        System.out.println(formattedString);
    }
}
