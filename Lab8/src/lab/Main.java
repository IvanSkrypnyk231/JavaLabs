package lab;

public class Main {
    public static void main(String... args){
        System.out.println("All films from " + Film.getDirector() + ":");
        Film f1 = new Film(),
                f2 = new Film("Kill Bill", 111, 1086273, "Action", 2003, "USA"),
                f3 = new Film("Reservoir Dogs", 99, 992327);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
