abstract class Fighter {

    boolean isVulnerable() {
        boolean isVulnerable = false;
        return isVulnerable;
    }

    abstract int damagePoints(Fighter fighter);
    
    public String toString() {
      return "Fighter is a " + this.getClass().getSimpleName();
}
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    @Override
    int damagePoints(Fighter wizard) {
        int damagePoints = 0;
        boolean b = wizard.isVulnerable();
        if (b){
           damagePoints = 10;
        }else{
           damagePoints = 6; 
        }
        return damagePoints;
        } 
    }



class Wizard extends Fighter {

    boolean prepareSpell;

     @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }


    @Override
    boolean isVulnerable() {
        boolean isVulnerable = true;
        if (prepareSpell == true){
        isVulnerable = false;      
        }
        return isVulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        int damagePoints = 0;
        if (prepareSpell){
           damagePoints = 12;
        }else{
           damagePoints = 3; 
        }
        return damagePoints;
        }

    void prepareSpell() {
      this.prepareSpell = true;
    }

}
