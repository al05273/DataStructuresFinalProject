import java.util.ArrayList;

public class Order{
  String name; double price; ArrayList orderItems;
  public Order(String name, double price, ArrayList orderItems){

  }
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setOrderItems(ArrayList orderItems){
    this.orderItems = orderItems;
  }
}
