package demo;


public class MotorController {

    public void startAllMotors() {
        System.out.println("All motors started.");
    }

    public void stopAllMotors() {
        System.out.println("All motors stopped.");
    }

    public void setMotorSpeed(int motorId, int speed) {
        System.out.println("Motor " + motorId + " speed set to " + speed + "%." );
    }
}
