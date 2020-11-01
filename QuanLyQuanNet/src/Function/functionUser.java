package Function;

public class functionUser {
	
	    public static int slUser = 0;
	    
	 
	      
	    public static void homeOfUser() {
	        System.out.println("+----------- HOME (User) -------------+");
	        System.out.println("Program #1: Create new account");
	        System.out.println("Program #2: Login");
	        System.out.println("Program #3: Exit");
	    }
	     public static User CreateAcount() {
	        
	        // Tạo account
	         User u = new User();
	        Scanner input = new Scanner(System.in);
	        //Lựa chọn người dùng trong home(user)
	        String tk, mk, mk2;
	        String fullName;
	        String phone;
	        int kttk=1;
	        System.out.println("--+ You are using a user account creation program +--");
	        
	      
	         
	        u.setId(slUser);
	        System.out.print("Your id: "+slUser+"\nNote: Please remember this id to login next time!\n"); 
	        while(1==kttk){
	            kttk=0;
	            System.out.println("User Name (You will use this username for the next login): ");
	            tk=input.next();
	            input.nextLine();
	            if(tk.equals(checkUserName(tk))){
	            kttk=1;
	                System.out.println("This user name already exists!\n-Please re-enter ");
	            }
	        }
	        while (true) {
	            do {
	                System.out.print("Your password (note: Password > 6 character): ");
	                mk = input.next();
	            } while (mk.length() < 6);

	            System.out.print("Confirm password: ");
	            mk2 = input.next();

	            if (mk.equals(mk2)) {
	                break;
	            } else {
	                System.out.println("Invalid password confirmation!\n"
	                        + "Please re-enter your password");
	            }

	        }
	        u.setPassword(mk);
	        input.nextLine();
	        while (true) {
	            System.out.print("Your Full Name: ");
	            fullName = input.nextLine();
	            if (checkName(fullName)) {
	                break;
	            } else {
	                System.out.println("Invalid name!\n"
	                        + "Note: names cannot contain special characters.");
	            }
	        }
	        u.setName(fullName);
	        while (true) {
	            System.out.print("Your Phone Number: ");
	            phone = input.nextLine();
	            if (phone.length() == 10) {
	                if (checkPhone(phone)) {
	                    break;
	                } else {
	                    System.out.println("Invalid phone number!\n"
	                            + "Note: Telephone numbers are digits and have length = 10.");
	                }
	            } else {
	                System.out.println("Invalid phone number!\n"
	                        + "Note: Telephone numbers have length = 10.");
	            }

	        }
	        u.setPhone(phone);
	        slUser++;
	        return u;
	    }

}
