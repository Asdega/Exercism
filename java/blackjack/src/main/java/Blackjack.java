public class Blackjack {

    public int parseCard(String card) {
       int value = 0;
        switch (card) {
            case "ace":
                value = 11;
                break;
            case "king", "queen", "jack", "ten":
                value = 10;
                break;     
            case "nine":
                value = 9;
                break; 
            case "eight":
                value = 8;
                break; 
            case "seven":
                value = 7;
                break; 
            case "six":
                value = 6;
                break; 
            case "five":
                value = 5;
                break; 
            case "four":
                value = 4;
                break; 
            case "three":
                value = 3;
                break; 
            case "two":
                value = 2;
                break; 
            default: 
                value = 0;
                break;
             
        }
         return value;  
    }

    public boolean isBlackjack(String card1, String card2) {
        
        int valueCard1 = parseCard(card1);
        int valueCard2 = parseCard(card2);
        return (valueCard1 + valueCard2 == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 10){
            return "W";
        }else if (isBlackjack && dealerScore >= 10){
             return "S";       
        }else{
            return "P";
        }
    }
    

    public String smallHand(int handScore, int dealerScore) {
        
        if (handScore >= 17) {
            return "S";
        }else if (handScore >= 12 && handScore <= 16 && dealerScore < 7) {
            return "S";
        }else{
            return "H";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
