package in.mesauravjha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeliveryService {

    public void sendNotification(){
        List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("email","sms")));
        notifications.forEach(notification -> notification.send());
    }
}
