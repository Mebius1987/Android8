package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sample {

    public static void main(String[] args) {
        String bip = "bip.mp3";
        Media hit = new Media(bip);
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

}
