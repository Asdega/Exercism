class Leap {

    boolean isLeapYear(int year) {
        boolean leapyear =  year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return leapyear;
            
        
    }

}
