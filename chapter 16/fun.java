import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class fun extends Application {
    @Override // Override the getPane() method in the super class
    public void start(Stage stage){
        Pane pane = new Pane();
        RadioButton red = new RadioButton("RED");
        RadioButton green = new RadioButton("GREEN");
        RadioButton blue = new RadioButton("BLUE");
        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        green.setToggleGroup(group);
        blue.setToggleGroup(group);

        green.setLayoutY(50);
        red.setLayoutY(100);
        blue.setLayoutY(150);
        green.setLayoutX(50);
        red.setLayoutX(50);
        blue.setLayoutX(50);

        pane.getChildren().addAll(red, green, blue);
        Text text = new Text("Programming is fun");
        text.setFill(Color.BLACK);
        text.setX(200);
        text.setY(250);
        pane.getChildren().add(text);
        PathTransition pt = new PathTransition();
        pt.setNode(text);
        Button buttonL = new Button("LEFT ");

        Button buttonR = new Button("RIGHT");
        buttonL.setLayoutX(50);
        buttonL.setLayoutY(450);
        buttonR.setLayoutX(400);
        buttonR.setLayoutY(450);
        pane.getChildren().addAll(buttonL, buttonR);
        buttonL.setOnAction(e -> text.setX(text.getX() - 50));
        buttonR.setOnAction(e -> text.setX(text.getX() + 50));
        red.setOnAction(e -> text.setFill(Color.RED));
        green.setOnAction(e -> text.setFill(Color.GREEN));
        blue.setOnAction(e -> text.setFill(Color.BLUE));
        Scene scene1 = new Scene(pane, 500, 500);
        stage.setTitle("fun");
        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}