public class Rectangle extends Shape {
    // for rectangle we need the length and widht
    double length; 
    double width; 

    Rectangle(double length, double width){
        this.length = length; 
        this.width = width;
    }

    @Override
    double area(){
        return this.length * this.width; 
    }

    
}