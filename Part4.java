import java.util.Objects; 
import edu.duke.URLResource;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    
    public String webLinks(){
        //For each word, check to see if “youtube.com” is in it. If it is, find the double quote to the left and right of the occurrence 
        //of “youtube.com” to identify the beginning and end of the URL. 
        //Note, the double quotation mark is a special character in Java. 
        //To look for a double quote, look for (\”), since the backslash (\) character indicates we want the literal quotation marks (“) 
        //and not the Java character. The string you search for would be written “\”” for one double quotation mark.
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        
        String result = "\""; 
        
        for (String word : ur.words()) {
            word.toLowerCase(); 
            int startIndex = word.indexOf("\"");
            
            int lastIndex = word.lastIndexOf("\"", startIndex);
           
            int youtube = word.indexOf("youtube.com");
            
            int endIndex = word.length();
            
            if(word.contains("youtube.com")){
               result = word.substring(startIndex, endIndex);
               System.out.println(result);
            }
        }
        
        return result; 
    }
}
