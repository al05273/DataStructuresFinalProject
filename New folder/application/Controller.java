

import java.io.IOException;
import java.util.ArrayList;

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


static ArrayList<String> order = new ArrayList<String>();

public void entreeSelect() {
	RadioButton selectedRadioButton = (RadioButton) entreeGroup.getSelectedToggle();
	entreePick = selectedRadioButton.getId();
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
	order.add(entreePick);order.add(sidePick);order.add(drinkPick);
	System.out.println(order);
	System.out.println(getName());
	
}
public void handleResetClick() {
	entreeGroup.getSelectedToggle().setSelected(false);
	sideGroup.getSelectedToggle().setSelected(false);
	drinkGroup.getSelectedToggle().setSelected(false);
	order.clear();
	name.clear();
}
}
