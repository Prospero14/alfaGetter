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
        primaryStage.setTitle("Hello world Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);

        InputStream iconStream = getClass().getResourceAsStream("/icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(helloWorldLabel);
        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(GetterGui.class, args);
    }
}