public class Triangle extends Shape {
    // now for a triangle we need base and height 
    double base; 
    double height; 

    Triangle(double base, double height){
        this.base = base; 
        this.height = height; 
    }

    // dont forget this keyword
    @Override
    double area(){
        return (this.base * 0.5) * this.height; 
    }
    
}