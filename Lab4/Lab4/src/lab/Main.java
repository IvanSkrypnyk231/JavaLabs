package lab;

public class Main {
    public static void main( String... args) {
        Stadium st1 = new Stadium(),
                st2 = new Stadium(28051, "\"Ukraine\" stadium", 1200),
                st3 = new Stadium(60441, "Mercedes-Benz Arena", 3000, "Germany", "Stuttgart", 1933);
        System.out.println("Popular " + Stadium.getSport() + " stadiums:");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
