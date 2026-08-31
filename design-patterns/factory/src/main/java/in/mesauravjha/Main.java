package in.mesauravjha;


public class Main {
    static void main() {
          OrderService orderService = new OrderService();
          DeliveryService deliveryService = new DeliveryService();
          orderService.sendNotification();
          deliveryService.sendNotification();
        }
}
