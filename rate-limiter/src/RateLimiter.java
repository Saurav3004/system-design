import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter {
    private int maxRequests;
    private long windowDurationInSeconds;

    RateLimiter(int requests,long seconds){
        this.maxRequests = requests;
        this.windowDurationInSeconds = seconds;
    }

    Map<String,UserRequestData> users = new HashMap<>();

    public boolean allowRequest(String userId){
        UserRequestData user = users.get(userId);

        if(user == null){
            UserRequestData userRequestData = new UserRequestData(1,System.currentTimeMillis());
            users.put(userId,userRequestData);
            return true;
        }

        long windowStartTime = user.getWindowStartTime();
        long currentTime = System.currentTimeMillis();


        long elapsedTime = currentTime - windowStartTime;


        if(elapsedTime > windowDurationInSeconds){
            UserRequestData userRequestData = new UserRequestData(1,System.currentTimeMillis());
            users.replace(userId,userRequestData);
            return true;
        }

        int count = user.getCount();
        if(count >= maxRequests){
            return false;
        }
            user.setCount();
            return true;
    }
}
