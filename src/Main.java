import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Program to create a checkerboard using JavaFx
 * Assignment 14.6 - CSC201
 * Nov. 2, 2017
 * @author Laura Witherspoon
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Checkerboard grid = new Checkerboard(10, 10, 500);

        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(new Scene(grid, grid.getPaneSize(), grid.getPaneSize()));
        primaryStage.show();
    }

}
