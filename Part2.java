
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
       String result = "" ; 
       // look for ATG as start codon with indexOf this is an int because it's looking for the index where "ATG" starts. 
       int startIndex = dna.indexOf(startCodon);
       if(startIndex == -1){
           return " "; 
       }
       int stopIndex = dna.indexOf(stopCodon, startIndex + 3); 
       if(stopIndex == -1){
           return " ";
       }
       result = dna.substring(startIndex, stopIndex + 3);
       
       if(result.length() % 3 == 0 ){
            result = result; 
       }else return ""; 
       return result; 
    }
    
    public void testSimpeGene(){
        //Create 5 DNA Strings 
        
        //1. DNA with no “ATG”
        String noATG = "ASFASGTAA";
        System.out.print(findSimpleGene(noATG, "ATG", "TAA")); 
        
        //2. DNA with no “TAA”
        String noTAA = "ATGSFASTTGAS";
        System.out.print(findSimpleGene(noTAA, "ATG", "TAA")); 
        //3. DNA with no “ATG” or “TAA”
        String none = "TTAJJEEJJGAT";
        System.out.print(findSimpleGene(none, "ATG", "TAA")); 
        //4. The good test
        String goodDNA = "SADATGFJGTRETAA";
        System.out.print(findSimpleGene(goodDNA, "ATG", "TAA"));
        //5. The not * 3 test.
        
        String NoGood = "DASATGSDSDTAA"; 
        System.out.print(findSimpleGene(NoGood, "ATG", "TAA"));
        
        
    }
}
