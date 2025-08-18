package View;

public class NotebookView implements IView{
    /// This class object is responsible for showing the content of what is passed to the method
    /// This work with the model and
    @Override
    public void view(String s) {
        // get and format the string
        String formattedString = String.format("View in notebook: %s",s);
        System.out.println(formattedString);
    }
}
