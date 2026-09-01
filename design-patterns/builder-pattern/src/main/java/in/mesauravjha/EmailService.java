package in.mesauravjha;

public class EmailService {

    public void sendWelcomeEmail(){
        User user = new User.UserBuilder().setName("xyz").setEmail("x@gmail.com").setAge(10).build();
        System.out.println("Welcome email sent to: "+user);
    }
}
