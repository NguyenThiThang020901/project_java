/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object.Service;

/**
 *
 * @author Administrator
 */
public class Food extends Service{
       private double price;
    public Food(String name,double price) {
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
        return super.toString() + "price: "+price+" (VND/1 item)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
