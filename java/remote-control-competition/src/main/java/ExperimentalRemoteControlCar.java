public class ExperimentalRemoteControlCar implements RemoteControlCar {

    public void drive() {
        System.out.println("Driving production car");
    }

    public int getDistanceTravelled() {
        int distance = 30;
        return distance;
    }
}
