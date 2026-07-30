import java.util.*;
public class nQueens2 
{
    public static boolean isSafe(char board[][], int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row)
    {
        if(row == board.length)
        {
            count++;
            return;
        }
        for(int j=0;j<board.length;j++)
        {

            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'X';
        }
    }
    public static void printQueensBoard(char board[][])
    {
        System.out.println("_________ Chess Board __________");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int count;
    public static void main (String arg[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.print("Possiable moves : "+count);
        
    }    
}
