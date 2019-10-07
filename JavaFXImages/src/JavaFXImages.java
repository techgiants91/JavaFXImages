
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXImages extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Root stack, which contains all the childs
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);
        
        // set background image
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/files/cover_photo.jpeg")));
        image.setScaleZ(50); // set Z-Axis index
        image.setOpacity(.5); // set fade value
        image.setFitHeight(600); // set image height
        image.setFitWidth(600); // set image width
        
        root.getChildren().add(image); // add image into parent as a background

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("JavaFX Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
