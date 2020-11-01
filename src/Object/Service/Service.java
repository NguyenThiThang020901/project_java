
package Object.Service;

public class Service {
   public static int slService=0;
   private int id=0;
    protected String name;
    public Service() {
        slService++;
        this.id=slService;
    }

    public Service(String name, double price) {
        slService++;
        this.id=slService;
        this.name = name;
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID Service: "+id+"\n\t\tName: "+name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
