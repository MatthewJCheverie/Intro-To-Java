public class C4PP10
{
    public static void main(String[] args)
    {
      int thousands,hundreds=0,tens=0,ones=0;
      
      for (thousands=1; thousands<10; thousands++)
      for (hundreds=1; hundreds<10; hundreds++)
      for (tens=1; tens<10; tens++)
      for (ones=1; ones<10; ones++)
        
      if ((thousands!=hundreds) && (thousands!=tens) &&
            (thousands!=ones) && (hundreds!=tens) &&
            (hundreds!=ones) && (tens!=ones))
      if(thousands==3*tens) {
      if (ones%2!=0) {
      if ((thousands+hundreds+tens+ones)==27){
            
      System.out.println("The address of the riddlers next caper is " +thousands+hundreds+tens+ones + 
                         " Pennsylvania Avenue");
      }
      }
      }
    }
}

  
           
        
        
      
      
    