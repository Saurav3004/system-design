package in.mesauravjha;

public class Singleton {

    private static Singleton connection;

    private Singleton(String name){
        System.out.println("connection to DB is established by "+ name);
    }

    public static Singleton getConnection(String name){
        if(connection == null){
            connection = new Singleton(name);
        }

        return connection;
    }
}
