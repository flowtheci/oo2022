public class Courier {

    public enum Status {AVAILABLE, OFFLINE, BUSY, DELIVERING, UNKNOWN}
        
    int id;
    Status status;
    Order order;

    public Courier(int id, Status status) {
        this.id = id;
        this.status = status;
    }

    public Courier() {
        this.status = Status.UNKNOWN;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
}