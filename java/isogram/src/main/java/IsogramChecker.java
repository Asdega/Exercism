class IsogramChecker {

    boolean isIsogram(String phrase) {
        
        phrase = phrase.replaceAll("-","");
        phrase = phrase.replaceAll(" ","");
        phrase = phrase.toLowerCase();
        boolean isogram = true;
        for (int i = 0 ; i < phrase.length() ; i++){
            for (int j = i + 1 ; j < phrase.length() ; j++){
                if (phrase.charAt(i) == phrase.charAt(j)){
                    isogram = false;
                }
                
            }
        
            }
        return isogram;
    }

}
