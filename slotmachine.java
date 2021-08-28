package Computerproject;
import java.util.Scanner;
public class slotmachine extends Thread
{
    static String az="";
    public static void main()
    {
        int a=1,b=1,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("                                             Slot Machine");
        System.out.println("Instructions:-");
        System.out.println("If 3 numbers at the end of 3 separate series are same,you will win the game.");
        System.out.println("If 2 numbers at the end of 3 separate series are same,you will make a draw.");
        System.out.println("If no numbers at the end of 3 separate series are same,you will lose the game.");
        System.out.println();
        System.out.println("Press 'E'or'e' to start the game and test your luck.");
        String user=sc.nextLine();System.out.print("\f");
        if(user.equalsIgnoreCase("E"))
        {
            int i=(int)(Math.random()*10)+12;
            int x=(int)(Math.random()*4)+2;
            int y=(int)(Math.random()*4)+2;
            int z=(int)(Math.random()*4)+2;
            int ans=i/x;
            int ans2=i/y;
            int ans3=i/z;
            System.out.println("1st series:-");
            while(ans<10)
            {
                if(ans==9)
                {
                    System.out.print("   "+a++);
                    System.out.println((char)(9754));
                }
                else
                {
                    System.out.println("   "+a++);
                    try{
                        Thread.sleep(400);}
                    catch(InterruptedException e){
                        System.out.println(e);}
                }
                ans++;
            }
            System.out.println("2nd series:-");
            while(ans2<10)
            {
                if(ans2==9)
                {
                    System.out.print("   "+b++);
                    System.out.println((char)(9754));
                }
                else
                {
                    System.out.println("   "+b++);
                    try{
                        Thread.sleep(400);}
                    catch(InterruptedException e){
                        System.out.println(e);}	
                }
                ans2++;
            }
            System.out.println("3rd series:-");
            while(ans3<10)
            {
                if(ans3==9)
                {
                    System.out.print("   "+c++);
                    System.out.println((char)(9754));
                }
                else
                {
                    System.out.println("   "+c++);
                    try{
                        Thread.sleep(400);}
                    catch(InterruptedException e){
                        System.out.println(e);}
                }
                ans3++;
            }
            a--;b--;c--;
            System.out.println();
            System.out.println("The combination is "+a+" "+b+" "+c+".");
            System.out.println();
            if(a==b&&a==c)
            {
                az="Congratulations";
                System.out.println("Congratulations!!! You have won the this game.");
            }
            else if(a==b||b==c||a==c)
            {
                az="Nice try";
                System.out.println("Nice try,You have made a draw.");
            }
            else
            {
                az="Hard Luck";
                System.out.println("Hard Luck,You have lost the game.");
            }
        }
        else
            System.out.println("You have quitted the game.");
    }	
}