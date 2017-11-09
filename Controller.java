package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField text1;
    public TextField text2;
    public Button button;
    public Label label;
    public void click(ActionEvent actionEvent) {
        String written1 = text1.getText();
        String written2 = text2.getText();

        if( written1!=null && written2!=null ) {
            label.setText(written1 + written2);
        }

    }
}
