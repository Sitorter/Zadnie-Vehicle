interface Vehicle {

    void start();
    void stop();

    default void FuelUP(){
        System.out.println("Fuel UP");
    }

    static String service(){
        return "service";
    }

}
class Car implements Vehicle {

    public void start(){
        System.out.println("Car Start");
    }
    public void stop(){
        System.out.println("Car Stop");
    }

}
class Motorcycle implements Vehicle {

    public void start(){
        System.out.println("Motorcycle Start");
    }
    public void stop(){
        System.out.println("Motorcycle Stop");
    }

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.start();
        car.stop();
        car.FuelUP();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.FuelUP();

        System.out.println(Vehicle.service());

    }
    
}