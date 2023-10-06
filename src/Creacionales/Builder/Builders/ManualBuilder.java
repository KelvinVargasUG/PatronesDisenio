package Creacionales.Builder.Builders;

import Creacionales.Builder.Builder.Builder;
import Creacionales.Builder.Cars.Manual;

public class ManualBuilder implements Builder {
    private String engine;
    private int seats;
    private boolean tripComputer;
    private boolean gps;
    private String type;

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
    public void setCartype(String type) {
        this.type = type;
    }

    public Manual getResult() {
        return new Manual(engine, seats, tripComputer, gps, type);
    }
}
