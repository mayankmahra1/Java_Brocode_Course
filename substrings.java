public class substrings {

    public static void main(String[] args) {
        
        // .substring() is a mthd used to extract a portion of a string 
        // strings have a built in method called substring where you can list one or two indexs and this mthd will create a string
        // based on the positioning of the indices  
        // stringname.substring(start,end)
        // first index is inclusive second is exclusive 

        String email = "mayankmahra1@gmail.com"; 
        String dadEmail = "gobind.mahra@gmail.com";
        String partOfEmail = email.substring(0,6);


        // both give same if you want every letter/symbol or char or whatever including and after a certain index all u need 
        // is the starting index
        String domain = email.substring(13);
        String domain1 = email.substring(13, 22);


        // for dads email if i want the domain id have to manually change the indexs 
        // instead i can combine 2 string mthds
        String dadDomain = dadEmail.substring(dadEmail.indexOf("@") + 1);



        System.out.println(partOfEmail);
        System.out.println(domain);
        System.out.println(domain1);
        System.out.println(dadDomain);




    }
}