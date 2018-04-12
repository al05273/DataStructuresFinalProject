package application;

public class MenuItem{
  private String name, description;
  private itemType type;
  private double price;
  public MenuItem(String name, double price, String type){

  }

  public enum itemType{
    DRINK, SIDE, ENTREE;

  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public itemType getType() {
	return type;
}

public void setType(itemType type) {
	this.type = type;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
  
  
}
