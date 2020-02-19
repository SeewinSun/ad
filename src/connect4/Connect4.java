/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

public class Connect4 
{
    public static void main(String[] args) 
    {
        Game board = new Game();
        
        while (true)
        {
            board.play();
        }
    }
}
