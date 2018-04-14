package application;
import javafx.*;
import javafx.application.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class RestaurantGUI implements Initializable{
	
@FXML	public Text text0;
@FXML	public Text text1;
@FXML  	public Text text2;
@FXML	public Text text3;
@FXML	public Text text4;
@FXML	public Text text5;
	 	
	 	
private LinkedList<Order> orderList2 = new LinkedList<Order>();
@FXML	public AnchorPane AnchorPane0;
@FXML	public AnchorPane AnchorPane1;
@FXML	public AnchorPane AnchorPane2;
@FXML	public AnchorPane AnchorPane3;
@FXML	public AnchorPane AnchorPane4;
@FXML	public AnchorPane AnchorPane5;
  
 public void setList(Order newOrder) {
	 orderList2.add(newOrder);
	 setOrderNames();
	 
 }
 public void setOrderNames() {
	//System.out.println(orderList2.size());
	 clearWindow();
	 switch (orderList2.size()) {
	 
	 case 0:{
		 break;
	 }
	
	 case 1:{	 
		 	text0.setText(orderList2.get(0).getName());
		 	AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
		 
		 }
		 case 2:{
			 text0.setText(orderList2.get(0).getName());
			 text1.setText(orderList2.get(1).getName());
		
			 AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
			 AnchorPane1.getChildren().add(orderList2.get(1).showOrder());
			
	
		 }
		 case 3:{
			 text0.setText(orderList2.get(0).getName());
			 text1.setText(orderList2.get(1).getName());
			 text2.setText(orderList2.get(2).getName());
		
			 AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
			 AnchorPane1.getChildren().add(orderList2.get(1).showOrder());
			 AnchorPane2.getChildren().add(orderList2.get(2).showOrder());
	
		 }
		 case 4:{
			 text0.setText(orderList2.get(0).getName());
			 text1.setText(orderList2.get(1).getName());
			 text2.setText(orderList2.get(2).getName());
			 text3.setText(orderList2.get(3).getName());
			 
		
			 AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
			 AnchorPane1.getChildren().add(orderList2.get(1).showOrder());
			 AnchorPane2.getChildren().add(orderList2.get(2).showOrder());
			 AnchorPane3.getChildren().add(orderList2.get(3).showOrder());
	
	
		 }
		 case 5:{
			 text0.setText(orderList2.get(0).getName());
			 text1.setText(orderList2.get(1).getName());
			 text2.setText(orderList2.get(2).getName());
			 text3.setText(orderList2.get(3).getName());
			 text4.setText(orderList2.get(4).getName());
		
			 AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
			 AnchorPane1.getChildren().add(orderList2.get(1).showOrder());
			 AnchorPane2.getChildren().add(orderList2.get(2).showOrder());
			 AnchorPane3.getChildren().add(orderList2.get(3).showOrder());
			 AnchorPane4.getChildren().add(orderList2.get(4).showOrder());
	
			 
		 }
		 default:{
			 /*
			 text0.setText(orderList2.get(0).getName());
			 text1.setText(orderList2.get(1).getName());
			 text2.setText(orderList2.get(2).getName());
			 text3.setText(orderList2.get(3).getName());
			 text4.setText(orderList2.get(4).getName());
			 text5.setText(orderList2.get(5).getName());
			 AnchorPane0.getChildren().add(orderList2.get(0).showOrder());
			 AnchorPane1.getChildren().add(orderList2.get(1).showOrder());
			 AnchorPane2.getChildren().add(orderList2.get(2).showOrder());
			 AnchorPane3.getChildren().add(orderList2.get(3).showOrder());
			 AnchorPane4.getChildren().add(orderList2.get(4).showOrder());
			 AnchorPane5.getChildren().add(orderList2.get(5).showOrder());
			 */
			 
		 }
	 
	
	 }
	 
 }

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}





public void orderCompleteBtn() {
	clearWindow();
	 

	 orderList2.removeFirst();
	 setOrderNames();
}
public void clearWindow() {
	 switch (orderList2.size()) {
	 case 0:{
		 break;
	 }
		
	 case 1:{	 
		 	AnchorPane0.getChildren().removeAll();
		 
		 
		 }
		 case 2:{
		
			
			 AnchorPane0.getChildren().removeAll();
			 AnchorPane1.getChildren().removeAll();
			
		 }
		 case 3:{
			
			 AnchorPane0.getChildren().removeAll();
			 AnchorPane1.getChildren().removeAll();
			 AnchorPane2.getChildren().removeAll();
			
		 }
		 case 4:{
			 AnchorPane0.getChildren().removeAll();
			 AnchorPane1.getChildren().removeAll();
			 AnchorPane2.getChildren().removeAll();
			 AnchorPane3.getChildren().removeAll();
	
	
	
		 }
		 case 5:{
			
	
			 AnchorPane0.getChildren().removeAll();
			 AnchorPane1.getChildren().removeAll();
			 AnchorPane2.getChildren().removeAll();
			 AnchorPane3.getChildren().removeAll();
			 AnchorPane4.getChildren().removeAll();
		
		 }
		 default:{
			 AnchorPane0.getChildren().removeAll();
			 AnchorPane1.getChildren().removeAll();
			 AnchorPane2.getChildren().removeAll();
			 AnchorPane3.getChildren().removeAll();
			 AnchorPane4.getChildren().removeAll();
			 AnchorPane5.getChildren().removeAll();
			 
		 }
	 
	
	 }
}
}
