import java.time.Localdate;

public class rentaltransactions
{
    private Car car;
    private Customer customer;
    private Localdate rentaldate;
    private Localdate returndate;
    
    public rentaltransaction(Car car,Customer customer,Localdate rentaldate)
    {
        this.car=car;
        this.customer=customer;
        this.rentaldate=rentaldate;
        this.returndate=null;
    }
    public Car getcar()
    {
        return car;
        public Customer getcustomer()
        {
            return customer;
        }
        public localdate getrentaldate()
        {
            return rentaldate;
        }
        public localdate getreturndate()
        {
            return returndate;
        }
        public void returncar()
        {
            this.returndate=localdate.now();
            car.return();
        }
        
    }
    
    
}