public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double multiplierPerDaysSkipped = 1;
        if (daysSkipped > 5){
            multiplierPerDaysSkipped = 0.85;   
            }
      return multiplierPerDaysSkipped;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int multiplierPerProductsSold = 10; 
        if (productsSold > 20){
            multiplierPerProductsSold = 13;
            return multiplierPerProductsSold;
        }
        return multiplierPerProductsSold;

    }

    public double bonusForProductSold(int productsSold) {
       int multiplier = multiplierPerProductsSold(productsSold);
        double bonusForProductSold = productsSold * multiplier;
        return bonusForProductSold;
        
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double m = multiplierPerDaysSkipped(daysSkipped);
        double b = bonusForProductSold (productsSold);
        double finalSalary = 1000 * m + b;
        if (finalSalary > 2000){
            finalSalary = 2000;  
            return finalSalary;
            }
        return finalSalary;
        } 
    } 

