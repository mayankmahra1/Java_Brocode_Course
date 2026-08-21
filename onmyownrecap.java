import java.util.Scanner;

public class onmyownrecap
{
    public static void main(String []args)
    {
        int x = 10; 
        System.out.print(x); // System is capital when printing 

        for(int i = 0; i<=5; i++) // how u delcare a for loop it doesnt have commas dk where i got that from 
            {
                System.out.println(i);
            }
        
        String name = new String("Mayank"); // how you declare a string 
        System.out.println(name);

        int[] array = {1,2,3}; // this is how you declare an array. First the data type followed by array icon or symbol then curly 
        // brades with data inside it 

        for(int i: array)
        {
            System.out.println(i);
        } 
        
        String[] array_two = {"Mayank", "Reshma", "Manish"}; // remeber string is in " "

        for(String i : array_two) // when using the shortcut operator when doing a for loop.
        {
            System.out.println(i); 
        }
        // because we are trying to loop directly through an array we have String i : arrayname because its an array of type String

        System.out.println(array_two.length);
        System.out.println(array_two[0]);
        System.out.println(array_two[1]);


        for(int i = 0; i<array_two.length; i++)
            {
                System.out.println(array_two[i]);
            }

    

        int age = 23; 

        if(age == 22) // remeber double equals when comparing
        {
            System.out.println("Same age as me");
        } else
        {
            System.out.println("Not the same age as me");
        }

        // if and else if has a condition
        // else does not have a condition 


        age = 1000000000; // how to override an already declared variable 
        if(age == 22)
            {
                System.out.println("Same age as me");
            }
        else if(age < 22)
            {
                System.out.println("Younger than me");
            }
        else if(age > 22)
            {
                System.out.println("Older than me");
            }
        else
            {
                System.out.println("Some ridiculous age that is not an int");
            }
            // vscode is good cuz it says if your var is out of a range
            
        int account_value = 0;
        int hours_avaliable = 100; 

        do{
            hours_avaliable = hours_avaliable - 10;
            account_value = account_value + 100; 


        }while(hours_avaliable >= 0);

        System.out.println(hours_avaliable);
        System.err.println(account_value);

        account_value = 0;
        hours_avaliable = 100; 

        while(hours_avaliable > 0) 
            {
                hours_avaliable = hours_avaliable - 10;
                account_value = account_value + 100; 
            }

            System.out.println(hours_avaliable);
            System.err.println(account_value);


            

        int[][] array_three = {
            {22, 24, 29, 52, 56},
            {19, 21, 26},
            {24, 26}
        };

        System.out.println(array_three[0]); // you index a 2d array by arrayname[][]
        // [][] row number you want to access and column number you want to access 


        System.out.println("BLOCK1");

        System.out.println(array_three[0][0]); // if just want to print a row of a 3d array


        System.out.println(array_three.length);

        for(int i = 0; i<array_three.length; i++) // how to traverse a 3d array 
            {
                for(int j = 0; j<array_three[i].length; j++)
                    {
                        System.out.println(array_three[i][j]);
                    }
            }

            Scanner sc = new Scanner(System.in);
            Scanner scc = new Scanner(System.in);


            int y = sc.nextInt(); // use round brackets when scanner class
            System.out.println(y);

            String brother = scc.nextLine();
            System.out.println(brother); 

            sc.close();
            scc.close();

            
            





            






        

        
        
        




    }
}