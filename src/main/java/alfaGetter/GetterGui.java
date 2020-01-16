package alfaGetter;

import javafx.application.Application;
import javafx.stage.Stage;
import org.graalvm.compiler.phases.common.NodeCounterPhase;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.InputStream;


public class GetterGui extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text helloWorld = new Text("Hello world");
        StackPane root = new StackPane(helloWorld);
        primaryStage.setScene(new Scene(root, 300, 120));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(GetterGui.class, args);
    }
}