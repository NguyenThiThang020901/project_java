
package StoreData;

import static Function.UserManager.*;
import Object.Service.Service;
import Object.UsingSv;
import Object.User;
import java.util.ArrayList;

public class SampleData {
    public static ArrayList <User> us = new ArrayList<>();//Mảng Lưu Trữ User
    public static ArrayList <Service> sv = new ArrayList<>();//Mảng lưu dịch vụ
    public static ArrayList <UsingSv> billUser = new ArrayList<>();//Mảng lưu hóa đơn
    
    public static void SampleData(){//Lưu trữ dữ liệu mẫu
       // User(int stt, String idName, String pw, String fullName,double balance,double amountUsed ) 
        us.add(new User ("Tuan","123456","Pham Anh Tuan","0123456789",100000,40000));
        us.add(new User ("Thang","123456","Nguyen Thi Thang","1234567890",10000,10000));
        us.add(new User ("Hello","123456","Hoai An","0123456789",100000,600000));
        us.add(new User ("Tester","123456","Pham Anh Khoi","0123456789",100000,100000));
       //Service(String name, double price)  // Dữ liệu mẫu dịch vụ
       sv.add(new Service("Normal room",5000));
       sv.add(new Service("Private room",7000));
       sv.add(new Service("Stream room",10000));
       sv.add(new Service("Room for 2 people",10000));
       //UsingSv(User user, Service sv, int sl) dữ liệu mẫu của hóa đơn dịch vụ
          
    }
   
    public static void main(String[] args) {
   
       SampleData();
//      createUser();
     
       UserLogin();
      
       
    }
    
}
