class SpaceAge {
    
     double secondsInSpaceAge;
    
    
    SpaceAge(double seconds) {
        this.secondsInSpaceAge = seconds;
    }

    double getSeconds() {
       return this.secondsInSpaceAge;
    }

    double onEarth() {
        double earthYear = 1;
        double earth = (getSeconds() / 31557600) / earthYear;
        return earth;
    }

    double onMercury() {
        double mercuryYear = 0.2408467;
        double onMercury = (getSeconds() / 31557600) / mercuryYear;
        return onMercury;
    }

    double onVenus() {
        double venusYear = 0.61519726;
        double onVenus = (getSeconds() / 31557600) / venusYear;
        return onVenus;
    }

    double onMars() {
        double marsYear = 1.8808158;
        double onMars = (getSeconds() / 31557600) / marsYear;
        return onMars;
    }

    double onJupiter() {
        double jupiterYear = 11.862615;
        double onJupiter = (getSeconds() / 31557600) / jupiterYear;
        return onJupiter;
    }

    double onSaturn() {
        double saturnYear = 29.447498;
        double onSaturn = (getSeconds() / 31557600) / saturnYear;
        return onSaturn;
    }

    double onUranus() {
        double uranusYear = 84.016846;
        double onUranus = (getSeconds() / 31557600) / uranusYear;
        return onUranus;
    }

    double onNeptune() {
        double neptuneYear = 164.79132;
        double onNeptune = (getSeconds() / 31557600) / neptuneYear;
        return onNeptune;
    }

}
