class ResistorColorDuo {
    int value(String[] colors) {
        int resistance = 0;
for(int i = 0 ; i<2 ; i++){
    resistance += transformColorToValue(colors[i]);
    if(i==0 && colors.length > 1){
        resistance = resistance * 10;
    }
}
  return resistance;    
    }

    int transformColorToValue (String color){
        
        switch (color){
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;    
            case "violet":
                return 7; 
            case "grey":
                return 8; 
            case "white":
                return 9; 
            default:
                throw new IllegalArgumentException ("invalid entry");             
        }
       
    }
 }
