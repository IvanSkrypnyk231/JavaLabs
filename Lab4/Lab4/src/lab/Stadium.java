package lab;

public record Stadium(int spectators, String Name, int lightingSystem, String country, String city, int year) {
    private static final String sport = "football"; // Constant( =final) value

    public Stadium(int spectators, String Name, int lightingSystem) {
        this(spectators, Name, lightingSystem, "Ukraine", "Lviv", 2012);
    }

    public Stadium() {
        this(34915, "Arena Lviv", 2800);
    }

    public static String getSport() {return sport;}

    @Override
    public String toString() {
        return "Stadium " + Name + " in " + city + ", " + country + " ( " + spectators + " spectators with lightingSystem of "
                + lightingSystem + " lux. Built in " + year + " year";
    }
}
