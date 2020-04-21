//JavaFX Requirement
import javafx.scene.image.Image;

//JavaFX Requirement
public class player2 extends players {

	private Image image0 ;

	private String name;

	private String playerType;
	
	 
	 public player2() {
		}

	public player2(String name, String playerType,Image image0) {
		super(name);
		this.playerType = playerType;
		this.image0 = image0;

	}
	
	public void setName(String name) {
		this.name = name;
	}

	 public String getName() {
	      return name;
	 } 
	
 //abstract method
	 
	 @Override
	 public void setImage(Image image0) {
			this.image0 = image0;
	}

	 @Override
	 public Image getImage() {
		      return image0;
	 } 
	
	 @Override
	 public String getplayerType() {
		 return playerType;
		}

	@Override
	public void setplayerType(String playerType) {
		this.playerType = playerType;	
		}

}

