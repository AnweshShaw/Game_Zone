package Computerproject;
import java.io.*;
public class GameZone
{
    static int p=500;
    public static void main()throws IOException
    {
        countdown object= new countdown();
        object.main();
        begin object2=new begin();
        object2.main();
        System.out.println();
        GameZone ob=new GameZone();
        ob.backtomenu();
    }

    public void backtomenu()throws IOException
    {
        for(int i=0;i>=p;i++)
        {
            if(p<=0)
            {
                end obx=new end();
                System.out.println("                                      You are leaving with- $0");
                obx.main();
                System.exit(0);
            }
        }
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);System.out.println();
        System.out.println("Press 'C'or'c' to continue and play the game.");
        String user=in.readLine();
        System.out.print("\f"); 
        if(user.equalsIgnoreCase("C"))
        {
            System.out.println("                                         The Enthralling Game Zone");
            System.out.println();            
            System.out.println("                                         Total Amount with You:- $"+p);
            System.out.println("Option.no.     Game");
            System.out.println("1.-            21 Star Game(Cost=$50:-Win=$500 and Loss=-$100)");
            System.out.println("2.-            Hand Cricket(Cost=$50:-Win=$100 and Loss=-$100)");
            System.out.println("3.-            Tic-Tac-Toe(Cost=$50:-2 Modes,Conditions displayed later.)");
            System.out.println("4.-            Unscramble the words Game(Cost=$50:-Win=$100 and Loss=-$50)");
            System.out.println("5.-            Slot Machine(Cost=$50:-Win=$500,Loss=-$100 and Draw=$100)");
            System.out.println("Which game do you wish to play? Enter the option number of the game.");
            int a=Integer.parseInt(in.readLine());System.out.print("\f");
            switch(a)
            {
                case 1:
                loading x=new loading();
                x.main();
                System.out.print("\f");
                stargame ob=new stargame();
                ob.main();System.out.println();
                System.out.println("Press 'R'or 'r' to play the game again.");                
                System.out.println("Or Press 'Q'or 'q' to quit the game.");
                String user2=in.readLine();System.out.print("\f");
                if(user2.equalsIgnoreCase("R"))
                {
                    GameZone y=new GameZone();p=p-150;
                    y.backtomenu();
                }
                else
                {
                    end obx=new end();p=p-150;
                    System.out.println("                                      You are leaving with- $"+p);
                    obx.main();
                    break;
                }
                break;
                case 2:
                loading2 z=new loading2();
                z.main();
                System.out.print("\f");
                handcricket ob1=new handcricket();
                ob1.main();System.out.println();
                System.out.println("Press 'R'or 'r' to play the game again."); 
                System.out.println("Or Press 'Q'or 'q' to quit the game.");
                String user3=in.readLine();System.out.print("\f");
                if(user3.equalsIgnoreCase("R"))
                {
                    GameZone y2=new GameZone();p=p-50;
                    if(ob1.ax.charAt(0)=='N')
                        p=p-100;
                    else
                        p=p+100;
                    y2.backtomenu();
                }
                else
                {
                    end obx1=new end();p=p-50;
                    if(ob1.ax.charAt(0)=='N')
                        p=p-100;
                    else
                        p=p+100;
                    System.out.println("                                      You are leaving with- $"+p);
                    obx1.main();
                    break;
                }
                break;
                case 3:
                System.out.println("1-Easy mode(Win=$100,Draw=$0 and Loss=-$100)");
                System.out.println("2-Difficult mode(Win=$500,Draw=-$100 and Loss=-$200)");
                System.out.println("Which mode would you like to play?");            
                int b=Integer.parseInt(in.readLine());
                System.out.print("\f");            
                if(b==1)
                {
                    loading4 x3=new loading4();
                    x3.main();
                    System.out.print("\f");
                    tictactoe ob2=new tictactoe();
                    ob2.main();System.out.println();
                    System.out.println("Press 'R'or 'r' to play the game again."); 
                    System.out.println("Or Press 'Q'or 'q' to quit the game.");
                    String user4=in.readLine();System.out.print("\f");
                    if(user4.equalsIgnoreCase("R"))
                    {
                        GameZone y3=new GameZone();p=p+50;
                        y3.backtomenu();
                    }
                    else
                    {
                        end obx4=new end();p=p+50;
                        System.out.println("                                      You are leaving with- $"+p);
                        obx4.main();
                        break;
                    }
                }
                if(b==2)
                {
                    loading4 x3=new loading4();
                    x3.main();
                    System.out.print("\f");
                    tictactoe2 ob2=new tictactoe2();
                    ob2.main();System.out.println();
                    System.out.println("Press 'R'or 'r' to play the game again."); 
                    System.out.println("Or Press 'Q'or 'q' to quit the game.");
                    String user4=in.readLine();System.out.print("\f");
                    if(user4.equalsIgnoreCase("R"))
                    {
                        GameZone y3=new GameZone();p=p-150;
                        y3.backtomenu();
                    }
                    else
                    {
                        end obx4=new end();p=p-150;
                        System.out.println("                                      You are leaving with- $"+p);
                        obx4.main();
                        break;
                    }
                }
                break;
                case 4:
                loading x5=new loading();
                x5.main();
                System.out.print("\f");
                unscramble_words ob3=new unscramble_words();
                ob3.main();System.out.println();
                System.out.println("Press 'R'or 'r' to play the game again."); 
                System.out.println("Or Press 'Q'or 'q' to quit the game.");
                String user5=in.readLine();System.out.print("\f");
                if(user5.equalsIgnoreCase("R"))
                {
                    GameZone y3=new GameZone();p=p-50;
                    if(ob3.ay.charAt(0)=='C')
                        p=p+100;
                    else if(ob3.ay.charAt(0)=='N')
                        p=p+0;
                    else
                        p=p-50;
                    y3.backtomenu();
                }
                else
                {
                    end obx3=new end();p=p-50;
                    if(ob3.ay.charAt(0)=='C')
                        p=p+100;
                    else if(ob3.ay.charAt(0)=='N')
                        p=p+10;
                    else
                        p=p-50;
                    System.out.println("                                      You are leaving with- $"+p);
                    obx3.main();
                    break;
                }
                break;
                case 5:
                loading2 z2=new loading2();
                z2.main();
                System.out.print("\f");
                slotmachine ob4=new slotmachine();
                ob4.main();System.out.println();
                System.out.println("Press 'R'or 'r' to play the game again."); 
                System.out.println("Or Press 'Q'or 'q' to quit the game.");
                String user6=in.readLine();System.out.print("\f");
                if(user6.equalsIgnoreCase("R"))
                {
                    GameZone y4=new GameZone();p=p-50;
                    if(ob4.az.charAt(0)=='C')
                        p=p+500;
                    else if(ob4.az.charAt(0)=='N')
                        p=p+100;
                    else
                        p=p-100;
                    y4.backtomenu();
                }
                else
                {
                    end obx4=new end();p=p-50;
                    if(ob4.az.charAt(0)=='C')
                        p=p+500;
                    else if(ob4.az.charAt(0)=='N')
                        p=p+100;
                    else
                        p=p-100;
                    System.out.println("                                      You are leaving with- $"+p);
                    obx4.main();
                    break;
                }
                break;
                default:
                System.out.println("Wrong Input");
            }
        }

        else
            System.out.println("You have quitted the game.");
    }
}