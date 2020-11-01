package Home;

import Function.AdminManager;
import static Function.UserManager.*;
import static StoreData.SampleData.SampleData;
import static View.viewAdmin.adminMenu;
import static View.viewUser.*;
import java.util.*;


public class Home {

    public static void main(String[] args) {
        String choice;
        Scanner in = new Scanner(System.in);
        boolean end = true;
        boolean exit = true;
        String check, CHECK;
        do {
            System.out.println("Log in as?\n"
                    + "#1: Administrator\n"
                    + "#2: User");
            System.out.println("If you want to exit the program select # 3!");
            System.out.print("Your Choice: ");
            choice = in.nextLine();
            SampleData();
            switch (choice) {
                case "#1":
                case "1":
                    //    System.out.println("+--------- Menu Login --------+");
                    //    System.out.println("#1: Login");
                    //    System.out.println("#2: Exit");
                    //    System.out.print("Your Choice: ");
//                      System.out.println("---Log in to the Administrator account--- ");
                    AdminManager admin = new AdminManager();
                    admin.LogInAdmin();
                    CHECK = adminMenu();
                    /*System.out.println("+--------- Menu Admin --------+");
                    System.out.println("#1: Change Password");
                    System.out.println("#2: Send a message to the user");
                    System.out.println("#3: Search for accounts sending the most money");
                    System.out.println("#4: Delete invalid accounts");
                    System.out.println("#5: Check transaction history");
                    System.out.println("#6: Exit");*/

                    switch (CHECK) {
                        case "1":
                        case "#1":
                            admin.changePassword();
                            break;
//                            case "2":
//                            case "#2":
//                                break;
//                                 case "3":
//                            case "#3":
//                                break;
                            case "4":
                           case "#4":
                               admin.RemoveAccount();
                               break;
//                            case "5":
//                            case "#5":
//                                break;
//                            case "6":
//                            case "#6":
//                                break;
//                            default :
//                             System.out.println("Notice: Incorrect syntax. Please re-enter!");
//                             break;
                               }
                            break;
                        case "#2":
                        case "2":
                            // System.out.println("+--------- Menu Login --------+");
                            //System.out.println("#1: Login");
                            // System.out.println("#2: Create Account");
                            //System.out.println("#3: Exit");

                            check = userChoice();
                            while (exit == true) {
                                switch (check) {
                                    case "1":
                                    case "#1":
                                        UserLogin();
                                        break;
                                    case "2":
                                    case "#2":
                                        createUser();
                                        break;
                                    case "3":
                                    case "#3":
                                        exit = false;
                                        break;
                                    default:
                                        System.out.println("Notice: Incorrect syntax. Please re-enter!");
                                        break;
                                }
                            }
                            break;
                            

                        case "#3":
                            System.out.println("You choose to exit the program! ");
                            end = false;
                            break;
                        default:
                            System.out.println("Notice: Incorrect syntax. Please re-enter!");
                            break;
                    }

            }
            while (end == true);
        }


    
    
    }


