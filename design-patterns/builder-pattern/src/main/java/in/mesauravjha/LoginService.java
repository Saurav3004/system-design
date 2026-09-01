package in.mesauravjha;

public class LoginService {
    public void registerUser(String name,int age,String email,String city){
        User user = new User.UserBuilder().setName(name).setAge(age).setEmail(email).setCity(city).build();
        System.out.println("Registered successfully: "+user);
    }
}
