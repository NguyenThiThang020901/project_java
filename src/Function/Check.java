
package Function;

import static Function.UserManager.createUser;
import static Function.UserManager.in;
import static StoreData.SampleData.us;

public class Check {
     public static boolean checkNumber(String s) {
        int kt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                kt = 1;
            }
        }
        return kt == 0;
    }
      public static boolean checkChar(String s) {
       int kt=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) == ' ') {
                kt=1;
            }
        }
        return kt !=0;

    }
    
 public static void checkEmptyData(){
         String key;
         int ktyes=0;
              if(us.isEmpty()){//Kiểm tra xem đã có user trong hệ thống chưa! Nếu chưa thì sẽ tạo mới
                System.out.println("No account in the system yet!\n" +
                                    "Do you want to create an account?");
                  key=in.nextLine();
                   while (ktyes == 0) {
                        ktyes=1;
                        if (key.equalsIgnoreCase("Y") || key.equalsIgnoreCase("YES")) {
                            createUser();
                            System.out.println("Note: You have successfully created an account!"
                                    + "\nGo back to login!");
                            break;
                        } else if (key.equalsIgnoreCase("N") || key.equalsIgnoreCase("No")) {
                            System.out.println("Please return to the main menu!");
                            break;
                        } else {
                            System.out.println("You entered incorrectly!\nNote: you are only allowed to enter yes or no.");
                            ktyes=0;
                        }
                    }
            }
     }

}
