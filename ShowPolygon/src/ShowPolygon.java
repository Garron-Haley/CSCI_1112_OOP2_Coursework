import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.StackPane;
import java.awt.*;

public class ShowPolygon  extends Application{
    String Stop = new String("STOP");
    @Override
    public void start(Stage Sign) {
        Pane pane = new StackPane();
        Polygon octogon = new Polygon();
        octogon.getPoints().addAll(new Double[]{
                215.0, 50.0,
                385.0, 50.0,
                500.0, 165.0,
                500.0, 335.0,
                385.0, 450.0,
                215.0, 450.0,
                100.0, 335.0,
                100.0, 165.0,
        });
        octogon.setLayoutX(pane.getWidth() / 2);
        octogon.setLayoutY(pane.getHeight() / 2);
        octogon.setFill(Color.RED);
        octogon.setStrokeWidth(10);
        octogon.setStroke(Color.WHITE);

        pane.getChildren().add(octogon);

        Label label = new Label("STOP");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 200));
        label.setLayoutX(pane.getWidth() / 2);
        label.setLayoutY(pane.getHeight() / 2);
        pane.getChildren().add(label);

        Group root = new Group(octogon);
        Sign.setTitle("Stop Sign");
        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.BLACK);
        Sign.setScene(scene);
        Sign.show();
    }
    public void text() {
        Text t1 = new Text("STOP");
    t1.setFill(Color.WHITE);
    }
        public static void main(String args[]){
            launch(args);
        }
    }

