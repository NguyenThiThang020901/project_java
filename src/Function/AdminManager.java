package Function;
import Object.User;
import static StoreData.SampleData.us;
import static View.viewAdmin.adminMenu;
import java.util.Scanner;

public class AdminManager {
    public static String MK = "123456"; 
    public final static String TK = "Admin";
   static Scanner input = new Scanner(System.in);
    public static boolean Check(String pw) {
        if (pw.equals(MK) == true) {
            return true;
        }
        return false;
    }

    public void LogInAdmin() {
        String Pw;
        do {
            System.out.println("Enter The password: ");
            Pw = input.next();
        } while (Check(Pw) == false);

        System.out.println("Logged in successfully!");
      
        String n=adminMenu();
    }

    public void changePassword() {
        String oldPassword, newPassword = null, npw;
        do {
            System.out.println("Enter the old password: ");
            oldPassword = input.next();
        } while (Check(oldPassword) == false);
        System.out.println("Enter the new password: ");
        newPassword = input.next();
        do {
            System.out.println("Enter a new password:");
            npw = input.next();
        } while (npw.equals(newPassword) == false);
        MK = newPassword;
        System.out.println("You have successfully changed your password!!");
    }
    public void RemoveAccount(){
      String accountDelete;
       System.out.print("Enter the account you need to delete ");
            accountDelete = input.next(); 
    
       int check = Remove(accountDelete);
        if (check== 1){
         System.out.print("You have successfully delete account !!\n"
                         + "#1: if you want to continue deleting account\n"
                         + "#2: Check the remaining accounts after deletion");
                 String choice=input.next();
                 switch(choice){
                     case "#1": 
                            System.out.print("Enter the account you need to delete: ");
                            accountDelete = input.next();
                             Remove(accountDelete);
                             break;
                     case "#2": 
                             for(int i= 0; i<us.size();i++){
                            // ♥♥♥♥♥♥ 
                                 }
                             break;
      
                 }
        }
        else 
            System.out.print("Re-enter the name of the account you want to delete: ");
            accountDelete = input.next(); 
            Remove(accountDelete);
    }
    public int Remove(String name){
        
    int n = 0;
    for (int i = 0; i < us.size(); i++) {
                if (name.equalsIgnoreCase(us.get(i).getIdName())) {
                 us.remove(i); 
                 
                n=1;
                break;
               
               }
               
            else
            System.out.printf("The account you entered does not exist");
        n=0;
       
    }
    return n;
    }
}
 /*public static void main(String[] args) {
        Admin ad = new Admin();
        ad.LogInAdmin();
        ad.changePassword();
    }*/

