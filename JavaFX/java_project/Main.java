import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        showGameScreen();
    }


    private void showGameScreen() throws IOException {
        // Create an instance of the SnakeGame class (assuming SnakeGame is your game logic class)
        //Mode2 snakeGame = new Mode2();

        // Initialize the game, set up the scene, and start the game loop
        //Scene gameScene = snakeGame.initGame();
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("menu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root,1200,700);
         
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game");
        primaryStage.show();

        // Start the game loop
        //snakeGame.startGameLoop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
