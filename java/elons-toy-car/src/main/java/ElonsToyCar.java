public class ElonsToyCar {

    int distanceDriven;
    int battery = 100;
    
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        String d = Integer.toString(distanceDriven);
        String distanceDisplay = "Driven " + d + " meters";
        return distanceDisplay;
    }

    public String batteryDisplay() {
        String batteryDisplay = "";
        if (battery >0){
        String b = Integer.toString(battery);
        batteryDisplay = "Battery at " + b + "%";
        }else{
        batteryDisplay = "Battery empty";
            }
        return batteryDisplay;
    }

    public void drive() {
       if (battery == 0) {
       batteryDisplay(); 
       }else{
           battery --;
           distanceDriven += 20;
       }
        batteryDisplay(); 
        
    }
}
