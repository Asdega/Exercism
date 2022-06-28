import java.util.Arrays; 

class Scrabble {
    // Attributes
    char letters [];
    
    Scrabble(String word) {
        this.letters = word.toCharArray();
    }

    int getScore() {
        
        int score = 0;
        for (int i = 0; i < this.letters.length; i++){
        char upperChar = Character.toUpperCase(this.letters[i]);
        switch (upperChar){
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T': 
                score += 1;
                break;
            case 'D', 'G':
                score += 2;
                break;
            case 'B', 'C', 'M', 'P':
                score += 3;
                break;
            case 'F', 'H', 'V', 'W', 'Y':
                score += 4;
                break;
            case 'K':
                score += 5;
                break;
            case 'J', 'X':
                score += 8;
                break;
            case 'Q', 'Z':
                score += 10;
                break;
        }
    }
       return score; 
    }

}
