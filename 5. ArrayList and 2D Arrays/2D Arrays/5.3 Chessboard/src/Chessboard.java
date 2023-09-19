public class Chessboard
//Clase para elaborar tablero de ajederez
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];
      for (int y = 0; y < chessboard.length; y++)
         for (int x = 0; x < chessboard.length; x++) {
            if ((x + y) % 2 == 0)
               chessboard[y][x] = '\u25A1';
            else
               chessboard[y][x] = '\u25A0';
         }
      for (char[] row: chessboard)
      {
         for (char position: row)
         {
            System.out.print(position);
         }
         System.out.println();
      }
   }
}