
//JavaFX Requirement
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

//multiple classes requirement
public class gamePane {

	static GridPane gamePane = new GridPane();

	gamePane(players guy1, players guy2){

		int numRows = 3 ;
        int numColumns = 3 ;
	
		for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
		    RowConstraints rc = new RowConstraints();
		    rc.setVgrow(Priority.ALWAYS) ; 
		    rc.setFillHeight(true); 
		    rc.setPrefHeight(50);
		    gamePane.getRowConstraints().add(rc);
		}
		for (int col = 0 ; col < numColumns; col++ ) {
	            ColumnConstraints cc = new ColumnConstraints();
	            cc.setFillWidth(true);
	            cc.setHgrow(Priority.ALWAYS);
	            gamePane.getColumnConstraints().add(cc);
	    }

		  for (int i = 0 ; i < 9 ; i++) {
	           Button button = createButton(guy1,guy2);
	           gamePane.add(button, i % 3, i / 3);
	         
	        }
	   
		
		
		  //button class version of adding buttons
		  for (int i = 0 ; i < 9 ; i++) {
			  //guy2
	          //Button button = createButton(guy1,guy2);
	         // Button buttons[i] = button;
	         //Button button = buttons.makeButtons(guy1);
	           //gamePane.add(button1[i], i % 3, i / 3);   
	        }
		  
	Stage window = new Stage();
	Scene scene = new Scene(gamePane, 800, 600);
	window.setScene(scene);
	window.show();
	}	
	
	public static Node gameWindow() {
		return gamePane;
	}
	
	 private Button createButton(players guy1,players guy2) {
	        Button button = new Button();
	        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	        
	        
	        button.setOnMouseClicked(new EventHandler<MouseEvent>() {

	        	   public void handle(MouseEvent event) {
	        		   
	                   MouseButton entry = event.getButton();
	                   
	                   if(entry==MouseButton.PRIMARY){
	                	   button.setText("");
	                	   button.setGraphic(new ImageView(guy1.getImage()));
	                	   button.setDisable(true);
	     
	                   }else if(entry==MouseButton.SECONDARY){
	                	   button.setText("");
	                	   button.setGraphic(new ImageView(guy1.getImage()));
	                	   button.setDisable(true);
	                   }
	               }	
	           });
			return button;
	 }
	 
	 
}
			
			

