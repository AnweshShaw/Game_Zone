package Computerproject;
import java.io.*;
public class stargame
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("                                             21 Star Game ");
        System.out.println("Instructions:-");System.out.println("There are a total of 21 stars in the game.At each turn,you have to pick a minimum of 1 star or maximum of 4 stars.");
        System.out.println("Simultaneously the computer picks stars using it's own thought process.");
        System.out.println("The one who has only one star left at the end loses the game.");
        System.out.println("I challenge you to beat the computer.");
        System.out.println("Let's see do you have the brain power to beat this smart computer.");
        System.out.println("Now,Let's begin the game.");System.out.println();
        for(int i=1;i<=21;i++)
            System.out.print((char)(9733));   
        System.out.println("      ");    
        System.out.println("Enter the number of stars you want to choose.");
        int a=Integer.parseInt(in.readLine());
        int tot=21;
        int b=tot-a;
        System.out.print("\f");
        System.out.println("The remaining number of stars is="+b);
        for(int i=1;i<=b;i++)
            System.out.print((char)(9733));
        int c=5-a;
        int com1=b-c;
        System.out.println("      "); 
        System.out.println("The Computer picks " +c+ " stars");
        System.out.println("The remaining number of stars is="+com1);
        for(int i=1;i<=com1;i++)
            System.out.print((char)(9733));  
        System.out.println("      ");     
        System.out.println("Enter the number of stars you want to choose. ");
        int d=Integer.parseInt(in.readLine());
        int e=com1-d;
        System.out.print("\f");
        System.out.println("The remaining number of stars is="+e);
        for(int i=1;i<=e;i++)
            System.out.print((char)(9733));  
        System.out.println("      ");
        if(e==15||e==14||e==13||e==12)
        {
            int p=e-11;
            System.out.println("The Computer picks "+p+" stars");
            int com2=e-p;
            System.out.println("The remaining number of stars is="+com2);
            for(int i=1;i<=com2;i++)
                System.out.print((char)(9733)); 
            System.out.println("      ");     
            System.out.println("Enter the number of stars you want to choose.");
            int f=Integer.parseInt(in.readLine());
            int g=com2-f;
            if(g==10||g==9||g==8||g==7)
            {
                int n=g-6;
                int com4=g-n;
                System.out.print("\f");
                System.out.println("The remaining number of stars is="+g);
                for(int i=1;i<=g;i++)
                    System.out.print((char)(9733));    
                System.out.println("      ");     
                System.out.println("The Computer picks "+n+" stars");
                System.out.println("The remaining number of stars is="+com4);
                for(int i=1;i<=com4;i++)
                    System.out.print((char)(9733));   
                System.out.println("      ");     
                System.out.println("Enter the number of stars you want to choose.");
                int h=Integer.parseInt(in.readLine());
                int i=com4-h;
                System.out.print("\f");
                System.out.println("The remaining number of stars is="+i);
                for(int q=1;q<=i;q++)
                    System.out.print((char)(9733));   
                int s=i-1;
                int comp5=i-s;
                System.out.println("      "); 
                System.out.println("The Computer picks "+s+" stars");
                System.out.println("The remaining number of stars is="+comp5);
                System.out.print((char)(9733));
                System.out.println("      ");System.out.println();
                if(comp5==1)
                    System.out.println("Nice Try,but Computer has won the game.");
            }   
            if(g>10)
            {
                int x=g-11;
                int y=g-x;
                System.out.println("The Computer picks "+x+" stars");
                System.out.println("The remaining number of stars is="+y);
                for(int i=1;i<=y;i++)
                    System.out.print((char)(9733)); 
                System.out.println("      ");     
                System.out.println("Enter the number of stars ");
                int z=Integer.parseInt(in.readLine());
                int w=y-z;
                if(w==10||w==9||w==8||w==7)
                {
                    int n=w-6;
                    int com4=w-n;
                    System.out.print("\f");
                    System.out.print("The remaining number of stars is="+w);
                    for(int i=1;i<=w;i++)
                        System.out.print((char)(9733));   
                    System.out.println("      ");     
                    System.out.println("The Computer picks "+n+" stars");
                    System.out.println("The remaining number of stars is="+com4);
                    for(int i=1;i<=com4;i++)
                        System.out.print((char)(9733));   
                    System.out.println("      ");     
                    System.out.println("Enter the number of stars ");
                    int h=Integer.parseInt(in.readLine());
                    int i=com4-h;
                    System.out.print("\f");
                    System.out.println("The remaining number of stars is="+i);
                    for(int q=1;q<=i;q++)
                        System.out.print((char)(9733));    
                    int s=i-1;
                    int comp5=i-s;
                    System.out.println("      "); 
                    System.out.println("The Computer picks "+s+" stars");
                    System.out.println("The remaining number of stars is="+comp5);
                    System.out.print((char)(9733));
                    System.out.println("      ");System.out.println(); 
                    if(comp5==1)
                        System.out.println("Nice Try,but Computer has won the game.");
                }
            }
        }
    }
}