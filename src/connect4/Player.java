package connect4;

/**
 * @author Seewin Sun
 */
public class Player 
{
    public String name;
    private int playerpiece;
    public boolean win;
    
    Player()
    {
        this.name = "Player";
        this.playerpiece = 1;
        this.win = false;
    }
    Player(String name)
    {
        this.name = name;
        this.win = false;
        this.playerpiece = 1;
    }
    Player(String name, int playerpiece)
    {
        this.name = name;
        this.win = false;
        this.playerpiece = playerpiece;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public boolean isWin() 
    {
        return win;
    }

    public void setWin(boolean win) 
    {
        this.win = win;
    }

    public int getPlayerpiece() 
    {
        return playerpiece;
    }

    public void setPlayerpiece(int playerpiece) 
    {
        this.playerpiece = playerpiece;
    }
}
