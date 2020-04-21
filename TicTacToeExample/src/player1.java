//JavaFX Requirement
import javafx.scene.image.Image;

//JavaFX Requirement
public class player1 extends players {

	private String name;
	
	private Image imageX;

	private String playerType;
	 
	 public player1() {
		}

	public player1(String name, String playerType, Image imageX) {
		super(name);
		this.imageX=imageX;
		this.playerType=playerType;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	 public String getName() {
	      return name;
	 }
 
	 //abstract method
	 @Override
	 public void setImage(Image imageX) {
			this.imageX = imageX;
	}

	 @Override
	 public Image getImage() {
		      return imageX;
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