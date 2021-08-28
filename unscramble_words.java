package Computerproject;
import java.io.*;
public class unscramble_words
{
    static String ay="";
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String ans="";
        String ans2="";
        System.out.println("                                                Unscramble the words Game");
        System.out.println("Instructions:-");        
        System.out.println("In this game,you will have to unscramble 10 words.");
        System.out.println("The words given will be names of countries around the globe.");
        System.out.println("Let's begin this game and try to guess the name of the countries.");
        System.out.println();
        System.out.println("Press 'E'or'e' to start the game and enjoy guessing the countries.");
        String user2=in.readLine();System.out.print("\f");
        int flag=0,x=0;
        int y=(int)(Math.random()*3)+1;
        String na[]={"italy","greece","poland","denmark","mozambique","netherlands","romania","bulgaria","lithuania","liechtenstein"};
        String ha[]={"india","australia","kyrgyzstan","ecuador","philippines","venezuela","guatemala","argentina","seychelles","azerbaijan"};
        String xa[]={"china","brazil","namabia","somalia","jamaica","botswana","madagascar","nicaragua","honduras","luxembourg"};
        if(user2.equalsIgnoreCase("E"))
        { 
            for(int i=0;i<10;i++)
            {
                if(y==1)
                {
                    int len=na[i].length();
                    int a=len/2;
                    for(int j=0;j<a;j++)
                    {
                        char ch=na[i].charAt(j);
                        ans=ch+ans;
                    }
                    for(int k=a;k<len;k++)
                    {
                        char ch2=na[i].charAt(k);
                        ans2=ch2+ans2;
                    }  
                    String fa=ans+ans2;
                    int b=i+1;
                    System.out.print(b);
                    System.out.print("- ");
                    System.out.println(fa);
                    ans="";
                    ans2="";
                    System.out.print("Guess the name of the country. ");
                    System.out.println("Press 's' to skip this word if you don't know.");
                    String user=in.readLine();
                    user=user.toLowerCase();
                    if(user.compareTo(na[i])==0)
                        flag++;                    
                    System.out.print("\f");
                }
                if(y==2)
                {
                    int len=ha[i].length();
                    int a=len/2;
                    for(int j=0;j<a;j++)
                    {
                        char ch=ha[i].charAt(j);
                        ans=ch+ans;
                    }
                    for(int k=a;k<len;k++)
                    {
                        char ch2=ha[i].charAt(k);
                        ans2=ch2+ans2;
                    }  
                    String fa=ans+ans2;
                    int b=i+1;
                    System.out.print(b);
                    System.out.print("- ");
                    System.out.println(fa);
                    ans="";
                    ans2="";
                    System.out.print("Guess the name of the country. ");
                    System.out.println("Press 's' to skip this word if you don't know.");
                    String user=in.readLine();
                    user=user.toLowerCase();
                    if(user.compareTo(ha[i])==0)
                        flag++;                    
                    System.out.print("\f");
                }
                if(y==3)
                {
                    int len=xa[i].length();
                    int a=len/2;
                    for(int j=0;j<a;j++)
                    {
                        char ch=xa[i].charAt(j);
                        ans=ch+ans;
                    }
                    for(int k=a;k<len;k++)
                    {
                        char ch2=xa[i].charAt(k);
                        ans2=ch2+ans2;
                    }  
                    String fa=ans+ans2;
                    int b=i+1;
                    System.out.print(b);
                    System.out.print("- ");
                    System.out.println(fa);
                    ans="";
                    ans2="";
                    System.out.print("Guess the name of the country. ");
                    System.out.println("Press 's' to skip this word if you don't know.");
                    String user=in.readLine();
                    user=user.toLowerCase();
                    if(user.compareTo(xa[i])==0)
                        flag++;                    
                    System.out.print("\f");
                }
            }
            System.out.println("Your total score is = "+flag);
            if(flag>=8)
            {
                ay="Congratulations";
                System.out.println("Congratulations!!! You played well in this game.");
            }
            if(flag>=4&&flag<=7)
            {
                ay="Nice try";
                System.out.println("Nice try,You can score even better.");
            }
            if(flag<=3)
            {
                ay="Hard Luck";
                System.out.println("Hard Luck,Your Performance was bad.Try Again.");
            }
        }
        else
            System.out.println("You have quitted the game.");
    }
}