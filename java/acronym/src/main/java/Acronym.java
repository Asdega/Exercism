class Acronym {

    String acronim;
    
    Acronym(String phrase) {
        phrase = phrase.replace("-", " ");
        phrase = phrase.replace("_", " ");
        phrase = phrase.replace("/", " ");
        String[] words = phrase.split(" ");
        String acronym = "";
        for (String word:words){
            word.trim();
            if(word.isEmpty()){
      }else{
            acronym = acronym + word.charAt(0); 
            acronym = acronym.toUpperCase();
        }
   
    }
     this.acronim = acronym;    
    }
    String get() {
     return acronim;   
    }
    
}
