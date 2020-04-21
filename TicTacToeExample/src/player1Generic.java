import javafx.scene.image.Image;

public class player1Generic<T> extends playersGeneric<T> {

	 public T image0;

	 private T playerType;
	 
	 public player1Generic() {

		}

	public player1Generic(T name, T playerType, T image0) {
		super(name);
		this.image0=image0;
		this.playerType=playerType;
	}
	
	public void setName(T name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	 public T getName() {
	      return name;
	 }
	 
	 
	 //abstract method
	 
	 @Override
	 public void setImage(T image0) {
			this.image0 = image0;
	}

	 @Override
	 public T getImage() {
		      return image0;
	 } 
	
	 @Override
	 public T getplayerType() {
		 return playerType;
		}

	@Override
	public void setplayerType(T playerType) {
		this.playerType = playerType;	
		}



}
