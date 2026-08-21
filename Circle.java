public class Circle extends Shape {
    // error says circle must be declared abstract or implement the abstarct method of area that  is in shape
    // circle inherits this abstract method of area from its parent shape 
    // we need to implement this method so lets do so 
    
    // this is going to be an overridden method so lets have the annotation of Override
    // we need to define a method of area and do the same for the other child classes

    // to calculate the area of a circle we need a radius lets define it is a attribute
    double radius; 

    // therefore we'll need a circle constructor
    Circle(double radius){
        this.radius = radius; 
    }


    // now the formula for the radius of a circle will be
    // dont forget this keyword 
    @Override
    double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }


    
}