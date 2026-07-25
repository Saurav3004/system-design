public class Main {
    public static void  main() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(3,6000);
        for (int i = 1; i<=7;i++){
            boolean isAllowed = rateLimiter.allowRequest("Saurav");
            if(isAllowed){
                System.out.println("Saurav is allowed");
            }else{
                System.out.println("Saurav is not allowed");
            }

            Thread.sleep(1000);
        }

    }
}
