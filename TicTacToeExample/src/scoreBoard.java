//JavaFX Requirement


import javafx.scene.Group;
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



//Multiple classes requirment Requirement
public class scoreBoard {

	scoreBoard(players guy1,players guy2){
		
		Stage subStage = new Stage();
		subStage.setTitle("Score Board");
		
	    //divider line
		Line line = new Line();
	      line.setStartX(200.0); 
	      line.setStartY(0.0); 
	      line.setEndX(200.0); 
	      line.setEndY(400.0); 
	      Group middlePart = new Group(line);

		Label userName1 = new Label(guy1.getName());
		userName1.setTextFill(Color.web("#FFFFFF"));
		userName1.setFont(new Font("Times New Roman", 32));
		userName1.relocate(25, 10); 

		Label userName2 = new Label(guy2.getName());
		userName2.setTextFill(Color.web("#FFFFFF"));
		userName2.setFont(new Font("Times New Roman", 32));
		userName2.relocate(225, 10); 
		
		BackgroundImage myBackground= new BackgroundImage(new Image(TicTacToe.class.getResource("/eagleEyeNebula.jpg").toExternalForm(),800,600,false,true),
		        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		
		final Pane root = new Pane();
		root.setBackground(new Background(myBackground));
		root.getChildren().add(userName1);
		root.getChildren().add(userName2);
		root.getChildren().add(middlePart);

		Scene scene = new Scene(root,400,400);

		subStage.setScene(scene);
		subStage.show();
		
	}

}
	

