public class Car {
    String cars;
    Car(String car){
        cars=car;
        System.out.println("Brand is :- "+cars);
    }

    public static void main(String[] args) {
        Car benz = new Car("Benz");
        Car bmw  = new Car("BMW");
        Car audi = new Car("Audi");
    }
}
