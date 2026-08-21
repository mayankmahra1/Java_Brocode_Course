public class overloadedMethods2 {

    public static void main(String[] args) {
        // now lets go over another eg
        // lets pretend we are baking a pizza 
        // we'll create a method to bake a pizza but we have to pass in ingredients

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

        // essentially if we have two or methods with the same name then we will use the method where the parameters match
        // combined the name and parameters = siganture
        String pizza2 = bakePizza("flat bread", "mozzerela"); 
        System.out.println(pizza2);

        String pizza3 = bakePizza("flat bread", "Mozzerela", "pepperoni"); 
        System.out.println(pizza3);



    }

    // we'll declare a method so
    // static becasue we are going to be calling it from the main method and the main method is static
    // our parameters will be ingredients
    static String bakePizza(String bread){
        return bread + " pizza";
    }


    // lets create another method of bakePizza but this time we have a parameter of bread and a paramater of cheese
    static String bakePizza(String bread, String cheese){
        return cheese + " " +  bread + " pizza"; 
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }


}