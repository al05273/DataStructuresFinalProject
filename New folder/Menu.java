
public class Menu {
	
	private MenuItem chkNug = new MenuItem("Chicken Nugget", 6.50, "ENTREE");
	private MenuItem chkSand = new MenuItem("Chicken Sandwich", 7.75, "ENTREE");
	private MenuItem chkStrip = new MenuItem("Chicken Strip", 7.25, "ENTREE");
	private MenuItem salad = new MenuItem("Salad", 9.5, "ENTREE");
	
	private MenuItem fries = new MenuItem("Waffle Fries", 7.5, "SIDE");
	private MenuItem frtCup = new MenuItem("Fruit Cup", 7.5, "SIDE");

	
	private MenuItem swTea = new MenuItem("Sweet Tea", 7.5, "DRINK");
	private MenuItem lemonade = new MenuItem("Lemonade", 7.5, "DRINK");
	private MenuItem coke = new MenuItem("Coke", 7.5, "DRINK");
	
	public Menu(){
		
	}
	public MenuItem getChkNug() {
		return chkNug;
	}
	public MenuItem getChkSand() {
		return chkSand;
	}
	public MenuItem getChkStrip() {
		return chkStrip;
	}
	public MenuItem getSalad() {
		return salad;
	}
	public MenuItem getFries() {
		return fries;
	}
	public MenuItem getFrtCup() {
		return frtCup;
	}
	public MenuItem getSwTea() {
		return swTea;
	}
	public MenuItem getLemonade() {
		return lemonade;
	}
	public MenuItem getCoke() {
		return coke;
	}
}
