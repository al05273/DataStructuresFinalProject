package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Controller implements Initializable {
public Button button;
public TextField name;
private double total =0;
String orderName;
String entreePick;
String sidePick;
String drinkPick;
@FXML private TableView<MenuItem> currentOrder;
@FXML private TableColumn<MenuItem, String> itemNameCol;
@FXML private TableColumn<MenuItem, String> itemPriceCol;
public Text totalText;
public VBox TotalBox;
ObservableList<MenuItem> obsOrderList = FXCollections.observableArrayList();


private Menu menu = new Menu();

 LinkedList<MenuItem> orderList = new LinkedList<MenuItem>();


public String getName() {
	return orderName = name.getText();
	
}
public double calcTotal() {
	double cost = 0;
	for (int i =0; i<orderList.size(); i++) {
		cost+=orderList.get(i).getPrice();
	}
	this.total =cost;
	return this.total;
}
public void handleButtonClick() {

	Order newOrder = new Order(getName(), calcTotal(), this.orderList);
	System.out.println(newOrder.getName());
	orderList.clear();
	name.clear();
	
	
}


public void minusChkNugClick(){
	if(orderList.contains(menu.getChkNug())) {
	orderList.removeFirstOccurrence(menu.getChkNug());
	itemRemoved();
}}
public void plusChkNugClick(){
	orderList.add(menu.getChkNug());
	itemAdded();
	
}


public void minusChkSandClick(){
	if(orderList.contains(menu.getChkSand())) {
	orderList.removeFirstOccurrence(menu.getChkSand());
	itemRemoved();
}}
public void plusChkSandClick(){
	orderList.add(menu.getChkSand());
	itemAdded();
}


public void minusChkStripClick(){
	if(orderList.contains(menu.getChkStrip())) {
	orderList.removeFirstOccurrence(menu.getChkStrip());
	itemRemoved();
}}
public void plusChkStripClick(){
	orderList.add(menu.getChkStrip());
	itemAdded();
}

public void minusSaladClick(){
	if(orderList.contains(menu.getSalad())) {
	orderList.removeFirstOccurrence(menu.getSalad());
	itemRemoved();
}}
public void plusSaladClick(){
	orderList.add(menu.getSalad());
	itemAdded();
}


public void minusFriesClick(){
	if(orderList.contains(menu.getFries())) {
	orderList.removeFirstOccurrence(menu.getFries());
	itemRemoved();
}}
public void plusFriesClick(){
	orderList.add(menu.getFries());
	itemAdded();
}
public void minusFrtCupClick(){
	if(orderList.contains(menu.getFrtCup())) {
	orderList.removeFirstOccurrence(menu.getFrtCup());
	itemRemoved();
}}
public void plusfrtCupClick(){
	orderList.add(menu.getFrtCup());
	itemAdded();
}
public void minusSwTeaClick(){
	if(orderList.contains(menu.getSwTea())) {
	orderList.removeFirstOccurrence(menu.getSwTea());
	itemRemoved();
}}
public void plusSwTeaClick(){
	orderList.add(menu.getSwTea());
	itemAdded();
}

public void minusLemonadeClick(){
	if(orderList.contains(menu.getLemonade())) {
	orderList.removeFirstOccurrence(menu.getLemonade());
	itemRemoved();
}}
public void plusLemonadeClick(){
	orderList.add(menu.getLemonade());
	itemAdded();
}
public void minusCokeClick(){
	if(orderList.contains(menu.getCoke())) {
	orderList.removeFirstOccurrence(menu.getCoke());
	itemRemoved();
}}
public void plusCokeClick(){
	orderList.add(menu.getCoke());
	itemAdded();
}

public void itemAdded() {
	calcTotal();
	
	totalText.setText("$" + total);
	
	
	currentOrder.setItems(getCurrentOrderObs());

}
public void itemRemoved() {
	calcTotal();
	
	totalText.setText("$" + total);
	
	currentOrder.setItems(removeItemObs());
}
@Override
public void initialize(java.net.URL location, ResourceBundle resources) {
	
	totalText.setText("$" + total);
	
	itemNameCol.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemPriceCol.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("price"));
	
}
public ObservableList<MenuItem> getCurrentOrderObs(){
	
		obsOrderList.add(orderList.getLast());

	return obsOrderList;
	
}
public ObservableList<MenuItem> removeItemObs(){
	
	obsOrderList.clear();
	for(int i = 0; i<orderList.size();i++) {
		obsOrderList.add(orderList.get(i));
	}
	return obsOrderList;
}
}
