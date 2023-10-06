package Creacionales.Builder.Cars;

public class Manual {
    private String engine;
    private int seats;
    private boolean tripComputer;
    private boolean gps;
    private String type;

    public Manual(String engine, int seats, boolean tripComputer, boolean gps, String type) {
        this.engine = engine;
        this.seats = seats;
        this.tripComputer = tripComputer;
        this.gps = gps;
        this.type = type;
    }

    public String print() {
        String str = "";
        str += "Engine: " + this.engine + "\n";
        str += "Seats: " + this.seats + "\n";
        str += "Trip Computer: " + this.tripComputer + "\n";
        str += "GPS: " + this.gps + "\n";
        str += "Type: " + this.type + "\n";
        return str;
    }
}
