package Controller;

import Model.Document;
import View.IView;

public class EditorController {
    private Document document;
    private IView view;

    public EditorController(Document document, IView view) {
        this.document = document;
        this.view = view;
    }

    public void setText(String text) {
        document.setText(text);
        // when the text is set update the ui
        updateView();
    }

    public void updateView() {
        view.view(document.getText());
    }
}
