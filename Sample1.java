

public class Bus
{
   String numberPlate;
   String color;
   String route;
   String customerName;
   boolean availableStatus;
   int rate;
   
   public Bus(int i,String j)
   {
        rate=i;
        color=j;
        availableStatus=true;
    }
   public String getNumberPlate()
   {
       return numberPlate;
   }
   
   public String getColor()
   {
       return color;
   }
   
   public String getRoute()
   {
       return route;
   }
   
   public int getRate()
   {
       return rate;
   }
   
   public void bookBus(String numberPlate, String color,String route, String customerName)
   {
       if(availableStatus==true)
       {
           this.numberPlate=numberPlate;
           this.color=color;
           this.route=route;
           this.customerName=customerName;
           availableStatus=false;
       }
       else
       {
           System.out.println("Sorry You Cannot Book Bus Now !!!");
       }
   }
   
   public void displayDiscription()
   {
       
       System.out.println("Color of bus is" + color);
   }
   
}