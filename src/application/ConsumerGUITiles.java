package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ConsumerGUITiles extends Rectangle{
	
	public ConsumerGUITiles(boolean color, int x, int y) { 
		setWidth(ConsumerGUI.tileSize);
		setHeight(ConsumerGUI.tileSize);
		
		relocate((x * ConsumerGUI.tileSize), (y * ConsumerGUI.tileSize));
		
		setFill(color ? Color.ANTIQUEWHITE : Color.DARKSEAGREEN);
	}

}
