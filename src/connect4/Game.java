package connect4;

import java.util.Scanner;
/**
 * @author Seewin Sun
 */
public class Game 
{
    private int[][] board;
    private int winner;
    public int turn;
    public Scanner input = new Scanner(System.in);
    
    Game()
    {
        board = new int[6][7];
        winner = 0;
        turn = 1;
    }
    
    public void printGame()
    {
        for (int i = 0; i < this.board.length; i ++)
        {
            for (int j = 0; j < this.board[i].length; j++)
            {
                if (this.board[i][j] == 0)
                {
                    System.out.print("| |");
                }
                else if (this.board[i][j] == 1)
                {
                    System.out.print("|R|");
                }
                else if (this.board[i][j] == 2)
                {
                    System.out.print("|Y|");
                }  
            }
            System.out.println();
        } 
    }
    
    public void play()
    {
        if (turn == 1)
        {
            playTurn(1);
        }
        else if (turn == 2)
        {
            playTurn(2);
        }
    }
    
    public void switchPlayer()
    {
        if (turn == 1)
        {
            turn = 2;
        }
        else if (turn == 2)
        {
            turn = 1;
        }
    }
    
    public void playTurn(int player)
    {
        System.out.println("It is player "+this.turn+" turn. Input 0-6 to place your piece into the board");
        int column = this.input.nextInt();
        
        if (column <= 6 && column >= 0)
        {
            checkInput(column);
        }
        else
        {
            System.out.println("Invalid input, please try again");
            playTurn(player);
        }
    }
    
    public void checkInput(int column)
    {
        for (int r = 5; r >= 0; r--)
        {
            if (this.board[r][column] == 0)
            {
                this.board[r][column] = this.turn;
                break;
            }
        }
        printGame();
        checkWinner();
        switchPlayer();
    }
    
    public void checkWinner()
    {
        checkBoardRow();
        //checkBoardColumn();
                
        if (this.winner != 0)
        {
            System.out.println("PLAYER "+this.turn+" HAS WON!");
        }
    }
    
    public void checkBoardRow()
    {
        for (int r = 1; r <= this.board.length; r++)
        {
            int count = 0;
            int countplayer = 0;
            
            for (int c = 1; c <= this.board[r].length; c++)
            {
                if (this.board[r][c] == 0)
                {
                    count = 0;
                    countplayer = 0;
                }
                else if (this.board[r][c] == countplayer)
                {
                    count += 1;
                }
                else if (this.board[r][c] == 1 && countplayer == 0 || this.board[r][c] == 1 && countplayer == 2)
                {
                  count = 1;
                  countplayer = 1;
                }
                else if (this.board[r][c] == 2 && countplayer == 0 || this.board[r][c] == 2 && countplayer == 1) 
                {
                  count = 1;
                  countplayer = 2;
                }
            }
        }
    }
    
    public void checkBoardColumn()
    {
        for (int r = 1; r <= this.board.length; r++)
        {
            int count = 0;
            int countplayer = 0;
            
            for (int c = 0; c <= this.board[r].length; c++)
            {
                if (this.board[r][c] == 0)
                {
                    count = 0;
                    countplayer = 0;
                }
                else if (this.board[r][c] == countplayer)
                {
                    count += 1;
                }
                else if (this.board[r][c] == 1 && countplayer == 0 || this.board[r][c] == 1 && countplayer == 2)
                {
                  count = 1;
                  countplayer = 1;
                }
                else if (this.board[r][c] == 2 && countplayer == 0 || this.board[r][c] == 2 && countplayer == 1) 
                {
                  count = 1;
                  countplayer = 2;
                }
            }
        }
    }
}
