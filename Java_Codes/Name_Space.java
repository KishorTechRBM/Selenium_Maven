package Java_Codes;

public class Name_Space {
	 public static void main(String[] args) {

	String str = "IamKishoreKumar";
 /*   
    // Convert the string to a character array
    char[] charArray = str.toCharArray();
    
    // Iterate through the character array and print each character followed by a space
    for (char c : charArray) {
        System.out.print(c + " ");
 */       
        
        for(int i=0; i<= str.length(); i++) {
        	System.out.print(str.charAt(i)+ " ");
        	 
 /*       	if (i < str.length() - 1) {
                System.out.print(" ");
            }
 */
        }
        
        
    }
}


