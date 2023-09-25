package Activities;

public class Activity1 {

    public static void main(String[] args) {
        Car carName = new Car();
        carName.color = "Black";
        carName.make = 2014;
        carName.transmission = "Manual";
        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();


    }


}

class Car {

    String color; String transmission; int make; int tyres; int doors;
    public Car()  //Defining Constructor
    {
        tyres =4;
        doors=4;
    }

    public void displayCharacteristics()
    {
        System.out.println("The Colour of the car is " + color);
        System.out.println("The Make of the car is " +  make);
        System.out.println("The no of tyres of the car is " + tyres);
        System.out.println("The no of doors of the car is " + doors);
        System.out.println("The transmission of the car is " +transmission);

    }
    public void  accelarate()
    { System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}
