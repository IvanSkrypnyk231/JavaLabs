package lab;

public class Main {
    public static void main( String... args) {
        Car car1 = new Car(), car2 = new Car(130, "Opel", 200), car3 = new Car(306, "BMW", 300, 2015, "white", "USA");
        System.out.println(Car.sellingInfo());
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
