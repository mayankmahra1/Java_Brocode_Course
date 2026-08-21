public class abstraction {

        // NOTE THE Shape, triangle, rectangle and circle JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // abstract is used to define abstract classes and methods
        // overall abstraction is the process of hiding implementation details and showing only the essential features
        // think of it as if im teaching someone to drive im not going to open up the hood of the car and explain everything
        // im instead going to tell the user that the gas pedal is to drive and the brake is to stop the car
        // we can make classes and methods abstract by using this abstract keyword. this provides a few benefits
        // Abstract classes cant be instaitiated directly 
        // abstract classes can also contain abstract methods (which must be implemented)
        // they can also contain concrete methods which are the opposite. these are real and physical methods you could say
        // concrete methods are inherited

        // thats a lot but we are going to be create an abstract class which cant be instatiated direclty meaning we cant
        // create any objects from this class


        // in this eg we are going to create some shape objects. shape is going to be the parent and we are going to have circle
        // triangle and rectangle classes as its children
        // our shape class is going to be abstract we cant create any shape objects 
        // the rest of the child classes are going to extend the shape class


        // lets attempt to create a shape object
        // we get an error shape is abstract it cannot be instiated
        // ie you cannot create a shape object
        // since shape is an abstract class we cannnot create any objects from this class
        // it adds a little bit of security to our programme 
        // we dont want anybody create any generic shape objects 
        // we want them to create a certain kind of shape like a cirlce triangle etc
//        Shape shape = new Shape();


        // but we can create some circles triangles and rectangles so lets do so
        // we can create these objects but not shape because its an abstract class 
        // thats good tho because we dont peopele creating any shape objects thats too generic
        // we want the user to pick a certain kind of shape 
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5); 
        Rectangle rectangle = new Rectangle(6,7);

        // as we said earlier abstract classes can contain  abstract methods and concrete methods
        // an abstract method is a method which must be implemented by its children 




        // if i take my circle object and call the display method and that applies for the other child classes
        // the concrete method of display was inherited from the shape class
        circle.dispaly();
        triangle.dispaly();
        rectangle.dispaly();
        System.out.println();


        // area is an abstract method which means the children classes have to define it 
        // once we have given our children classes attributes and we have provided a constructorr we have to 
        // go back up and pass them through as args when creating an object
        // heres the area of all our shapes
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


        // so thats it abstraction is the process of hiding implementation details and only showing essential features
        // thats we have created a shape object which is sbtarct. we cant directly create a shape object we want the user to 
        // create a certain kind of shape whether thats a circle or triangle or rect 
        // a shape is too generic
        
        // an abstract class can  contain abstract methods which need to implemented by the children classes
        // and concrete method which are inherited by children classes  
      



    }
}