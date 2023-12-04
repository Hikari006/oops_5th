import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        
  
        String s = "";  

        for (int i = s1.length() - 1; i >= 0; i--) {
            s += s1.charAt(i);  
        }
            

        if (s.equals(s1)) {
            System.out.println("Palindrome");
        } 
        else {
            System.out.println("Not Palindrome");
        }
    
}
}
