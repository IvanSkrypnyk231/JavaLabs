package lab;

public record Car(double power, String brand, int max_speed, int year, String color, String country) {
    private static String sellingCountry = "Ukraine";

    public Car(double power, String brand, int max_speed) {
        this(power, brand, max_speed, 2000, "black", "Japan");
    }

    public Car() {
        this(100, "Ford", 180);
    }

    @Override
    public String toString() {
        return color.substring(0,1).toUpperCase() + color.substring(1) + " " + brand + " " + year + " year" +
                " (horse power = " + power +
                " / max_speed = " + max_speed +
                " km/h) country is " + country;
    }

    public static String sellingInfo() {
        return "Cars are located at " + sellingCountry;
    }
}
