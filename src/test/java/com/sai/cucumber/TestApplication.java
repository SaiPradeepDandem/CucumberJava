package com.sai.cucumber;

import com.sai.javafx.TestApp;
import javafx.stage.Stage;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import java.util.concurrent.TimeoutException;

public class TestApplication extends ApplicationTest {
    public static FxRobot fxRobot;
    public static Stage primaryStage;

    static{
        //-Dtestfx.robot=glass -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw
        System.setProperty("testfx.robot","glass");
        System.setProperty("glass.platform","Monocle");
        System.setProperty("monocle.platform","Headless");
        System.setProperty("prism.order","sw");
    }
    public void launchApp(){
        try{
            primaryStage = FxToolkit.registerPrimaryStage();
            FxToolkit.setupApplication(TestApp.class);
            fxRobot = this;
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
