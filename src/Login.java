import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public final class Login extends Application {
    private final Text actionTarget = new Text();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(sceneWith(LoginGridPane()));
        primaryStage.show();
    }

    private GridPane LoginGridPane() {
        GridPane grid = gridPane();
        addLoginLabelsTo(grid);
        grid.add(signInButton(), 1, 4);
        grid.add(actionTarget, 1, 6);
        return grid;
    }

    private HBox signInButton() {
        HBox signInButton = new HBox(10);
        signInButton.setAlignment(Pos.BOTTOM_RIGHT);
        signInButton.getChildren().add(btnToAttach());
        return signInButton;
    }

    private Button btnToAttach() {
        Button btn = new Button("Sign in");
        btn.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Pressed!");
        });
        return btn;
    }

    private void addLoginLabelsTo(GridPane grid) {
        grid.add(titleText(), 0, 0, 2, 1);
        grid.add(userNameLabel(), 0, 1);
        grid.add(textField(), 1, 1);
        grid.add(pwLabel(), 0, 2);
        grid.add(pwField(), 1, 2);
    }

    private PasswordField pwField() {
        return new PasswordField();
    }

    private Label pwLabel() {
        return new Label("Password:");
    }

    private TextField textField() {
        return new TextField();
    }

    private Label userNameLabel() {
        return new Label("User Name:");
    }

    private Text titleText() {
        Text titleText = new Text("Welcome");
        titleText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        return titleText;
    }

    private Scene sceneWith(GridPane grid) {
        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(Login.class.getResource("login.css")
                .toExternalForm());
        return scene;
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
