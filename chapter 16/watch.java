import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.beans.EventHandler;
import java.time.temporal.ChronoUnit;

public class watch extends Application {
    private static final String M = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    private TextField tf = new TextField();
    @Override
    public void start(Stage stage){
        Pane pane = new Pane();
        GridPane Gpane = new GridPane();
        Gpane.add(new Label("Enter number of seconds"), 0,0);
        Gpane.add(tf, 1, 0);
        pane.getChildren().add(Gpane);
        Label label = new Label("nothing");
        label.setLayoutX(250);
        label.setLayoutY(250);


        pane.setOnKeyPressed(e -> {
            if(e.getCode() == (KeyCode.ENTER)){
                double d = Double.parseDouble(String.valueOf(tf.getText()));
                Label countDownLabel = new Label();
                countDownLabel.setLayoutY(250);
                countDownLabel.setLayoutX(250);


                ObjectProperty<java.time.Duration> remainingDuration
                        = new SimpleObjectProperty<>(java.time.Duration.ofSeconds((long)d));


                countDownLabel.textProperty().bind(Bindings.createStringBinding(() ->
                                String.format("%02d:%02d:%02d",
                                        remainingDuration.get().toHours(),
                                        remainingDuration.get().toMinutes(),
                                        remainingDuration.get().toMillis() * 1000),
                        remainingDuration));


                Timeline countDownTimeLine = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent event) ->
                        remainingDuration.setValue(remainingDuration.get().minus(1,
                                ChronoUnit.SECONDS))));


                countDownTimeLine.setCycleCount((int) remainingDuration.get().getSeconds());
                Media media = new Media(M);
                MediaPlayer mediaPlayer = new MediaPlayer(media);

                countDownTimeLine.setOnFinished(event -> mediaPlayer.play());
                pane.getChildren().add(countDownLabel);
                countDownTimeLine.play();
            }

        });

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("clock");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
