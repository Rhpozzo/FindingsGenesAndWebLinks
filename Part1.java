/**
 *  Write the method findSimpleGene that has one String parameter dna, 
 *  representing a string of DNA. This method does the following:
 *  Finds the index position of the start codon “ATG”. If there is no “ATG”, 
 *  return the empty string.
 *  Finds the index position of the first stop codon “TAA” appearing after the 
 *  “ATG” that was found.  If there is no such “TAA”, return the empty string.
 *  If the length of the substring between the “ATG” and “TAA” is a 
 *  multiple of 3, then return the substring that starts with that “ATG” 
 *  and ends with that “TAA”.
 *  
 *  4. Write the void method testSimpleGene that has no parameters. 
 *  You should create five DNA strings. 
 *  The strings should have specific test cases, 
 *  such as: DNA with no “ATG”, DNA with no “TAA”, 
 *  DNA with no “ATG” or “TAA”, DNA with ATG, TAA and the substring 
 *  between them is a multiple of 3 (a gene), and DNA with ATG, TAA 
 *  and the substring between them is not a multiple of 3. 
 *  For each DNA string you should:
 *      Print the DNA string.
 *      See if there is a gene by calling findSimpleGene with this string as the parameter. 
 *      If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.
 */

public class Part1 {
    
    public String findSimpleGene(String dna){
        
       String result = "" ; 
       // look for ATG as start codon with indexOf this is an int because it's looking for the index where "ATG" starts. 
       int startIndex = dna.indexOf("ATG");
       if(startIndex == -1){
           return " "; 
       }
       int stopIndex = dna.indexOf("TAA", startIndex + 3); 
       if(stopIndex == -1){
           return " ";
       }
       
       result = dna.substring(startIndex, stopIndex + 3);
       
       if(result.length() % 3 == 0 ){
           return result; 
       }else return ""; 
  
    }
    
    public void testSimpeGene(){
        //Create 5 DNA Strings 
        
        //1. DNA with no “ATG”
        String noATG = "ASFASGTAA";
        System.out.print(findSimpleGene(noATG)); 
        
        //2. DNA with no “TAA”
        String noTAA = "ATGSFASTTGAS";
        System.out.print(findSimpleGene(noTAA)); 
        //3. DNA with no “ATG” or “TAA”
        String none = "TTAJJEEJJGAT";
        System.out.print(findSimpleGene(none)); 
        //4. The good test
        String goodDNA = "SADATGFJGTRETAA";
        System.out.print(findSimpleGene(goodDNA));
        //5. The not * 3 test.
        
        String NoGood = "DASATGSDSDTAA"; 
        System.out.print(findSimpleGene(NoGood));
        
        
    }
}
