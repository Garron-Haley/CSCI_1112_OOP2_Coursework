import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Path;
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
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import static javafx.application.Application.launch;

public class book extends Application {
    @Override
    public void start(Stage stage){
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.RED);
        double[] Xval = new double[5];
        Xval[0] = 100;
        Xval[1] = 150;
        Xval[2] = 125;
        Xval[3] = 75;
        Xval[4] = 50;
        double[] Yval = new double[5];
        Yval[0] = 50;
        Yval[1] = 100;
        Yval[2] = 150;
        Yval[3] = 150;
        Yval[4] = 100;

        Polygon pentagon = new Polygon();
            pentagon.getPoints().addAll(new Double[]{
                100.0, 50.0, 150.0, 100.0, 125.0, 150.0, 75.0, 150.0, 50.0, 100.0, });
        pentagon.setStroke(Color.BLUE);


        pane.getChildren().

            add(pentagon);
        pane.getChildren().

            add(rectangle);

            PathTransition pt = new PathTransition();
        pt.setPath(pentagon);
        pt.setNode(rectangle);
        rectangle.opacityProperty().set(1);

        pt.setOrientation(
            PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT
        );
        FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.001);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
        pt.getDuration();
        pt.play();
        ft.play();
        pentagon.setOnMousePressed(e ->

            {
                if (pt.getStatus() == Animation.Status.RUNNING) {
                    pt.pause();
                } else {
                    pt.play();
                }
            });


            Scene scene = new Scene(pane, 600, 600);
        stage.setTitle("pathanimation");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
