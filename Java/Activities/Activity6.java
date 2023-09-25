package Activities;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private LocalDateTime lastTimeTookOf;
    private LocalDateTime lastTimeLanded;

    public Plane(int passen) {
        this.maxPassengers=passen;
        this.passengers=new ArrayList<>();

        // private  passengers;
        // private int maxPassengers;
        //  private Date lastTimeTookOf;
        // private Date lastTimeLanded;

    }

    public void onboard(String p) {
        this.passengers.add(p);
        System.out.println("Passenger Added " + p);
    }

    public LocalDateTime takeOff() {
        return java.time.LocalDateTime.now();
    }

    public void land() {
        lastTimeLanded = takeOff();
        this.passengers.clear();
        System.out.println("Landed Executed " + lastTimeLanded + this.passengers);
    }

    public LocalDateTime getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return this.passengers;

    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane=new Plane(10);
        plane.onboard("A");
        plane.onboard("B");
        plane.onboard("C");
        plane.onboard("D");

        System.out.println("Take Off Time " + plane.takeOff());
        System.out.println("List Of Passengers " + plane.getPassengers());
        Thread.sleep(10);
        plane.land();
        System.out.println("Landed");
        System.out.println("Landed Time " + plane.getLastTimeLanded());



    }
}

