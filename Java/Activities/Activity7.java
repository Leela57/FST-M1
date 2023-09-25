package Activities;

interface BicycleParts {
    public int gears = 0;
    public int currentspeed = 0;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);

}
class Bicycle implements BicycleParts, BicycleOperations {
    int gears = 0;
    int currentspeed = 0;

    public Bicycle(int gears, int currentspeed) {
        this.gears = gears;
        this.currentspeed = currentspeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentspeed = currentspeed - decrement;
        System.out.println("Current Speed = " + currentspeed);

    }

    @Override
    public void speedUp(int increment) {
        currentspeed += increment;
        System.out.println("Current speed: " + currentspeed);
    }

    public String bicycleDesc() {
        return ("No of gears are " + gears + "\nSpeed of bicycle is " + currentspeed);
    }

    static class MountainBike extends Bicycle {

        public int seatHeight;

        public MountainBike(int gears, int currentspeed, int startHeight) {
            super(gears, currentspeed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        public String bicycleDesc() {
            return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
        }
    }

    //Driver class
    public static class Activity7 {
        public static void main(String args[]) {

            MountainBike mb = new MountainBike(3, 0, 25);
            System.out.println(mb.bicycleDesc());
            mb.speedUp(20);
            mb.applyBrake(5);

        }
    }
}







