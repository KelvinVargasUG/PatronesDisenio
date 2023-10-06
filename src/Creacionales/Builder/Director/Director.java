package Creacionales.Builder.Director;

import Creacionales.Builder.Builder.Builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer(true);
        builder.setGPS(true);
        builder.setCartype("Sport Car");
    }
}
