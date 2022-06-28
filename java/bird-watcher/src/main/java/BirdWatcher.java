import java.util.Arrays;  
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
    int [] birdsLastWeek =  {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    } 
    

    public int getToday() {
  
        if (this.birdsPerDay.length > 0 ){
            return this.birdsPerDay[this.birdsPerDay.length-1];

      }else{
        return 0;        
      }  
    }

    public void incrementTodaysCount() {
      this.birdsPerDay[this.birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {

        for (int i = 0; i<birdsPerDay.length ; i++){
            if (birdsPerDay[i] == 0){
            return true;
                } 
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i = 0; i<numberOfDays && i< birdsPerDay.length; i++){
           total += birdsPerDay[i]; 
        }
        return total;
    }

    public int getBusyDays() {
    int busyDaysCount = 0;
        for (int i = 0; i<this.birdsPerDay.length ; i++){ 
            if (birdsPerDay[i] >= 5) {
                busyDaysCount ++;
            } 
        }
        return busyDaysCount; 
    }     
}
