import javax.swing.*;
import java.util.*;
import java.awt.*;
public class GUI
{
    public static Color col1 = Color.BLUE;
    public static Color col2 = Color.GRAY;
    public static void main (int rows,int columns)
    {
            Board playerBoard = new Board(false);
            Carrier C1 = new Carrier();
            C1.placeShip(playerBoard.board[0][0],0,playerBoard,false);
            JFrame gboard = new JFrame();
               gboard.setSize(800,800);
               gboard.setTitle("Game");
               Container pane = gboard.getContentPane();
               pane.setLayout(new GridLayout(rows,columns));
               for(int i=0;i < rows; i++)
               {
                   for(int j=0;j<columns;j++)
                   {
                       JPanel panel = new JPanel();
                       if(playerBoard.board[rows-1][columns-1].getValue()=="~")
                       {
                           panel.setBackground(col1);
                       }
                       else if(playerBoard.board[rows-1][columns-1].getValue()=="S")
                       {
                           panel.setBackground(col2);
                       }
                       gboard.add(panel);
                   }
               }
               gboard.setVisible(true);
    }
}