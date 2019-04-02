import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public final class Login extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(sceneWith(LoginGridPane()));
        primaryStage.show();
    }

    private GridPane LoginGridPane() {
        GridPane grid = gridPane();
        grid.add(titleText(), 0, 0, 2, 1);
        grid.add(userNameLable(), 0, 1);
        grid.add(textField(), 1, 1);
        grid.add(pwLable(), 0, 2);
        grid.add(pwField(), 1, 2);
        return grid;
    }

    private PasswordField pwField() {
        return new PasswordField();
    }

    private Label pwLable() {
        return new Label("Password:");
    }

    private TextField textField() {
        return new TextField();
    }

    private Label userNameLable() {
        return new Label("User Name:");
    }

    private Text titleText() {
        Text titleText = new Text("Welcome");
        titleText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        return titleText;
    }

    private Scene sceneWith(GridPane grid) {
        return new Scene(grid, 300, 275);
    }

    private GridPane gridPane() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        return grid;
    }
}
