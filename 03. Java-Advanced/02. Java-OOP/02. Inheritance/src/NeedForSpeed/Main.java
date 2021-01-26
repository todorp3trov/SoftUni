package NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar(9, 1200);
        System.out.println(sportCar.getFuel());
        sportCar.drive(100);
        System.out.println(sportCar.getFuel());
    }
}
