package in.mesauravjha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

    // Below is a problem in this , in this we are tightly coupled and if i add a new notification
    // then i have to add here also and i dont want that so its a major problem and we will solve
    // this by factory design.

//    EmailNotification emailNotification = new EmailNotification();
//    SmsNotification smsNotification = new SmsNotification();
//
//    public void sendNotificationEmail(){
//        emailNotification.send();
//    }
//
//    public void sendNotificationSms(){
//        smsNotification.send();
//    }


//    Notification notification;

    public void sendNotification(){

        // Still there is a problem why the object creation logic is in this it should be in factory class
        // which build the object.

//        if(type.equals("sms")){
//            notification = new SmsNotification();
//        }else if(type.equals("email")){
//            notification = new EmailNotification();
//        }else{
//            throw new IllegalArgumentException("type not found");
//        }
//
//        notification.send();

        // ---------------------------------------------------------------------------

//        Notification notification = NotificationFactory.sendNotification("sms");
//        notification.send();

        List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("email")));
        notifications.forEach(notification -> notification.send());


    }
}
