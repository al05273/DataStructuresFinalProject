package application;

import java.util.ArrayList;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Order extends Application{
  private String name;
  private double price;
  private LinkedList <MenuItem> orderItems;
  private ArrayList <MenuItem> drinkList = new ArrayList();
  private ArrayList <MenuItem> sideList = new ArrayList();
  private ArrayList <MenuItem> entreeList = new ArrayList();
  
  
  public Order(String name, double price, LinkedList <MenuItem> orderItems){
	  this.name = name;
	  this.price = price;
	  this.orderItems = orderItems;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setOrderItems(LinkedList<MenuItem> orderItems){
    this.orderItems = orderItems;
  }
  
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public LinkedList<MenuItem> getOrderItems() {
	return orderItems;
}

public ArrayList<MenuItem> getDrinkList() {
	return drinkList;
}
public void setDrinkList(ArrayList<MenuItem> drinkList) {
	this.drinkList = drinkList;
}
public ArrayList<MenuItem> getSideList() {
	return sideList;
}
public void setSideList(ArrayList<MenuItem> sideList) {
	this.sideList = sideList;
}
public ArrayList<MenuItem> getEntreeList() {
	return entreeList;
}
public void setEntreeList(ArrayList<MenuItem> entreeList) {
	this.entreeList = entreeList;
}
public void separateItems(){
	 for (int i = 0; i< this.getOrderItems().size(); i++){
		 if(this.getOrderItems().get(i).getType().toString().equals("DRINK")){
			 this.drinkList.add(this.getOrderItems().get(i));
		 }
		 else if(this.getOrderItems().get(i).getType().toString().equals("SIDE")){
			 this.sideList.add(this.getOrderItems().get(i));
		 }
		 else{this.entreeList.add(this.getOrderItems().get(i));
		 }
	 }
}
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	
}
 public VBox showOrder(){
	 separateItems();
	 Text oName = new Text(this.getName());
	 Text[] eItems = new Text[this.getEntreeList().size()];
	 Text[] sItems = new Text[this.getSideList().size()];
	 Text[] dItems = new Text[this.getDrinkList().size()];
	 
	 VBox orderBox = new VBox();
	 for(int i = 0; i < this.getEntreeList().size();i++){
		 eItems[i] = new Text(this.getEntreeList().get(i).getName());
		 orderBox.getChildren().add(eItems[i]);
	 }
	 for(int i = 0; i< this.getSideList().size(); i++){
		 sItems[i] = new Text(this.getSideList().get(i).getName());
		 orderBox.getChildren().add(sItems[i]);
	 }
	 for(int i = 0; i< this.getDrinkList().size(); i++){
		 dItems[i] = new Text(this.getDrinkList().get(i).getName());
		 orderBox.getChildren().add(dItems[i]);
	 }
	 return orderBox;
	 
 }
}
