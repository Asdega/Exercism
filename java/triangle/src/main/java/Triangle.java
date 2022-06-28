class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;    

    if ((this.side1 == 0) || (this.side2 == 0) || (this.side3 == 0)){
        throw new TriangleException();
    }

    if ((this.side1 + this.side2 < this.side3) || (this.side2 + this.side3 < this.side1) || (this.side1 + this.side3 < this.side2)){
        throw new TriangleException();
    }
    }

    boolean isEquilateral() {
        boolean equilateral = false;
        if ((this.side1 == this.side2) && (this.side2 == this.side3)){
            equilateral = true;
        }
        return equilateral;
    }

    boolean isIsosceles() {
        boolean isosceles = false;
       if((this.side1 == this.side2) || (this.side1 == this.side3) || (this.side2 == this.side3)){
           isosceles = true;
       }
        return isosceles;
    }

    boolean isScalene() {
        boolean scalene = false;
        if((this.side1 != this.side2) && (this.side2 != this.side3) && (this.side1 != this.side3)){
         scalene = true;
           
    }
 return scalene;
}
}
