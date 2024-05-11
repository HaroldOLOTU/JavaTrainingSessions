package OOPConceptPart2;

public class TestCar {

    public static void main(String[] args){

        //static polymorphism--compile-time polymorphism
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftsafety();
        b.engine();

        //inheritance method overriding

        System.out.println("---------------");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine();

        System.out.println("---------------");


        // top casting
        Car c1 = new BMW(); //child class object can be referred by parent class reference variable--dynamic polymorphism
        c1.start();
        c1.stop();
        c1.refuel();

        //Down casting
        BMW b1 = (BMW)new Car(); // ClassCastException
        // Down casting is not allowed.At run time, it will give a class cast exception error.
        // Parent cannot be fit into child class reference variable
        // Your are degradding the car cast of car class parent class into child class object then
        // reference by child class reference variable
    }
}
