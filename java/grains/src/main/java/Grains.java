import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger grains = BigInteger.ONE;
            if(square<1 || square>64){
                throw new IllegalArgumentException ("square must be between 1 and 64");
            }else{
            for (int i = 2; i <= square; i++){
            grains = grains.multiply(BigInteger.valueOf(2));
          }   
        }
        
        return grains;
        
    }

    BigInteger grainsOnBoard() {

    BigInteger grains = BigInteger.ONE;
    BigInteger sumGrains = BigInteger.ONE;    
        for (int i = 2; i<=64 ;i++){
        grains = grains.multiply(BigInteger.valueOf(2));    
        sumGrains = sumGrains.add(grains);
           
        }
       return sumGrains; 
        
    }

}
