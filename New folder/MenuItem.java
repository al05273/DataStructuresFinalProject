public class MenuItem{
  private String name, description;
  private itemType type;
  private double price;
  public MenuItem(String name, double price, String type){

  }

  public enum itemType{
    DRINK, SIDE, ENTREE;

  }
  
}