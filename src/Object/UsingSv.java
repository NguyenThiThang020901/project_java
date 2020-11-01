package Object;
import Object.Service.Service;
import Interface.Constant;
import Object.Service.*;
public class UsingSv implements Constant{
    public static int slServiceUsed=0;
   private int id=0;
    User user;
    Service service ;
    private double bill = 0.0;
    private long sl =1;
    public UsingSv(User user, Food f, int sl) {// Đồ ăn
        slServiceUsed++;
        this.id=slServiceUsed;
        this.user = user;
        this.service = f;
        if (sl > 0) {
            this.sl = sl;
        } else {
            this.sl = 1;
        }
               this.bill=f.getPrice() * sl;
                user.deposit(-bill);
                user.setAmountUsed(bill);
            }
       public UsingSv(User user, HourlyService h, int sl) {// Dịch vụ theo giờ
        slServiceUsed++;
        this.id=slServiceUsed;
        this.user = user;
        this.service = h;

        if (sl > 0) {
            this.sl = sl;
        } else {
            this.sl = 1;
        }
        bill = h.getPrice() * sl;
               this.bill= billKM(bill, user);//bill sau khi giảm giá
                user.deposit(-bill);
                user.setAmountUsed(bill);
            }
       public UsingSv(User user,Service sv, long amount) {//Dịch Vụ nạp tiền
        slServiceUsed++;
        this.id=slServiceUsed;
        this.user = user;
        this.service=sv;
        if(amount>0)
        user.deposit(amount);
        else user.deposit(0);
            }

// Hóa Đơn + Khuyến mãi
    public static double billKM(double bill, User use){
            if(use.getLevel().equals(LV_1))
               return bill;
           else if(use.getLevel().equals(LV_2))
               return bill - (0.05*bill);
           else if(use.getLevel().equals(LV_3))
               return bill - (0.1*bill);
           else if(use.getLevel().equals(LV_4))
               return bill - (0.15*bill); 
           else return bill;
      
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill,User user) {
        bill=billKM(bill,user);
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "\nCustomer: "+user.getFullName()+"("+user.getIdName()+")"+
                "\n -Level: "+ user.getLevel()+
                "\n -Trading code:"+id+
                "\n -Note: Used the service: "+ this.service.getName()+"| Quantity: " +sl+
                "\n -With bill is: "+bill+"VND "+
                "\n  -5% price for Silver customers when using hourly service\n"
                + "  -10% price for silver customers when using hourly service\n"
                + "  -15% price for silver customers when using hourly service";
                 //To change body of generated methods, choose Tools | Templates.
    }

  
    
    

 

}
