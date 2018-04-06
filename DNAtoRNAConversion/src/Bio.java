/* Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

Create a function which translates a given DNA string into RNA.
*/
public class Bio{
    public static String dnaToRna(String dna){
        //Loop through string, replace with T
        char[] chars = dna.toCharArray();
        for(int i = 0, n = dna.length() ; i < n ; i++) { 
            char c = chars[i]; 
            if (chars[i]=='T') {
            	chars[i] = 'U';
            }
        }
        String string = String.valueOf(chars);
        return string;
    } 
    
    public static void main(String[] args){
      String str_dna = "GAAGCTTATCCGTTCCTGAAGGCTGTGGCATCCTCTAAATCAGACTTGGCTACGCCGTTAG";
      System.out.println(dnaToRna(str_dna));
    }
}