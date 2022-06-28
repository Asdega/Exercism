import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
       
        List<String> protein = new ArrayList<String>();
        String codon = "";
        for (int i = 0 ; i < rnaSequence.length() ; i = i+3){
            codon = rnaSequence.substring(i,i+3);
            switch(codon){
                case "AUG":
                    protein.add("Methionine");
                    break;
                case "UUU" , "UUC":
                    protein.add("Phenylalanine");
                    break;
                case "UUA" , "UUG":    
                    protein.add("Leucine");
                    break;
                case "UCU" , "UCC" , "UCA" , "UCG":
                    protein.add("Serine");
                    break;
                case "UAU" , "UAC" :
                    protein.add("Tyrosine");
                    break;
                case "UGU" , "UGC" :
                    protein.add("Cysteine");
                    break;
                case "UGG" :
                    protein.add("Tryptophan");
                    break;
                case "UAA" , "UAG" , "UGA" :
                    i = rnaSequence.length();
                    break;
            }
            
        }
        return protein;
        
        // dividir la string en substrings de length 3 (codon)
        // anyadir la proteina correspondiente a cada substring a la lista
        // break cuando sea un codon de stop
    }
}
