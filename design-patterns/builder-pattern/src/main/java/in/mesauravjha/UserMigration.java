package in.mesauravjha;

public class UserMigration {
    public void migrateUser(){

        User user = new User.UserBuilder().setName("xyz").setAge(100).setEmail("xyz").setCity("Delhi").build();
        System.out.println("User migrated: " + user);
    }
}
