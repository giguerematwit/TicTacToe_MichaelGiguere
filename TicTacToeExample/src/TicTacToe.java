//JavaFX Requirement


import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;


//Multiple classes requirement
//extends technically means abstract
public class TicTacToe extends Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	
	}
	
	@Override
	public void start(Stage primaryStage) {

		player1 guy1  = new player1();
		player2 guy2  = new player2();
		
		Image imageX = new Image(TicTacToe.class.getResource("/x.jpg").toExternalForm(), 100, 100, true, true);
		Image image0 = new Image(TicTacToe.class.getResource("/O.jpg").toExternalForm(), 100, 100, true, true);
		
		//set image guy2
		 guy1.setImage(imageX);
		 guy2.setImage(image0);
		 
		 //window for creating players
		new playerPane( guy1,guy2);
		

		//I DONT UNDERSTAND PRIMARY STAGE MAYBE I SHOULDNT HAVE USED
		Pane root = new Pane();
		primaryStage.setTitle("Tic Tac Toe by Michael Giguere");
		
		//background
		BackgroundImage myBackground= new BackgroundImage(new Image(TicTacToe.class.getResource("/background.jpg").toExternalForm(),800,600,false,true),
		        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		
		
		//color for text
		Color col = new Color(Math.random(), Math.random(), Math.random(), 1);
		
		//labels
		Label gameName = new Label("Tic Tac Toe");
		Label creatorName = new Label("By: Michael Giguere");
		
		gameName.setFont(new Font("Times New Roman", 64));
		gameName.setTextFill(col);
		
		//transition
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(4), gameName);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0.0);
        fadeTransition.setAutoReverse(true);
        fadeTransition.setCycleCount(2);
        
        
        fadeTransition.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
        		Color col = new Color(Math.random(), Math.random(), Math.random(), 1);
        		gameName.setTextFill(col);
        		fadeTransition.setCycleCount(2);
                fadeTransition.play();
        		
            }
            
        });
        fadeTransition.play();
        
		creatorName.setTextFill(Color.web("#FFFFFF"));
		creatorName.setFont(new Font("Times New Roman", 32));
		
		gameName.relocate(350, 50); 
		creatorName.relocate(350, 175); 
		
		
		
		/////I THINK THIS IS HOW I ADD BUTTONS CAUSE IM A DUMMY
		///WASNT DOING .ADD
		root.getChildren().add(gameName);
		root.getChildren().add(creatorName);
		
		root.setBackground(new Background(myBackground));
		
		root.getChildren().add(playerPane.enterNameWindow());
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
