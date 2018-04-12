package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {
public Button button;
public Button reset;
public ToggleGroup entreeGroup;
public ToggleGroup sideGroup;
public ToggleGroup drinkGroup;
public TextField name;
String orderName;
String entreePick;
String sidePick;
String drinkPick;
private Menu menu = new Menu();

 LinkedList<MenuItem> orderList = new LinkedList<MenuItem>();


public void entreeSelect() {
	RadioButton selectedRadioButton = (RadioButton) entreeGroup.getSelectedToggle();
	entreePick = selectedRadioButton.getId();
	
	
	orderList.add(menu.getFries());
	
	orderList.removeFirstOccurrence(menu.getFries());
	
}
public void sideSelect() {
	RadioButton selectedRadioButton = (RadioButton) sideGroup.getSelectedToggle();
	sidePick = selectedRadioButton.getId();
}
public void drinkSelect() {
	RadioButton selectedRadioButton = (RadioButton) drinkGroup.getSelectedToggle();
	drinkPick = selectedRadioButton.getId();
}
public String getName() {
	return orderName = name.getText();
	
}
public void handleButtonClick() {
	double cost = 0;
	for (int i =0; i<orderList.size(); i++) {
		cost+=orderList.get(i).getPrice();
	}
	Order newOrder = new Order(getName(), cost, orderList);
	System.out.println(newOrder.getName());

	
	
}
public void handleResetClick() {
	
	orderList.clear();
	name.clear();
	//lol
}

public void minusChkNugClick(){
	if(orderList.contains(menu.getChkNug())) {
	orderList.removeFirstOccurrence(menu.getChkNug());
	
}}
public void plusChkNugClick(){
	orderList.add(menu.getChkNug());
	
	
}


public void minusChkSandClick(){
	if(orderList.contains(menu.getChkSand())) {
	orderList.removeFirstOccurrence(menu.getChkSand());
	
}}
public void plusChkSandClick(){
	orderList.add(menu.getChkSand());
	
}


public void minusChkStripClick(){
	if(orderList.contains(menu.getChkStrip())) {
	orderList.removeFirstOccurrence(menu.getChkStrip());
	
}}
public void plusChkStripClick(){
	orderList.add(menu.getChkStrip());
	
}

public void minusSaladClick(){
	if(orderList.contains(menu.getSalad())) {
	orderList.removeFirstOccurrence(menu.getSalad());
	
}}
public void plusSaladClick(){
	orderList.add(menu.getSalad());
	
}


public void minusFriesClick(){
	if(orderList.contains(menu.getFries())) {
	orderList.removeFirstOccurrence(menu.getFries());
	
}}
public void plusFriesClick(){
	orderList.add(menu.getFries());
	
}
public void minusFrtCupClick(){
	if(orderList.contains(menu.getFrtCup())) {
	orderList.removeFirstOccurrence(menu.getFrtCup());
	
}}
public void plusfrtCupClick(){
	orderList.add(menu.getFrtCup());
	
}
public void minusSwTeaClick(){
	if(orderList.contains(menu.getSwTea())) {
	orderList.removeFirstOccurrence(menu.getSwTea());
	
}}
public void plusSwTeaClick(){
	orderList.add(menu.getSwTea());
	
}

public void minusLemonadeClick(){
	if(orderList.contains(menu.getLemonade())) {
	orderList.removeFirstOccurrence(menu.getLemonade());
	
}}
public void plusLemonadeClick(){
	orderList.add(menu.getLemonade());
	
}
public void minusCokeClick(){
	if(orderList.contains(menu.getCoke())) {
	orderList.removeFirstOccurrence(menu.getCoke());
	
}}
public void plusCokeClick(){
	orderList.add(menu.getCoke());
	
}


}
