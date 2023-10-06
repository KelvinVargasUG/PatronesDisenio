package Creacionales.Builder.Cars;

public class Car {
    private String engine;
    private int seats;
    private boolean tripComputer;
    private boolean gps;
    private String type;

    public Car(String engine, int seats, boolean tripComputer, boolean gps, String type) {
        this.engine = engine;
        this.seats = seats;
        this.tripComputer = tripComputer;
        this.gps = gps;
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
