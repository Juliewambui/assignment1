public class car
{
    private final String licenseplate;
    private final String model;
    private boolean isrented;
    public car(String licenseplate,String model)
    {
     this.licenseplate=licenseplate;
     this.model=model;
     this.isrented=false;
    }
    public String getlicenseplate()
    {
        return licenseplate;
    }
    public String getmodel()
    {
        return model;
    }
    public boolean isrented()
    {
        return isrented;
    }
    public void rentcar()
    {
        if(!isrented){
            isrented=true;
        }
        else {
            System.out.println("car is already rented.");
        }
    }
}