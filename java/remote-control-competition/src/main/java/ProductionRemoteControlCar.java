class ProductionRemoteControlCar implements RemoteControlCar{
    int numberofVictories;
    
    public void drive() {
        System.out.println("Driving production car");
    }

    public int getDistanceTravelled() {
        int distance = 10;
        return distance;
    }

    public int getNumberOfVictories() {
        return this.numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
        
    }
}
