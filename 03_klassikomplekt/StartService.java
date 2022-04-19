import java.util.ArrayList;
import java.util.List;

public class StartService{
    
    public static void main(String []args){
        StartService service = new StartService();
        service.start();
     }
     
    public void start() {

        // Restorani lisamine
        MenuItem burger = new MenuItem("Burger", "Tavaline juustuburger", 1.5);
        MenuItem fries = new MenuItem("Friikartulid", "Krõbedad friikartulid", 1);
        MenuItem drink = new MenuItem("Jook", "Vesi jääga", 0.5);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(burger);
        menuItems.add(fries);
        menuItems.add(drink);
        Restaurant mc = new Restaurant("McDonalds", "Burgerid ja friikad", "Tartu mnt. 1", menuItems);

        // Kulleri lisamine
        Courier courier = new Courier(1, Courier.Status.AVAILABLE);

        // Tellimuse lisamine
        List<MenuItem> orderItems = new ArrayList<>();
        orderItems.add(burger);
        orderItems.add(fries);
        orderItems.add(drink);
        Order order = Order.newOrder(1, Order.Status.PREPARING, courier, mc, orderItems);

        System.out.println("Order id: " + order.getId() + ", status: " + order.getStatus() + ", courier: " + order.getCourier().getId() + ", courier status: "
        + order.getCourier().getStatus() + ", total price: " + order.getTotalOrderPrice() + ", restaurant: " + order.getRestaurant().getName() + ", address: " + order.getRestaurant().getAddress() + ", order items: " 
        + order.getOrderItems());
    }


}