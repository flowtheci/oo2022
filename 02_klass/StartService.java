import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StartService{
    
    public static void main(String []args){
        StartService service = new StartService();
        service.start();
     }

    public Courier generateRandomCourier(int id) {
        Courier courier = new Courier();
        courier.setId(id);
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        switch (random) {
            case 0:
                courier.setStatus(Courier.Status.AVAILABLE);
                break;
            case 1:
                courier.setStatus(Courier.Status.BUSY);
                break;
            case 2:
                courier.setStatus(Courier.Status.DELIVERING);
                courier.setOrderId(ThreadLocalRandom.current().nextInt(0, 120));
                break;
            case 3:
                courier.setStatus(Courier.Status.OFFLINE);
                break;
        }
        return courier;
    }
     
    public void start() {
        List<Courier> courierList = new ArrayList<>();
        int seed = 15;
        for(int i = 0; i < seed; i++) {
            Courier courier = generateRandomCourier(i);
            courierList.add(courier);
        }

        for(Courier courier : courierList) {
            if (courier.getStatus() == Courier.Status.DELIVERING) {
                System.out.println("Kuller " + courier.getId() + " - " + courier.getStatus() + " ORDER: " + courier.getOrderId());
            } else {
                System.out.println("Kuller " + courier.getId() + " - " + courier.getStatus());
            }
        }
    }
}