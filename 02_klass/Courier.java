public class Courier {

    public enum Status {AVAILABLE, OFFLINE, BUSY, DELIVERING}
        
    int id;
    Status status;
    int orderId;

    public Courier(int id, Status status, int orderId) {
        this.id = id;
        this.status = status;
        this.orderId = orderId;
    }

    public Courier() {

    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
}