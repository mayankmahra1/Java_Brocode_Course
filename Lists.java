import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        
        List<String> strs = new ArrayList<>(); 

        strs.add("Hello");
        strs.add("World");

        System.out.println(strs);
        System.out.println();


        String encoded = "";

        for(String str : strs){
            int length = str.length();
            encoded = encoded + "*" + length + "#" + str; 
        }
        System.out.println(encoded);
        System.out.println();



        List<String> answer = new ArrayList<>(); 

        for(int i = 0; i < encoded.length(); i++){
            if (encoded.charAt(i) == '*') {
                int j = i+1; 
                String lengthAsString = "";
                while(encoded.charAt(j) != '#'){
                    lengthAsString = lengthAsString + encoded.charAt(j);
                    j++;
                }
                int length = Integer.parseInt(lengthAsString);
                String word = "";
                for(int k = i + lengthAsString.length() + 2; k < i + lengthAsString.length() + 2 + length; k++){
                    word = word + encoded.charAt(k);
                }
                answer.add(word);
            }
        }

        System.out.println(answer);
        
    }
}