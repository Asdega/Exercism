public class PangramChecker {

    public boolean isPangram(String input) {
      
        input = input.toLowerCase();
        return (input.contains("a") && input.contains("b") && input.contains("c") && input.contains("d") && input.contains("e") && input.contains("f") && input.contains("g") && input.contains("h") && input.contains("i") && input.contains("j") && input.contains("k") && input.contains("l") && input.contains("m") && input.contains("n") && input.contains("o") && input.contains("p") && input.contains("q") && input.contains("r") && input.contains("s") && input.contains("t") && input.contains("u") && input.contains("v") && input.contains("w") && input.contains("x") && input.contains("y") && input.contains("z"));
    }

}
