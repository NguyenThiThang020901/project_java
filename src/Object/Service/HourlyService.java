
package Object.Service;

public class HourlyService extends Service{
   private double price;
    public HourlyService(String name,double price) {
        super.name=name;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
      @Override
    public String toString() {
        return super.toString() + "price: "+price+"(VND/1 hour)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
