package in.mesauravjha;

public class Car {
    private final int numberOfSeats;
    private final Engine engine;

    private Car(Builder builder){
        this.numberOfSeats = builder.numberOfSeats;
        this.engine = builder.engine;
    }

    @Override
    public String toString(){
        return "Engine: " + this.engine + " Number of seats: " + this.numberOfSeats;
    }

    public static class Builder {
        private int numberOfSeats;
        private Engine engine;

        public static Builder newInstance(){
            return new Builder();
        }

        public Builder setNumberOfSeats(int numberOfSeats){
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder setEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public Car Build(){
            return new Car(this);
        }
    }
}
