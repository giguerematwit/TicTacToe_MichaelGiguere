import javafx.scene.image.Image;

public abstract class playersGeneric<T> {
	
	  T name;

	  //default constructor
	public playersGeneric() {
		}
		
	  /**Construct a players object*/
	public playersGeneric(T name) {
	    this.name = name;
	}

	public void setName(T name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	 public T getName() {
	      return name;
	 }
	 
	 ///requirement abstract class and methods
	public abstract void setplayerType(T playerType);

	public abstract String getplayerType();

	public abstract void setImage(T image);
	
	public abstract Image getImage();
	
}