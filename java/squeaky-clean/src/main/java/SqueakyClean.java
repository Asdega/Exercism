class SqueakyClean {
    //
    static String clean(String identifier) {

    //Replace whitespace with underscore
    identifier = identifier.replace(' ','_');

    // Omit Greek lower case letters
    String greekLetters[] =new String[]{"α","β","γ","δ","ε","ζ","η","θ","ι","κ","λ","μ","ν","ξ","ο","π","ρ","σ","ς","τ","υ","φ","χ","ψ","ω"};
    for (int i=0; i<greekLetters.length; i++){
        if (identifier.contains(greekLetters[i])){
            identifier = identifier.replace(greekLetters[i], "");
        }   
    }
    // Convert kebab-case to camelCase      

        int index = 1;
        //abcde
        while (index != -1){
            index = identifier.indexOf("-", index);
            if (index == identifier.length() - 1) {
                break;
                }
            if (index == -1){
                break;
            }
            if (Character.isLetter(identifier.charAt(index + 1))){
                //index posicion de - en la string
                // char index+1 es una letra
                // cambiar char a uppercase
                String subStringOne = identifier.substring(0 , index);
                String subStringTwo = identifier.substring(index , index + 2);
                subStringTwo = subStringTwo.toUpperCase();
                subStringTwo = subStringTwo.replace("-" , "");
                String subStringThree = identifier.substring(index + 2); 
                identifier = subStringOne + subStringTwo + subStringThree;
                }
            }

        // Control
        identifier = identifier.replaceAll("^\\x00-\\x7F", "");
        identifier = identifier.replaceAll("\\p{So}+", "");
        identifier = identifier.replaceAll("\\d", "");
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        return identifier;
        }
}