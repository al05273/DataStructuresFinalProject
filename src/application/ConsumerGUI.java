package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ConsumerGUI extends Application {

	private int x0, y0, x1, y1, tempX, tempY;
	public static int tileSize = 100, tileWidth = 8, tileHeight = 8;
	
	public static Group tileGroup = new Group();
	
	private ConsumerGUITiles[][] boardArr = new ConsumerGUITiles[tileWidth][tileHeight];

	private Pane mainPane;
	private StackPane pane;
	private Scene scene;
	private Pane board = new Pane();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Backgrounds
		Rectangle background = new Rectangle(1000, 500);
		background.setFill(Color.WHITE);
		
		createBoard();
		
		VBox holder = new VBox(30);
		holder.getChildren().addAll(board);
		holder.setAlignment(Pos.CENTER);
		
		mainPane = new Pane(background, holder);
		scene = new Scene(mainPane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	private int toBoard(double pixel) { //Converts screen pixels to board tiles
		return (int)(pixel + tileSize / 2) / tileSize;
	}
	
	public void createBoard() {
		board.setPrefSize((tileWidth * tileSize), (tileHeight * tileSize));

		for (int x = 0; x < tileHeight; x++) { //Makes an 8x8 board staring with coordinate 0,0 ranging to 7,7
			for (int y = 0; y < tileWidth; y++) {
				ConsumerGUITiles tile = new ConsumerGUITiles((x + y) % 2 == 0, x, y);
				boardArr[x][y] = tile; //Array map of board
				
				tileGroup.getChildren().add(tile);

			}
		}
		board.getChildren().addAll(tileGroup);
	}
}