public class Hamming {

    String leftStrand;
    String rightStrand;
    
    public Hamming(String leftStrand, String rightStrand) {
         if (leftStrand.length() == rightStrand.length()) {
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        } else if (leftStrand.length() == 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.length() == 0){
            throw new IllegalArgumentException("right strand must not be empty.");
        } else{
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");               
        } 
     }

    public int getHammingDistance() {
        int getHammingDistance = 0; 
        int l = this.leftStrand.length();
        for(int i = 0; i < l; i++){
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)){
                getHammingDistance ++;
            }
        }
    return getHammingDistance;
        }

}
 
