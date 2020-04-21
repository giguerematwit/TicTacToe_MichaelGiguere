//JavaFX Requirement
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//Multiple classes requirement
public class playerPane {
	
	static GridPane enterNameWindow = new GridPane();
	
	playerPane(players guy1, player2 guy2){

		enterNameWindow.setAlignment(Pos.TOP_RIGHT);
		enterNameWindow.setHgap(25);
		enterNameWindow.setVgap(25);
		enterNameWindow.setPadding(new Insets(25, 25, 25 ,25));
		
		Label userName1 = new Label("Player 1:");
		userName1.setTextFill(Color.web("#FFFFFF"));
		enterNameWindow.add(userName1, 0, 1);

		TextField userTextField1 = new TextField();
		enterNameWindow.add(userTextField1, 1, 1);

		Label userName2 = new Label("Player 2:");
		userName2.setTextFill(Color.web("#FFFFFF"));
		enterNameWindow.add(userName2, 0, 2);

		TextField userTextField2 = new TextField();
		enterNameWindow.add(userTextField2, 1, 2);

		Button startButton = new Button("Ready 2 Game");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.TOP_RIGHT);
		hbBtn.getChildren().add(startButton);
		enterNameWindow.add(hbBtn, 1, 3);

		startButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent t) {

				//getting userName
				String name1 = userTextField1.getText();
				String name2 = userTextField2.getText();
				
				if (name1.equals("") || name2.contentEquals("")) {
					
					Label b = new Label("Please Enter Human Names"); 
					enterNameWindow.getChildren().add(b); 
				}
				else {

					guy1.setName(name1);
					guy2.setName(name2);
					
					enterNameWindow.getChildren().clear();
					startButton.setDisable(true);
					
					new scoreBoard(guy1,guy2);
					
					//i would like the game to be set on the primary stage
					new gamePane(guy1, guy1);
				}
	}});
		
	} 

	public static Node enterNameWindow() {
		return enterNameWindow;
	}
}
