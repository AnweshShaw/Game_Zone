package Computerproject;
import java.io.*;
public class handcricket
{
   	static String ax="";
    public static void main()throws IOException
    {
        int c=0;
        System.out.println("                                                 Hand Cricket"); 
        System.out.println("Instructions:-");
        System.out.println("This game is like a real cricket match played between you and the computer.");
        System.out.println("You score runs when you choose any number from 1 to 10.");
        System.out.println("Simultaneously,the computer will also choose any number from 1 to 10.");
        System.out.println("If both the numbers are same,you are out.");
        System.out.println("If both numbers are different your chosen number will be added in your score.");
        System.out.println();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int w,x,y=0,z=0;
        for(w=1;w<=10;w++)
        {
            x=(int)(Math.random()*2);
            if(x==1)
                y++;
        }
        for(w=1;w<=10;w++)
        {
            x=(int)(Math.random()*2);
            if(x==1)
                z++;
        }
        if(y>z)
        {
            System.out.println("You win the toss.");
            System.out.println("What will you choose?");
            System.out.println("1)Batting");
            System.out.println("2)Bowling");
            System.out.println("Enter the option no. you want to choose.");
            int bat=Integer.parseInt(in.readLine());System.out.print("\f");
            if(bat==1)
            {
                System.out.println("You bat first.");
                System.out.println("                                            1st Innings");
                System.out.println("Enter the number you want to chose.");
                int a=Integer.parseInt(in.readLine());System.out.print("\f"); 
                int b=(int)(Math.random()*10)+1;
                System.out.println("The computer choses the number= "+b);
                c=c+a;
                if(a==b)
                {
                    System.out.println("You are out.");
                    System.out.println("Your score is= 0");
                }
                else
                {
                    System.out.println("Your score is= "+c);
                    while(a!=b)
                    {
                        System.out.println("Enter the number you want to chose.");
                        a=Integer.parseInt(in.readLine());System.out.print("\f");
                        b=(int)(Math.random()*10)+1;
                        System.out.println("The computer choses the number= "+b);
                        c=c+a;
                        if(a==b)
                        {
                            System.out.println("You are out.");
                            int g=c-a;
                            System.out.println("Your score is= "+g);
                            int t=g+1;
                            System.out.println("The target is= "+t);
                            break;
                        }
                        System.out.println("Your score is= "+c);
                    }
                }
                int f=0;
                System.out.println("                                            2nd Innings");
                System.out.println("Enter the number you want to chose.");
                int d=Integer.parseInt(in.readLine());
                int e=(int)(Math.random()*10)+1;
                System.out.println("The computer choses the number= "+e);
                f=f+e;
                if(d==e)
                {
                    System.out.println("Computer is out.");ax="Congratulations";
                    System.out.println("Computer's score is = 0");System.out.println();
                    System.out.println("                        Congratulations!!!You have won the game.");
                }
                else
                {
                    System.out.println("Computer's score is= "+f);
                    while(d!=e)
                    {
                        System.out.println("Enter the number you want to chose.");
                        d=Integer.parseInt(in.readLine());System.out.print("\f"); 
                        e=(int)(Math.random()*10)+1;
                        System.out.println("The computer choses the number= "+e);
                        f=f+e;
                        if(d==e)
                        {
                            System.out.println("Computer is out.");
                            int h=f-e;ax="Congratulations";
                            System.out.println("Computer's score is= "+h);System.out.println();
                            System.out.println("                Congratulations!!!You have won the game.");                    
                            break;
                        }
                        System.out.println("Computer's score is= "+f); 
                        if(c<=f)
                        {
                            System.out.println();ax="Nice try,but Computer has won the game.";
                            System.out.println("                  Nice try,but Computer has won the game.");
                            break;
                        }
                    }
                }
            }
            if(bat==2)
            {
                System.out.println("Computer bats first.");
                System.out.println("                                 1st Innings");
                System.out.println("Enter the number you want to chose.");
                int a=Integer.parseInt(in.readLine());System.out.print("\f"); 
                int b=(int)(Math.random()*10)+1;
                System.out.println("The computer choses the number= "+b);
                c=c+b;
                if(a==b)
                {
                    System.out.println("Computer is out.");
                    System.out.println("Computer's score is= 0");
                }
                else
                {
                    System.out.println("Computer's score is= "+c);
                    while(a!=b)
                    {
                        System.out.println("Enter the number you want to chose.");
                        a=Integer.parseInt(in.readLine());System.out.print("\f");
                        b=(int)(Math.random()*10)+1;
                        System.out.println("The computer choses the number= "+b);
                        c=c+b;
                        if(a==b)
                        {
                            System.out.println("Computer is out.");
                            int g=c-a;
                            System.out.println("Computer's score is= "+g);
                            int t=g+1;
                            System.out.println("The target is= "+t);
                            break;
                        }
                        System.out.println("Computer's score is= "+c);
                    }
                }
                int f=0;
                System.out.println("                                      2nd Innings");
                System.out.println("Enter the number you want to chose.");
                int d=Integer.parseInt(in.readLine());System.out.print("\f");
                int e=(int)(Math.random()*10)+1;
                System.out.println("The computer choses the number= "+e);
                f=f+d;
                if(d==e)
                {
                    System.out.println("You are out.");ax="Nice try,but Computer has won the game.";
                    System.out.println("Your score is = 0");System.out.println();
                    System.out.println("                        Nice Try,but Computer has won the game.");
                }
                else
                {
                    System.out.println("Your score is= "+f);
                    while(d!=e)
                    {
                        System.out.println("Enter the number you want to chose.");
                        d=Integer.parseInt(in.readLine());System.out.print("\f");
                        e=(int)(Math.random()*10)+1;
                        System.out.println("The computer choses the number= "+e);
                        f=f+d;
                        if(d==e)
                        {
                            System.out.println("You are out.");
                            int h=f-e;ax="Nice try,but Computer has won the game.";
                            System.out.println("Your score is= "+h);System.out.println();
                            System.out.println("                  Nice try,but Computer has won the game.");                    
                            break;
                        }
                        System.out.println("Your score is= "+f); 
                        if(c<=f)
                        {
                            System.out.println();ax="Congratulations";
                            System.out.println("               Congratulations!!!You have won the game.");
                            break;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Computer wins the toss.");
            System.out.println("Computer elects to bowl first.");
            System.out.println("You bat first.");
            System.out.println("                                    1st Innings");
            System.out.println("Enter the number you want to chose.");
            int a1=Integer.parseInt(in.readLine());System.out.print("\f");
            int b1=(int)(Math.random()*10)+1;
            System.out.println("The computer choses the number= "+b1);
            c=c+a1;
            if(a1==b1)
            {
                System.out.println("You are out.");
                System.out.println("Your score is= 0");
            }
            else
            {
                System.out.println("Your score is= "+c);
                while(a1!=b1)
                {
                    System.out.println("Enter the number you want to chose.");
                    a1=Integer.parseInt(in.readLine());System.out.print("\f");
                    b1=(int)(Math.random()*10)+1;
                    System.out.println("The computer choses the number= "+b1);
                    c=c+a1;
                    if(a1==b1)
                    {
                        System.out.println("You are out.");
                        int g=c-a1;
                        System.out.println("Your score is= "+g);
                        int t=g+1;
                        System.out.println("The target is= "+t);
                        break;
                    }
                    System.out.println("Your score is= "+c);
                }
            }
            int f1=0;
            System.out.println("                                     2nd Innings");
            System.out.println("Enter the number you want to chose.");
            int d1=Integer.parseInt(in.readLine());System.out.print("\f");
            int e1=(int)(Math.random()*10)+1;
            System.out.println("The computer choses the number= "+e1);
            f1=f1+e1;
            if(d1==e1)
            {
                System.out.println("Computer is out.");ax="Congratulations";
                System.out.println("Computer's score is = 0");System.out.println();
                System.out.println("                          Congratulations!!!You have won the game.");
            }
            else
            {
                System.out.println("Computer's score is= "+f1);
                while(d1!=e1)
                {
                    System.out.println("Enter the number you want to chose.");
                    d1=Integer.parseInt(in.readLine());System.out.print("\f");
                    e1=(int)(Math.random()*10)+1;
                    System.out.println("The computer choses the number= "+e1);
                    f1=f1+e1;
                    if(d1==e1)
                    {
                        System.out.println("Computer is out.");
                        int h=f1-e1;ax="Congratulations";
                        System.out.println("Computer's score is= "+h);System.out.println();
                        System.out.println("                        Congratulations!!!You have won the game.");                    
                        break;
                    }
                    System.out.println("Computer's score is= "+f1); 
                    if(c<=f1)
                    {
                        System.out.println();ax="Nice try,but Computer has won the game.";
                        System.out.println("                  Nice try,but Computer has won the game.");
                        break;
                    }
                }
            }
        }
    }
}
