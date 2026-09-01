package in.mesauravjha;


public class Main {
    static void main() {
        new EmailService().sendWelcomeEmail();
        new UserMigration().migrateUser();
        new LoginService().registerUser("Saurav",100,"s@gmail.com","Delhi");
    }
}

