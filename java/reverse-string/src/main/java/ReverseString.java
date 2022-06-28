class ReverseString {

    String reverse(String inputString) {
// String to Array:
char[]inputArr = inputString.toCharArray();
 // create new empty String:       
     String revString = "";       

//For loop to add char of Array to form the new reversed String:        
     for(int i = inputArr.length - 1; i >= 0; i--){
        revString += inputArr[i];    
        }
    return revString;    
    }
}