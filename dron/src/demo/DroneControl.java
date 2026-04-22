package demo;

public class DroneControl {



    private MotorController motorController;
    private GPSModule gpsModule;
    private SolarPanel solarPanel;
    private AltitudeSensor altitudeSensor;
    private ObstacleDetector obstacleDetector;
    private BatteryManager batteryManager;

    public DroneControl() {
        motorController = new MotorController();
        gpsModule = new GPSModule();
        solarPanel = new SolarPanel();
        altitudeSensor = new AltitudeSensor();
        obstacleDetector = new ObstacleDetector();
        batteryManager = new BatteryManager();
    }

    public void startMotors() {
        if (motorController != null) {
            motorController.startAllMotors();
        }
    }

    public void stopMotors() {
        if (motorController != null) {
            motorController.stopAllMotors();
        }
    }

    public void setMotorSpeed(int motorId, int speed) {
        if (motorController != null) {
            motorController.setMotorSpeed(motorId, speed);
        }
    }

    public void getGPSLocation() {
        if (gpsModule != null) {
            String location = gpsModule.getLocation();
            System.out.println("Current Location: " + location);
        }
    }

    public void monitorSolarPower() {
        if (solarPanel != null) {
            double power = solarPanel.getPowerOutput();
            System.out.println("Current Solar Power Output: " + power + " watts");
        }
    }

    public void checkAltitude() {
        if (altitudeSensor != null) {
            double altitude = altitudeSensor.getAltitude();
            System.out.println("Current Altitude: " + altitude + " meters");
        }
    }

    public void detectObstacles() {
        if (obstacleDetector != null) {
            boolean obstacleDetected = obstacleDetector.isObstacleDetected();
            System.out.println("Obstacle Detected: " + (obstacleDetected ? "Yes" : "No"));
        }
    }

    public void checkBatteryStatus() {
        if (batteryManager != null) {
            double batteryLevel = batteryManager.getBatteryLevel();
            System.out.println("Battery Level: " + batteryLevel + "%");
        }
    }

    public static void main(String[] args) {
        DroneControl drone = new DroneControl();
        drone.startMotors();
        drone.setMotorSpeed(1, 50);
        drone.getGPSLocation();
        drone.monitorSolarPower();
        drone.checkAltitude();
        drone.detectObstacles();
        drone.checkBatteryStatus();
        drone.stopMotors();
    }
}
