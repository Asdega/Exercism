class MicroBlog {
    public String truncate(String input) {
        int n = 0;
        for (int i = 0; i < input.length(); ) {
            int codePoint = input.codePointAt(i);
            i += Character.charCount(codePoint);
            n++;
            if (n==5) {
                input = input.substring(0, i);
            }
        }

        return input;
        // String newString = "";
        // if (input.length()<5){
        //     newString = input;
        // }else{
        //  newString = input.substring(0, 5);   
        // }
        // return newString;
    
    }
}
