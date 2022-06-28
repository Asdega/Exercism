class ResistorColor {
    int colorCode(String color) {
       
        int colorCode;
        switch (color){
            case "black":
                return colorCode = 0;
            case "brown":
                return colorCode = 1;
            case "red":
                return colorCode = 2;
            case "orange":
                return colorCode = 3;
            case "yellow":
                return colorCode = 4;
            case "green":
                return colorCode = 5;
            case "blue":
                return colorCode = 6;    
            case "violet":
                return colorCode = 7; 
            case "grey":
                return colorCode = 8; 
            case "white":
                return colorCode = 9; 
            default:
                throw new IllegalArgumentException ("invalid entry");             
        }
       
    }

    String[] colors() {

        String[] colors = new String[]{ "black","brown","red","orange","yellow","green","blue","violet","grey","white" }; 
    return colors;
    }
}
