import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class buttons {

	static Node buttons[] = new Button[9];
	
	public void makeButtons(players guy1) {
	for (int i = 0 ; i < 9 ; i++) {
		  //guy2
          Button button = createButton(guy1);
          buttons[i] = button;
         //gamePane.add(button, i % 3, i / 3);
      }	
	}
	
	public static Node[] getButtons() {

		return buttons;
	}
	
	
	private Button createButton(players guy1) {
        Button button = new Button();
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        
        
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {

        	   public void handle(MouseEvent event) {
        		   
                   MouseButton entry = event.getButton();
                   
                   if(entry==MouseButton.PRIMARY){
                	   button.setText("");
                	   //change image for other guy
                	   button.setGraphic(new ImageView(guy1.getImage()));
                	   button.setDisable(true);
                	   
                	   //int gameBoard[][]=new int[3][3];
                	   
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
