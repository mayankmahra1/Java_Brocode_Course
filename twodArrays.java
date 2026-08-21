public class twodArrays {

    public static void main(String[] args) {
        // 2d arrays = is an array where each element is an array 
        // useful for storing a matrix of data 

        // these 3 arrays are all seperate one dimensional arrays 
        // like each a seperate packet of chewits 

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef"};


        // we can make an array made of arrays where each element is an array 
        String[][] groceries = {fruits, vegetables, meats}; 
        

        // we get a bunch of memory addresses because arrary are a reference data type 
        for(String[] foods : groceries){
            System.out.println(foods);
        }

        System.out.println();


        // we need to use a nested for loop 
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");

            }
            System.out.println();
        }

        System.out.println();

        String[][] cars = {
            {"Nissan", "Toyota", "Kia"},
            {"Volkswagen", "Audi", "Mercedes"},
            {"Ferrari", "Lamborghini", "Mclaren"}
        };


        for(String[] levels : cars){
            for(String brand : levels){
                System.out.print(brand + " ");
            }
            System.out.println();
        }


        // if we want to access or replace an element we need to sqaure brackets with 2 indices
        // replace Nissan with tata 
        // replace Mclaren with Bugatti
        cars[0][0] = "Tata";  // row 0 col 0 
        cars[2][2] = "Bugatti";

        System.out.println();

        for(String[] levels : cars){
            for(String brand : levels){
                System.out.print(brand + " ");
            }
            System.out.println();
        }

        System.out.println();

        // create a 2d array which represents a telephone number pad 
        // 2d array of chars chars so single quotes
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){ // each row is an array of chars. so thats the outer for loop 
            for(char symbol : row){
                System.out.print(symbol + " ");
                
            }
            System.out.println();

        }

        




                            






    }
}