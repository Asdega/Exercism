class Lasagna
{
    // TODO: define the 'ExpectedMinutesInOven()' method
    public int ExpectedMinutesInOven(){
        int expectedMin = 40;
        return expectedMin;
    }
 
    // TODO: define the 'RemainingMinutesInOven()' method
    public int RemainingMinutesInOven(int minutesInOven){
        int remainingInOven = 40 - minutesInOven;
        return remainingInOven;
    }
   
    // TODO: define the 'PreparationTimeInMinutes()' method
    public int PreparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }

    // TODO: define the 'ElapsedTimeInMinutes()' method
    public int ElapsedTimeInMinutes(int layers , int minutesInOven){
        int minWorked = layers * 2 + minutesInOven;
        return minWorked;
        
    }
}
