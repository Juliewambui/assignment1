import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class rentalagency{
    private list<car>cars;
    private list<customer>customers;
    private list<rentaltransactions>transactions;
    
    public rentalagency{
    cars=new arraylist<>();
    customers=new arraylist<>();
    transactions=new arraylist<>();
}
   public void addcar(car car){
     cars.add(car);
   }
   public void addcustomer(Customer customer)
           
   {
customers.add(customer);
   }
   public void rentcar(String licenseplate,String driverlicensenumber)
   {
       Car car=findcar(licenseplate);
       Customer customer=findcustomer(driverlicensenumber);
       if(car !=null && customer !=null && !car.isrented())
       {
           car.rentcar();
           transactions.add(new rentaltransactions(car,customer,localdate.now()));
           System.out.println("Car rented successfully.");
       }else{
           System.out.println("Car rental failed.");
       }
       }
   public void returncar(String licenseplate){
       Car car=findcar(licenseplate);
       if(car !=null && car.isrented()){
           for (rentaltransaction transaction:transactions){
               if
                       (transaction.getcar().equals(car) &&
                       transaction.getreturndate()==null){
                   transaction.returncar();
                   System.out.println("Car returned successfully.");
                   return;
               }
               }
           }else{
           System.out.println("Car return failed.");
           
       }
   }
   private car findcar(string licenseplate)
   {
       for(Car car:cars){
           if
    (car.getlicenseplate().equals(licenseplate))
           {
               return car;
           }
                 }
       return null;
   }
   private customer findcustomer(String driverlicensenumber){
       for(Customer  customer:customers)
       {
           if
    (customer.getdriverlicensenumber().equals(driverlicensenumber)){
               return customer;
           }
       }
       return null;
   }
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       }
}
}