public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsProduced =  221 * speed;
        switch (speed) {
            case 1, 2, 3, 4:
            carsProduced = carsProduced * 1;
            break;

            case 5, 6, 7, 8:
            carsProduced = carsProduced * 0.9;
            break;

            case 9:
            carsProduced = carsProduced * 0.8;
            break;   

            case 10:
            carsProduced = carsProduced * 0.77;
            break;      
        }
        return carsProduced;
    }

    public int workingItemsPerMinute(int speed) {
        int workingCars = (int) productionRatePerHour(speed)/60;
        return workingCars;       
    }
    public int workingItemsPerSec (int speed){
        int workingCars = workingItemsPerMinute(speed) /60;
        return workingCars;
    }
}
