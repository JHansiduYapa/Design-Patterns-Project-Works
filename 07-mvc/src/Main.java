import Controller.EditorController;
import Model.Document;
import View.EditorView;
import View.IView;
import View.NotebookView;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.setText("Janith");

        IView view = new NotebookView();
        // make a controller for hold both doc and view
        EditorController editorController = new EditorController(doc, view);

        /// This shows how the model-view-controller is implemented at the back
        /// In frameworks
        editorController.setText("Hansidu");
        editorController.updateView();
    }
}