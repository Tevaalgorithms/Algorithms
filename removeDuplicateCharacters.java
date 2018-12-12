public class removeDuplicateCharacters
{    
    /* Function removes duplicate characters from the string 
    This function work in-place */
    public static String removeDuplicates(String str) 
    { 
        LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
        for(int i=0;i<str.length();i++) 
            lhs.add(str.charAt(i)); 
        
         StringBuffer sb = new StringBuffer();
         
        // print string after deleting duplicate elements 
        for(Character ch : lhs) 
           sb.append(Character.toString(ch)); 
        
        return sb.toString();
        
    } 
	// Driver method 
	public static void main(String[] args) 
	{ 
		String str1 = "abcddeff"; 
                String s = removeDuplicates(str1);
                System.out.println(s);
	} 
    
}
