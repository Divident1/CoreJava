package Constructor.BasicBtm.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        Car c= new Car("hero");
        System.out.println(c.name);

        Car c1 = new Car("name","Red");
        System.out.println(c1.name+" "+c1.color);


        Car c2 = new Car("hyundai","black",7000);
        System.out.println(c2.name+" "+c2.color+" "+c2.price);

        Car c3 = new Car("Fortuner","white", 4332, "V14");
        System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+c3.model);

    }
}
