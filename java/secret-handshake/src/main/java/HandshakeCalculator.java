import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshakes = new ArrayList<Signal>();
        String b = Integer.toBinaryString(number);
        String zero = "0";
        //for loop no funciona con length inferior a 5. rellenamos con 0 pq 0 no anyade acciones
        while (b.length() < 5){
        b = zero.concat(b);
          }  
        //solo hay 5 acciones, los demas digitos no se usan
         while (b.length() > 5){
        b = b.substring(b.length()-5);
         }
        //un if para cada una de las 5 acciones. empezando desde la derecha (por eso hacemos i=length e i--). 
        for (int i=b.length()-1; i>=0; i--){
            if (i ==4 && b.charAt(i) == '1') {
                handshakes.add(Signal.WINK);  
            } else if (i ==3 && b.charAt(i) == '1') {
                handshakes.add(Signal.DOUBLE_BLINK); 
            } else if (i ==2 && b.charAt(i) == '1') {
                handshakes.add(Signal.CLOSE_YOUR_EYES); 
            } else if (i ==1 && b.charAt(i) == '1') {
                handshakes.add(Signal.JUMP); 
            } else if (i ==0 && b.charAt(i) == '1') {
                Collections.reverse(handshakes);
            }
    }
        return handshakes;
}
}
        
     // if(b.charAt(i) == 1) {
            //     handshakes.add(Signal.WINK);  
            //     } 
            // if(b.charAt(i) == 1) {
            //     handshakes.add(Signal.DOUBLE_BLINK);      
            //     }
            // if(b.charAt(i) == 1) {
            //     handshakes.add(Signal.CLOSE_YOUR_EYES);      
            //     }
            // if(b.charAt(i) == 1) {
            //     handshakes.add(Signal.JUMP);      
            //     }    

