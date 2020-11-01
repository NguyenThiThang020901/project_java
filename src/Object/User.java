
package Object;

import Interface.Constant;
public class User  implements Constant{
   public static int sttUser=0;
   private int stt=0;
   private String phone;
   private String password;
   private String idName;
   private String fullName;
   private double balance=0;
   private double amountUsed=0;
   private String level;
   public User() {
       sttUser++;
       this.stt=sttUser;
    }
  public User(String idName, String pw, String fullName,String phone) {
        sttUser++;
        this.stt=sttUser;
        this.idName=idName.toLowerCase();
        password=pw;
        this.fullName=fullName; 
        this.phone=phone;
    }
  public User(String idName, String pw, String fullName,String phone,double balance,double amountUsed) {
        sttUser++;
        this.stt=sttUser;
        this.idName=idName.toLowerCase();
        this.password=pw;
        this.fullName=fullName;
        this.phone=phone;
        this.amountUsed=amountUsed;
        this.balance=balance;
         if (this.amountUsed < 50000) {
            this.level = LV_1;
        } else if (this.amountUsed > 50000 && this.amountUsed < 150000) {
            this.level = LV_2;
        } else if (this.amountUsed > 150000 && this.amountUsed < 500000) {
            this.level = LV_3;
        } else if (this.amountUsed > 500000) {
            this.level = LV_4;
        }
    }
  
  public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  

    public String getFullName() {
        return fullName;
    }
  
  public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
  
  public void setBalance(double balance) {
        this.balance=balance;
    } 
  public void deposit(double amount) {
        this.balance+=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setAmountUsed(double amountUsed) {
        this.amountUsed += amountUsed;
    }

    public double getAmountUsed() {
        return amountUsed;
    }

       public void setLevel() {
        if (this.amountUsed < 50000) {
            this.level = LV_1;
        } else if (this.amountUsed > 50000 && this.amountUsed < 150000) {
            this.level = LV_2;
        } else if (this.amountUsed > 150000 && this.amountUsed < 500000) {
            this.level = LV_3;
        } else if (this.amountUsed > 500000) {
            this.level = LV_4;
        }
    }

    public String getLevel() {
        return level;

    }
   @Override
   public String toString(){
return "IdName["+getIdName()+"fullName["+getFullName()+"]";
}


    
}
