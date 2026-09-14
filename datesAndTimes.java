import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datesAndTimes {

    public static void main(String[] args) {
        
        // How to work with dates and times using java
        // we can work with LocalDate, LocalTime, LocalDateTime, UTC timestamp

        // first lets get the date right now using localdate 
        // first we will create an object of local date which we will call date
        // import the Local date class 
        // when you create a LocalDate object set it equal to = access the LocalDate class and call the now function
        LocalDate date = LocalDate.now(); 

        // now if we output our date object 
        System.out.println(date);
        System.out.println();


        // now lets use localtime
        // create a localtime object then it equals the localtime class and access the now method 
        LocalTime time = LocalTime.now();

        // now output our time object 
        System.out.println(time);
        System.out.println();


        // to retrieve both the date and the time we can use LocalDateTime 
        // rememeber create a LocalDateTime object = acess the LocalDateTime class and call the now method
        LocalDateTime dateTime = LocalDateTime.now(); 

        // now output our dateTime object
        System.out.println(dateTime);
        System.out.println();


        // we can also use utc time, which is a little different 
        // we will create a Instant object called instant set it equals to access the Instant class and call the now method
        // UTC means universal time zone. its what everyone goes off its like a standard
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println();


        // when you output the current date and our time its kind of ugly so we can write a custom format to display our 
        // dateTime and heres how. 
        // custom format
        LocalDateTime dateTime2 = LocalDateTime.now(); 

        // then we will need to create a formatter object
        // so create a DateTimerFormatter object and set it = access the DateTimeFormatter class call the ofPattern
        // method and pass in a string
        // within the string we will write patterned letters
        // what is the pattern that we want our dateTime to appear 
        // Theres offical java documenetation with an extensive list
        // for date its two lowercase d's, then a - then for month its two capital M's then another - 
        // and for the year its 4 lowercase y's. 

        // then for time:
        // hours do two capital H's, then a colon:, minutes is two lowercase m's, than a colon:, then for seconds
        // is two lowercase s's. 
        // that is a good pattern

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
        // now we will create a new string newDateTime then set equals to 
        // our current date time which is dateTime2 which is an object. call the format method
        // and pass in our formatter
        String newDateTime = dateTime2.format(formatter); 

        // now we print our newDateTime and voila its looks great
        System.out.println(newDateTime);
        System.out.println();


        // instead of getting the time and date now we can create a custom date time object. 
        // start with a local date, create an object and set it equals to accessing the LocalDate class and call the of 
        // method
        // depending on the date you would like to create you would pass them in as arguments
        // lets do christmas of 2024
        // you can see the argument layout: year month and dayofMonth
        LocalDate date2 = LocalDate.of(2024, 12, 24); 
        System.out.println(date2);
        System.out.println();


        // we can also create a custom dateTime object 
        // lets do my birthday
        // and same process except add hours and minutes and seconds
        LocalDateTime dateTime3 = LocalDateTime.of(2003, 11, 24, 15, 27);
        System.out.println(dateTime3);
        System.out.println();


        // you can also compare dates too 
        // lets create a local datetime of my birthday and manishes and assume were born on the same time
        LocalDateTime dateTime4 = LocalDateTime.of(2001, 11, 04, 15, 27); 
        System.out.println(dateTime4);
        System.out.println();

        // to comapre them lets do the following 
        // dates have a built in isBefore method that you can call on a date object. 
        if (dateTime4.isBefore(dateTime3)) {
            System.out.println("Manish is older");
        }
        else if(dateTime4.isAfter(dateTime3)){
            System.out.println("Mayank is older");
        }
        else if(dateTime4.isEqual(dateTime3)){
            System.out.println("They are twins");
        }




    }

}