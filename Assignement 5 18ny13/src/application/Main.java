/**
 * @author Nathanael Yao
 * NetId: 18NY13
 * April 3 2020
 * This is the main class which calls on other classes
 */
package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Loads ui layout from the fxml file
			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("PizzaOrderSystem.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
