package in.mesauravjha;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification sendNotification(String type){
        if(type.equals("email")){
            return new EmailNotification();
        }else if(type.equals("sms")){
            return new SmsNotification();
        }
        throw new IllegalArgumentException("type not valid");
    }


    public static List<Notification> sendNotification(List<String> types){
        List<Notification> notifications = new ArrayList<>();

//        for (String type:types){
//            if(type.equals("email")){
//                notifications.add(new EmailNotification());
//            }else if(type.equals("sms")){
//                notifications.add(new SmsNotification());
//            }else{
//                throw new IllegalArgumentException("Invalid input");
//            }
//        }

        types.forEach((type) -> {
            if(type.equals("email")){
                notifications.add(new EmailNotification());
            }else if(type.equals("sms")){
                notifications.add(new SmsNotification());
            }else{
                throw new IllegalArgumentException("Invalid input");
            }
        });

        return notifications;
    }
}
