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
import javafx.scene.shape.Circle;

public class listen extends Application{
    @Override
    public void start(Stage stage){
        Pane pane = new Pane();
        Circle circle = new Circle(250, 250, 25);
        circle.setFill(Color.RED);
        pane.getChildren().add(circle);
        PathTransition pt = new PathTransition();
        pt.setNode(circle);
        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    if (circle.getCenterY() < pane.getHeight()- 50){
                        circle.setCenterY(circle.getCenterY() + 100);
                        break;
                    }
                    if (circle.getCenterY() >= pane.getHeight()- 50){
                        circle.setCenterY(pane.getHeight() - 50);
                        break;
                    }
                case UP:
                    if (circle.getCenterY() > 50) {
                        circle.setCenterY(circle.getCenterY() - 100);
                        break;
                    }
                    if (circle.getCenterY() <= 50) {
                        circle.setCenterY(50);
                        break;
                    }
                case LEFT:
                    if (circle.getCenterX() > 50) {
                        circle.setCenterX(circle.getCenterX() - 100);
                        break;
                    }
                    if (circle.getCenterX() <= 50){
                        circle.setCenterX(50);
                        break;
                    }
                case RIGHT:
                    if (circle.getCenterX() < pane.getWidth() - 50) {
                        circle.setCenterX((circle.getCenterX() + 100));
                        break;
                    }
                    if (circle.getCenterX() >= pane.getWidth()- 50){
                        circle.setCenterX(pane.getWidth() - 50);
                        break;
                    }
            }



        });

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("ball");
        stage.setScene(scene);
        stage.show();
        circle.requestFocus();
    }
}
