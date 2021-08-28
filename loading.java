package Computerproject;
public class loading extends Thread
{
    public static void main()
    {
        int x=1;
        for(int i=1;i<=100;i++)
        {
            System.out.print("\f");
            System.out.println();System.out.println();System.out.println();System.out.println();
            System.out.println();System.out.println();System.out.println();System.out.println();            
            System.out.println("                                           "+(char)(8226)+"  "+(char)(9702)
                +"  "+(char)(8226));
            System.out.println("                                         "+(char)(9702)
                +"         "+(char)(9702));
            System.out.println("                                         "+(char)(8226)
                +"   "+x+"%"+"   "+(char)(8226));
            System.out.println("                                         "+(char)(9702)
                +"         "+(char)(9702));
            System.out.println("                                           "+(char)(8226)+"  "+(char)(9702)
                +"  "+(char)(8226));
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);} 
            x++;
        }
    }
}