import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sudokuChecker {
    public static void main(String[] args) {
       char[][] grid =
       {{'.', '.', '.', '.', '.', '.', '5', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
        {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '5', '2', '.', '.'}};


        System.out.println(sudoku2(grid));


    }
  private static boolean sudoku2(char[][] grid) {

      int k = grid.length;

      Set<String> set = new HashSet<String>();

      for (int i = 0; i < k ; i++) {
          for (int j = 0; j < k; j++) {
              //find if in row
              if (grid[i][j] != '.' && !set.add(grid[i][j] + " " + i))
                  return false;
              //find if in column
              if (grid[i][j] != '.' && !set.add(grid[i][j] + " " + j))
                  return false;
              //find if in 3x3 square
              if (grid[i][j] != '.' && !set.add(grid[i][j] + " " + i/3 + " " + j/3))
                  return false;
          }
      }

      return true;
    }


}
