class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int squareOfSum = ((input*(input+1))/2) * ((input*(input+1))/2);
     return squareOfSum;
        
        
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = (input*(input+1)*(2*input+1)) / 6;
       return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        int computeDifferenceOfSquares = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
         return computeDifferenceOfSquares;   
    }

}
