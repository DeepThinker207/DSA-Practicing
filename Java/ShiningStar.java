import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShiningStar extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the star
        Pane root = new Pane();

        // Create a circle to represent the star
        Circle star = new Circle(200, 200, 50);
        star.setFill(Color.YELLOW);

        // Create a pulse animation for the star
        FadeTransition pulse = new FadeTransition(Duration.seconds(1), star);
        pulse.setFromValue(1.0);
        pulse.setToValue(0.5);
        pulse.setCycleCount(Timeline.INDEFINITE);
        pulse.setAutoReverse(true);

        // Add the star to the pane and start the animation
        root.getChildren().add(star);
        pulse.play();

        // Create the scene and stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Shining Star");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}