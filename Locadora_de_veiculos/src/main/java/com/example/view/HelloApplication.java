package com.example.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("telas-locadora.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 400);
        stage.setTitle("Locadora de Carro");
        stage.setScene(scene);
        stage.getIcons().add(new Image("https://raw.githubusercontent.com/PatrickSouzza/Linguagem-de-Programacao-I/main/Locadora_de_veiculos/src/main/java/com/example/view/icon.png"));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}