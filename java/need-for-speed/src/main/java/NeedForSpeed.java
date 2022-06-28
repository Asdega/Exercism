class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class\
    int speed;
    int batteryDrain;
    int distanceDriven;
    int battery;



    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery=100;  
    }
    public boolean batteryDrained() {

        boolean batteryDrained = false;
        if(this.battery <  this.batteryDrain){
            batteryDrained = true;
        }
        return batteryDrained;
        
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.battery >= this.batteryDrain){
            this.distanceDriven += speed;
            this.battery -= batteryDrain;
        }            
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
       return nitro;
    }
}


class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        boolean carCanFinish = false;
        do{
            car.drive();
        } while (car.battery > 0);
        int d = car.distanceDriven;
         if (d >= this.distance){
             carCanFinish = true;
         }
        
        return carCanFinish;
    }
}
