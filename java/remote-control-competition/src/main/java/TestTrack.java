import java.util.List;
import java.util.ArrayList;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List productionRemoteControlCar = new ArrayList();
        int car1Vic = prc1.getNumberOfVictories();
        int car2Vic = prc2.getNumberOfVictories();
        if (car1Vic >= car2Vic){
            productionRemoteControlCar.add(prc2);
            productionRemoteControlCar.add(prc1);
        }else{
            productionRemoteControlCar.add(prc1);
            productionRemoteControlCar.add(prc2);
        }
        return productionRemoteControlCar;
    }
}
