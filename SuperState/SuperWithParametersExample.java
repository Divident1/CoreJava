package SuperState;

class Vehicle {
    String brand;
    int year;

    // Parameterized constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int doors;

    // Car constructor calls Vehicle constructor using super()
    Car(String brand, int year, int doors) {
        super(brand, year); // calling parameterized constructor of parent
        this.doors = doors;
        System.out.println("Car constructor called");
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // calling parent method
        System.out.println("Doors: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    // ElectricCar constructor calls Car’s constructor using super()
    ElectricCar(String brand, int year, int doors, int batteryCapacity) {
        super(brand, year, doors);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // calls Car → Vehicle chain
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

public class SuperWithParametersExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 2023, 4, 100);

        System.out.println("\n--- Vehicle Info ---");
        tesla.displayInfo();
    }
}

