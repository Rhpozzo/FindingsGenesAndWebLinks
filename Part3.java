
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public Boolean twoOccurrences (String stringa, String stringb) { 
        
        //Write the method named twoOccurrences that has two String parameters named stringa and stringb. 
        //This method returns true if stringa appears at least twice in stringb, otherwise it returns false.
        //For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true as there are two 
        //occurrences of “by”, the call twoOccurrences(“a”, “banana”) 
        //returns true as there are three occurrences of “a” so “a” occurs at least twice, and the call 
        //twoOccurrences(“atg”, “ctgtatgta”) returns false as there is only one occurence of “atg”.
        
        //int variable to find the index of stringa in stringb
        int startStr = stringb.indexOf(stringa); 
        //int variable to look for the indexof string a more than twice or more times. 
        int endStr = stringb.indexOf(stringa, startStr + 2); 
        //if conditional to evaluate endStr variable. 
        if(endStr != -1){
            //if endStar is not -1 return true; 
            return true;
        }
        // else it will default to false; 
        return false; 
    }
    

    public void testing(){
        Boolean a = twoOccurrences("by", "a story by abby long");
        Boolean b = twoOccurrences("a", "ana banana"); 
        Boolean c = twoOccurrences ("atg", "ctgtatgta");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    public String lastPart(String stringa, String stringb){
     //Write the method named lastPart that has two String parameters named stringa and stringb. 
     //This method finds the first occurrence of stringa in stringb, and returns the part of stringb 
     //that follows stringa. If stringa does not occur in stringb, then return stringb. 
     //For example, the call lastPart(“an”, “banana”) returns the string “ana”, 
     //the part of the string after the first “an”. The call lastPart(“zoo”, “forest”) 
     //returns the string “forest” since “zoo” does not appear in that word.
     int startIndex = stringb.indexOf(stringa);
     int excludeIndex = stringa.length();
     String print = stringb.substring(startIndex + excludeIndex);
     if(startIndex == -1){
         print = stringb; 
        }
     return print; 
    }
    
    public void testLastPart(){
        String a = lastPart("an", "banana");
        System.out.println(a); 
        String b = lastPart("zoo", "Forest"); 
        System.out.println(b);
    }
}
