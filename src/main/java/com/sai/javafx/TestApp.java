package com.sai.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class TestApp extends Application {
    @Override
    public void start(Stage stage) {
        VBox left = new VBox();
        left.setId("appRoot");
        left.setSpacing(10);
        left.setPadding(new Insets(10));
        for (int i = 0; i < 10; i++) {
            Button button = new Button("Button " + i);
            button.setId("button" + i);
            Label label = new Label();
            label.setId("label"+i);
            String k = i + "";
            button.setOnAction(e -> label.setText("Clicked Button " + k));
            HBox hb = new HBox(button, label);
            hb.setSpacing(10);
            left.getChildren().add(hb);
        }

        Button popup = new Button("Popup");
        popup.setId("button22" );
        popup.setOnAction(e -> {
            Popup p = new Popup();
            p.setAutoHide(true);
            StackPane sp = new StackPane();
            sp.setStyle("-fx-background-color:red;");
            sp.setId("popPane");
            sp.setMinSize(200,200);
            p.getContent().addAll(sp);
            p.show(popup,0,0);
        });
        left.getChildren().add(popup);

//        String content = getHtmlContent();
        //WebView webView = new WebView();
        //WebEngine webEngine = webView.getEngine();
        //webEngine.loadContent("<html><body><h1>Sai</h1></body></html>", "text/html");
        HBox root = new HBox(left);
        root.setSpacing(10);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("TestApp");
        stage.show();
    }

    private String getHtmlContent() {
        return "<html> " +
                " <body class=\"mainBody\" spellcheck=\"true\" onclick=\"mainbodyclick()\" contenteditable=\"false\" id=\"idsBody\"> " +
                "  <div class=\"maindiv\" id=\"maindivcontainer\" oncontextmenu=\"maindivcontextcall(event);\"> " +
                "   <div id=\"regdivcontainer\" contenteditable=\"true\" style=\"display:block\">      " +
                "    <table contenteditable=\"false\" class=\"block idsTemp\" onclick=\"tabClick(this)\" id=\"tab0.0737569887231827\"> " +
                "     <tbody> " +
                "      <tr> " +
                "       <td class=\"header readOnly\"><a name=\"1test468\"></a><font size=\"3\" color=\"blue\">1</font></td> " +
                "       <td title=\"block name\" class=\"name\" id=\"tb_name\">test468</td> " +
                "     </tbody> " +
                "    </table>" +
                "    </div>" +
                "    </div>" +
                "    </body>" +
                "    </html>";
    }
}
