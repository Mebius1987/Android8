/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15;

import java.io.File;
import javafx.scene.control.Slider;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Valik
 */
public class HW15 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = getClass().getResource("sample.fxml");
        Parent root = FXMLLoader.load(url);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
// вариант получения полного пути к файлу. Но у этой приблуды есть свои особенности, нужно тестировать.
        String filePath = Paths.get("C:\\Java\\IDEA\\HW15\\HW15\\src\\bip.mp3").toUri().toString();

        Music music = new Music(filePath);
        music.play();


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
