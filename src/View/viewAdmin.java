
package View;
import java.util.*;
public class viewAdmin {
   static Scanner in = new Scanner(System.in);
public static String adminLogin(){
    String c;
    System.out.println("+--------- Menu Login --------+");
    System.out.println("#1: Login");
    System.out.println("#2: Exit");
    System.out.print("Your Choice: ");
    c=in.nextLine();
    return c; 
} 
public static String adminMenu(){
    String c;
    System.out.println("+--------- Menu Admin --------+");
    System.out.println("#1: Change Password");
    System.out.println("#2: Send a message to the user");
    System.out.println("#3: Search for accounts sending the most money");
    System.out.println("#4: Delete invalid accounts");
    System.out.println("#5: Check transaction history");
    System.out.println("#6: Exit");
    System.out.print("Your Choice: ");
    c=in.nextLine();
    return c; 
} 
}





