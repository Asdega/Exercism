public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    // Attributes
    int ovenTime=40;
    //Constructor
    // Methods
    public int expectedMinutesInOven(){
        return this.ovenTime;
    }

    public int remainingMinutesInOven (int actualOvenTime){
        return this.ovenTime - actualOvenTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int numOfLayers){
        return numOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes (int numbOfLayers, int actualOvenTime){
        int totalMinutes;
        int prepTime =numbOfLayers*2;
        totalMinutes = prepTime + actualOvenTime;
        return totalMinutes;
    }
}

class Main {
    public static void main(String[] args){
    Lasagna lasagna = new Lasagna();

   System.out.println(lasagna.expectedMinutesInOven()); 
        
    }
}