package com.sai.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestApp extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setId("appRoot");
        root.setSpacing(10);
        root.setPadding(new Insets(10));
        for (int i = 0; i < 10; i++) {
            Button button = new Button("Button " + i);
            button.setId("button" + i);
            Label label = new Label();
            label.setId("label"+i);
            String k = i + "";
            button.setOnAction(e -> label.setText("Clicked Button " + k));
            HBox hb = new HBox(button, label);
            hb.setSpacing(10);
            root.getChildren().add(hb);
        }

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("TestApp");
        stage.show();
    }
}
