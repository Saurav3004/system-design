package in.mesauravjha;


public class Main {
    static void main() {

        Car car = Car.Builder.newInstance().setEngine(Engine.PETROL_ENGINE).setNumberOfSeats(2).Build();
        System.out.println(car);
    }
}

