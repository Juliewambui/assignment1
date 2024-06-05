public class customer
{
    private final String name;
    private final String driverlicensenumber;
    
    public customer(String name,String driverlicensenumber)
    {
        this.name=name;
        this.driverlicensenumber=driverlicensenumber;
    }
    public String getname()
    {
        return name;
    }
    public String getdriverlicensenumber()
    {
        return driverlicensenumber;
    }
}