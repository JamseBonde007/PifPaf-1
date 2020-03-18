package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    private Timer timer;
    @FXML
    private Button player1Btn, player2Btn, newGameBtn;
    @FXML
    private Label player1Score, player2Score, countdownLabel;
    @FXML
    private Slider difficultySlider;
    @FXML
    private AnchorPane arena;

    int interval;
    public void countdown(){
        interval = 300;
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            interval--;
            countdownLabel.setText(""+interval/60+":"+interval%60);
            System.out.println("idem");
            System.out.println(""+interval/60+":"+interval%60);
        }));
        timeline.setCycleCount(300);
        timeline.play();
    }
}
