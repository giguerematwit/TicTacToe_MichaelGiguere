//requirement JavaFx
import javafx.scene.image.Image;

//requirement multiple classes
//requirement abstract class
public abstract class players {
	

	private String name;

	public players() {
		}
		
	public players(String name) {
	    this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 public String getName() {
	      return name;
	 }
	  
	 
	 ///requirement abstract class and methods
	public abstract void setplayerType(String playerType);

	public abstract String getplayerType();

	public abstract void setImage(Image image);
	
	public abstract Image getImage();
	
}

