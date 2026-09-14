public class anonymousClasses {
        // NOTE THE Dog2, talkingDog classes are apart of this lesson.  

    public static void main(String[] args) {
        // An anonyumous class is a class that does not have a name, meaning it cannnot be reused. 
        // Its when you want to add custom behviour without having to create a new class,
        // Because it can be really inconveninet to create a new class just for one object, if that one object is different
        // from the rest in one way or another 
        // Theyre often used for one time uses when utilising features such as timertask, the runnable inteface or callbacks
        // Note these are more advanced java topics. 

        // lets demonstrate why anonymous classes would be useful with an eg where we create a dog clas

        // lets create a dog object and have it use its speak method
        Dog2 dog = new Dog2(); 
        dog.speak();
        System.out.println();

        // but what if theres a unique kind of dog. its different to the rest 
        // lets say scooby doo he doesnt speak dog he speaks english 
        // if i want scooby to speak something else than id have to override the speak method 
        
        // another option would be to create a new class.
        // Im doing this to show why anonymous classes are useful. 
        // lets create a talking dog class

        // now we can create a talking dog object 
        // see how we had to create a whole new class just for unique object. 
        // its a lot of work
        // our talkingDog is one unique exception
        // so rathern than create a whole new class there should be something better
        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();
        System.out.println();

        // Rather than create a whole new class for scooby doo lets create a anonymous classes
        // instead of creating a talking dog object, lets create a another Dog2 object but it has unique features
        // that set it apart from other dogs, such as the ability to speak english
        // now to create a anonymous class we are going to add a set of curly bracres and make sure a semi colon ofc
        // within the curly braces: you can define any unique features or override  any methods. 
        // the dog2 object is going to be different than all other dogs interms of its speak method, so lets 
        // override that method 
        // 
        Dog2 dog2 = new Dog2(){
            @Override 
            void speak(){
                System.out.println("Hey shaggy");
            }
        }; 

        dog2.speak();

        // see how instead of creating a entirely new class for one unique object, we can create a another Dog2 object and 
        // override the speak method using anonymous class 

    }
}