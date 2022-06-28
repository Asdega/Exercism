import java.util.ArrayList;
import java.lang.Math;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        ArrayList<Integer> result = new ArrayList<>();
        String s = Integer.toString(numberToCheck);
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) { 
              int a = Character.getNumericValue(s.charAt(i));
               result.add(a);
        }
        for (int j = 0; j < result.size(); j++){
            sum += Math.pow(result.get(j), s.length());
        }
                
      return sum == numberToCheck;
    }
}
