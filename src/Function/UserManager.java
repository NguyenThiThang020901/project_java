package Function;

import static Function.Check.*;
import Object.User;
import static StoreData.SampleData.*;
import static View.viewUser.*;
import java.util.*;

public class UserManager {

    public static Scanner in = new Scanner(System.in);
    
    public static void UserLogin() {//Đăng nhập
        String tk;
        String mk;
        String newAccount;
        int kt, vt = 0, ktyes = 0;
        System.out.println("--+ You are using <ACCOUNT LOGIN> program +--");
        do {
            kt=0;
            System.out.print("User Name: ");
            tk = in.next();
            in.nextLine();
            for (int i = 0; i < us.size(); i++) {
                if (tk.equalsIgnoreCase(us.get(i).getIdName())) {
                    vt = i;
                    kt = 1;
                } 
            }
            if (kt==0) {
                    System.out.println("This Account Does Not Exist Now!");
                    System.out.println("Do You Want To Create A New Account? (Y)es/(N)o");
                    newAccount = in.next();
                    in.nextLine();
                    while (ktyes == 0) {
                        ktyes=1;
                        if (newAccount.equalsIgnoreCase("Y") || newAccount.equalsIgnoreCase("YES")) {
                            createUser();
                            System.out.println("Note: You have successfully created an account!"
                                    + "\nGo back to login!");
                            break;
                        } else if (newAccount.equalsIgnoreCase("N") || newAccount.equalsIgnoreCase("No")) {
                            break;
                        } else {
                            System.out.println("You entered incorrectly!\nNote: you are only allowed to enter yes or no.");
                            ktyes=0;
                        }
                    }
                }
        } while (kt == 0);
        do {
            kt = 0;
            System.out.print("Password: ");
            mk = in.next();
            in.nextLine();
            if (mk.equals(us.get(vt).getPassword())) {
                System.out.println("Logged in successfully!");
                kt = 1;
            } else {
                System.out.println("Incorrect password!");

            }
        } while (kt == 0);
////        String c;
////        System.out.println("+--------- Menu User --------+");
////        System.out.println("#1: Check account information");
////        System.out.println("#2: Using Service");
////        System.out.println("#3: Change Password");
////        System.out.println("#4: Notification");
////        System.out.println("#5: Check transaction history");
////        System.out.println("#6: Exit");
////        c = in.nextLine();
        boolean end=true;
        String check;
            do { 
                check=userMenu();
                
                   switch (check) {
                            case "1":
                            case "#1":
                                System.out.println("+---------------------------------------------+");
                                System.out.println("Program #1: Check account information"); 
                                System.out.println("ID name: "+us.get(vt).getIdName());
                                System.out.println("Password: "+us.get(vt).getPassword());
                                System.out.println("Balance: "+us.get(vt).getBalance()+" VND");
                                System.out.println("Full name: "+us.get(vt).getFullName());
                                System.out.println("Phone Number: "+us.get(vt).getPhone());
                                System.out.println("Amount Used: "+us.get(vt).getAmountUsed());
                                System.out.println("Level: "+us.get(vt).getLevel());
                                System.out.println("+---------------------------------------------+");
                                System.out.println("Press any key + Enter to continue!");
                                if(in.next().charAt(0)!= '!')
                                break;
                                
                            case "2":
                            case "#2":
                                
                                break;
                            default :
                             System.out.println("Notice: Incorrect syntax. Please re-enter!");
                             break;
                        }
            
        } while (end==true);
    }

    public static void createUser() {// Tạo Tài Khoản
        User u = new User();
        String tk=null, mk, mk2;
        String fullName;
        String phone;
        int kttk = 1;
        System.out.println("--+ You are using a user account creation program +--");
        while (kttk == 1) {
            kttk = 0;
            System.out.println("User Name (You will use this username for the next login): ");
            tk = in.next().toLowerCase();
            in.nextLine();
            for (int i = 0; i < us.size(); i++) {
                if (tk.equalsIgnoreCase(us.get(i).getIdName())) {
                    kttk = 1;
                    System.out.println("Account name already exists, please choose another name! ");
                }

            }
        }
        u.setIdName(tk);
        while (true) {
            do {
                System.out.print("Your password (note: Password > 6 characters): ");
                mk = in.next();
                in.nextLine();
            } while (mk.length() < 6);

            System.out.print("Confirm password: ");
            mk2 = in.next();

            if (mk.equals(mk2)) {
                break;
            } else {
                System.out.println("Invalid password confirmation!\n"
                        + "Please re-enter your password");
            }

        }
        u.setPassword(mk);
        in.nextLine();
        do {
            System.out.print("Your Full Name: ");
            fullName = in.nextLine();

            if (!checkChar(fullName)) {
                System.out.println("Invalid name!\n"
                        + "Note: names cannot contain special characters.");
            }
        } while (!checkChar(fullName));

        u.setFullName(fullName);
        while (true) {
            System.out.print("Your Phone Number: ");
            phone = in.nextLine();
            if (phone.length() == 10) {
                if (checkNumber(phone)) {
                    break;
                } else {
                    System.out.println("Invalid phone number!\n"
                            + "Note: Telephone numbers are digits");
                }
            } else {
                System.out.println("Invalid phone number!\n"
                        + "Note: Telephone numbers have length = 10.");
            }

        }
        u.setPhone(phone);
        System.out.println("Note: You have successfully created an account!");
        System.out.println("Do you want to top up this account?");
        us.add(u);
    }
// Nạp Tiền
    

}
