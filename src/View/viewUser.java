package View;

import java.util.Scanner;

public class viewUser {

    public static Scanner in = new Scanner(System.in);

    public static String userChoice() {
        String c;
        System.out.println("+--------- Menu Login --------+");
        System.out.println("#1: Login");
        System.out.println("#2: Create Account");
        System.out.println("#3: Exit");
        System.out.print("Your Choice: ");
        c = in.nextLine();
        return c;

    }

    public static String userMenu() {
        String c;
        System.out.println("+--------- Menu User --------+");
        System.out.println("#1: Check account information");
        System.out.println("#2: Using Service");
        System.out.println("#3: Change Password");
        System.out.println("#4: Notification");
        System.out.println("#5: Check transaction history");
        System.out.println("#6: Exit");
        System.out.print("Your Choice: ");
        c = in.nextLine();
        return c;
    }
}
