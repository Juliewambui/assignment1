package javaapplication23;

public class Main{
    public static void main(String[] args){
        rentalagency rentalagency=new rentalagency();
        
        Car car1=new Car("ABC134", "Mercedes Benz");
        Car car2=new Car("XYZ987","Honda Civic");
         
        Customer customer1=new customer("Julie wambui","D9876543");
        Customer customer2=new customer("Sasha namuli","D7894532");
        
        rentalagency.addcar(car1);
         rentalagency.addcar(car2);
          rentalagency.addcustomer(customer1);
         rentalagency.addcustomer(customer2);
         
         rentalagency.rentcar("ABC 134","D9876543");
         rentalagency.returncar("ABC 134");
        rentalagency.rentcar("XYZ 987","D7894532"); 
    }
}