import static java.lang.Math.sqrt;
class Darts {
double x;//3
double y;
    
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double squareX = this.x * this.x;
        double squareY = this.y * this.y;
        double radius = sqrt(squareX + squareY);
        int score;
        if (radius <= 1){
            score = 10;
        } else if (radius <= 5){
            score = 5;
        }else if (radius <= 10){
            score = 1;
        }else{
            score = 0;
        }

        return score;


}
}
