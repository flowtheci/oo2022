import java.util.List;

public class Order {

    public enum Status {PREPARING, COURIER_ON_WAY, DELIVERING, ARRIVED}

    int id;
    Status status;
    Courier courier;
    Restaurant restaurant;
    List<MenuItem> orderItems;
    long totalOrderPrice;

    public Order(){
    }
    
    public Order(int id, Status status, Courier courier, Restaurant restaurant, List<MenuItem> orderItems) {
        this.id = id;
        this.status = status;
        this.courier = courier;
        this.restaurant = restaurant;
        this.orderItems = orderItems;

        for(MenuItem item : orderItems){
            this.totalOrderPrice += item.getPrice();
        }
    }

    public static Order newOrder(int id, Status status, Courier courier, Restaurant restaurant, List<MenuItem> orderItems) {
        Order order = new Order(id, status, courier, restaurant, orderItems);
        courier.setOrder(order);
        courier.setStatus(Courier.Status.BUSY);
        return order;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Courier getCourier() {
        return this.courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<MenuItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(List<MenuItem> orderItems) {
        this.orderItems = orderItems;
    }

    public long getTotalOrderPrice() {
        return this.totalOrderPrice;
    }

    public void setTotalOrderPrice(long totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }


}
