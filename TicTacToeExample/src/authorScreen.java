//JavaFX Requirement


import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;



//Multiple classes requirment Requirement
public class authorScreen {

	public static final Node gameName = null;

	authorScreen(players guy1,players guy2){
		
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
		
	}
	


}
	

