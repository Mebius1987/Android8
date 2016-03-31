/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15;

import java.util.Map;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class Music {

    String path;
    Media audio;
    MediaPlayer player;
    

    public Music(String filePath) {
        setSong(filePath);
    }

    public void setSong(String filePath) {
        if (player!=null) {player.dispose();}
        path = filePath;
        audio = new Media(path);
        player = new MediaPlayer(audio);
        
        player.setOnReady(new Runnable() {
        @Override
        public void run() {
            System.out.println("Duration: "+audio.getDuration().toSeconds());
            // display media's metadata
        for (Map.Entry<String, Object> entry : audio.getMetadata().entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    });
    }

    public void play() {
        player.play();
    }

    public void pause() {
        player.pause();
    }

    public void stop() {
        player.stop();
    }
    
}