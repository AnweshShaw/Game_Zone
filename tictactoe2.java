package Computerproject;
import java.util.Scanner;
public class tictactoe2
{
    static int A1,A2,A3,B1,B2,B3,C1,C2,C3;
    static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        System.out.println("                                               Tic-Tac-Toe Game(Difficult)");
        System.out.println("Instructions:-");System.out.println("For entering the squares you want to play in:-");
        System.out.println("1st Line-A1,A2 and A3 are squares in a row.");
        System.out.println("2nd Line-B1,B2 and B3 are squares in a row.");
        System.out.println("3rd Line-C1,C2 and C3 are squares in a row.");
        System.out.println("Sample Square:-");
        System.out.println("A1|A2|A3");
        System.out.println("----------");
        System.out.println("B1|B2|B3");
        System.out.println("----------");
        System.out.println("C1|C2|C3");
        System.out.println("----------");System.out.println();        
        String message="Welcome to Tic-Tac-Toe. Please enter your first move: ";
        String humanMove="";
        String computerMove="";
        boolean gameIsWon=false;
        for(int i=1;i<=9;i++)
        {
            humanMove=getMove(message);
            updateBoard(humanMove,1);
            displayBoard();
            if(isGameWon())
            {
                System.out.println("Congratulations!!!You have won the game.");
                gameIsWon=true;
                break;
            }
            if(i<9)
            {
                computerMove=getComputerMove();
                System.out.print("\f");
                System.out.println("Computer will play at " + computerMove+".");
                updateBoard(computerMove, 2);
                displayBoard();
                if(isGameWon())
                {
                    System.out.println("Nice Try,but Computer has won the game.");
                    gameIsWon = true;
                    break;
                }
                message="Please enter your next move: ";
                i++;
            }
        }
        if(!gameIsWon)
            System.out.println("Try Again,It is a draw.");
    }

    public static String getMove(String message)
    {
        String play;
        System.out.print(message);
        do
        {
            play = sc.nextLine();
            if(!isValidPlay(play))
            {
                System.out.println("It is not a valid square.Please enter the right move: ");
            }
        }
        while(!isValidPlay(play));
        return play;
    }

    public static boolean isValidPlay(String play)
    {
        if(play.equalsIgnoreCase("A1")&&A1==0)
            return true;
        if(play.equalsIgnoreCase("A2")&&A2==0)
            return true;
        if(play.equalsIgnoreCase("A3")&&A3==0)
            return true;
        if(play.equalsIgnoreCase("B1")&&B1==0)
            return true;
        if(play.equalsIgnoreCase("B2")&&B2==0)
            return true;
        if(play.equalsIgnoreCase("B3")&&B3==0)
            return true;
        if(play.equalsIgnoreCase("C1")&&C1==0)
            return true;
        if(play.equalsIgnoreCase("C2")&&C2==0)
            return true;
        if(play.equalsIgnoreCase("C3")&&C3==0)
            return true;
        return false;
    }

    public static void updateBoard(String play,int player)
    {
        if(play.equalsIgnoreCase("A1"))
            A1=player;
        if(play.equalsIgnoreCase("A2"))
            A2=player;
        if(play.equalsIgnoreCase("A3"))
            A3=player;
        if(play.equalsIgnoreCase("B1"))
            B1=player;
        if(play.equalsIgnoreCase("B2"))
            B2=player;
        if(play.equalsIgnoreCase("B3"))
            B3=player;
        if(play.equalsIgnoreCase("C1"))
            C1=player;
        if(play.equalsIgnoreCase("C2"))
            C2=player;
        if(play.equalsIgnoreCase("C3"))
            C3=player;
    }

    public static void displayBoard()
    {
        String line = "";
        System.out.println();
        line = " " + getXO(A1) + " | " + getXO(A2) + " | " + getXO(A3);
        System.out.println(line);
        System.out.println("-----------");
        line = " " + getXO(B1) + " | " + getXO(B2) + " | " + getXO(B3);
        System.out.println(line);
        System.out.println("-----------");
        line = " " + getXO(C1) + " | " + getXO(C2) + " | " + getXO(C3);
        System.out.println(line);
        System.out.println();
    }

    public static String getXO(int square)
    {
        if(square==1)
            return"X";
        if(square==2)
            return"O";
        return" ";
    }

    public static String getComputerMove()
    {
        if((B2==0)&&(A1==1||A2==1||A3==1||B1==1||B3==1||C1==1||C2==1||C3==1))
            return"B2";
        else if(B2==2&&B1==2&&C1==2&&A1==0)
            return"A1";   
        else if(B2==2&&A3==2&&A1==2&&A2==0)
            return"A2";
        else if(B2==2&&A1==2&&A2==2&&A3==0)
            return"A3";
        else if(B2==2&&A1==2&&C1==2&&B1==0)
            return"B1";
        else if(B2==2&&A3==2&&C3==2&&B3==0)
            return"B3";
        else if(B2==2&&C2==2&&C3==2&&C1==0)
            return"C1";
        else if(B2==2&&C3==2&&C1==2&&C2==0)
            return"C2";
        else if(B2==2&&A3==2&&B3==2&&C3==0)
            return"C3";
        else if(B2==1&&B1==2&&C1==2&&A1==0)
            return"A1";    
        else if(B2==1&&A3==2&&A1==2&&A2==0)
            return"A2";
        else if(B2==1&&A1==2&&A2==2&&A3==0)
            return"A3";
        else if(B2==1&&A1==2&&C1==2&&B1==0)
            return"B1";
        else if(B2==1&&A3==2&&C3==2&&B3==0)
            return"B3";
        else if(B2==1&&C2==2&&C3==2&&C1==0)
            return"C1";
        else if(B2==1&&C3==2&&C1==2&&C2==0)
            return"C2";
        else if(B2==1&&A3==2&&B3==2&&C3==0)
            return"C3";
        else if(B2==2&&B1==1&&A2==1&&A1==0)
            return"A1";	
        else if(B2==2&&B1==1&&C1==1&&A1==0)
            return"A1";
        else if(B2==2&&A2==1&&A3==1&&A1==0)
            return"A1"; 
        else if(B2==2&&A3==1&&B1==1&&A1==0)
            return"A1";     
        else if(B2==2&&A3==1&&A1==1&&A2==0)
            return"A2";
        else if(B2==2&&B3==1&&A2==1&&A3==0)
            return"A3";    
        else if(B2==2&&A1==1&&A2==1&&A3==0)
            return"A3";
        else if(B2==2&&B3==1&&C3==1&&A3==0)
            return"A3";
        else if(B2==2&&A1==1&&B3==1&&A3==0)
            return"A3";    
        else if(B2==2&&A3==1&&C1==1&&B1==0)
            return"B1";
        else if(B2==2&&A1==1&&C1==1&&B1==0)
            return"B1";
        else if(B2==2&&A1==1&&C3==1&&B3==0)
            return"B3"; 
        else if(B2==2&&A3==1&&C3==1&&B3==0)
            return"B3";
        else if(B2==2&&B1==1&&C2==1&&C1==0)
            return"C1";    
        else if(B2==2&&C2==1&&C3==1&&C1==0)
            return"C1";
        else if(B2==2&&A1==1&&B1==1&&C1==0)
            return"C1";
        else if(B2==2&&C3==1&&C1==1&&C2==0)
            return"C2";
        else if(B2==2&&C2==1&&B3==1&&C3==0)
            return"C3";    
        else if(B2==2&&A3==1&&B3==1&&C3==0)
            return"C3";
        else if(B2==2&&C1==1&&C2==1&&C3==0)
            return"C3";        
        else
        {
            if(A1==0&&C3==1)
                return"A1";                
            if(A2==0&&C2==1)
                return"A2";
            if(A3==0&&A1==1&&B2==1)
                return"A3";    
            if(A3==0&&C1==1)
                return"A3";
            if(B1==0&&B3==1)
                return"B1";  
            if(B3==0&&B1==1)
                return"B3";                
            if(C1==0&&A3==1)
                return"C1";
            if(C2==0&&A2==1)
                return"C2";    
            if(C3==0&&B2==1)
                return"C3";
            return"";
        }
    }    

    public static boolean isGameWon()
    {
        if(isRowWon(A1,A2,A3))
            return true;
        if(isRowWon(B1,B2,B3))
            return true;
        if(isRowWon(C1,C2,C3))
            return true;
        if(isRowWon(A1,B1,C1))
            return true;
        if(isRowWon(A2,B2,C2))
            return true;
        if(isRowWon(A3,B3,C3))
            return true;
        if(isRowWon(A1,B2,C3))
            return true;
        if(isRowWon(A3,B2,C1))
            return true;
        return false;
    }

    public static boolean isRowWon(int a,int b,int c)
    {
        return((a==b)&&(a==c)&&(a!=0));
    }
}