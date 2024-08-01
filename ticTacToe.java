// import java.util.Arrays;

// import java.util.InputMismatchException;
import java.util.Scanner;

public class ticTacToe {

  public static void main(String[] args) throws Exception {
    char[][] arr = new char[3][3];
    // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // System.out.print((arr[i][j]) + " | ");
        arr[i][j] = '-';
      }
      // System.out.println();
    }

    char player = 'X';
    boolean gameOver = false;
    // take the first input from the user
    Scanner input = new Scanner(System.in);
    // while(input != '0')

    while (!gameOver) {
      // first we want to print the board
      printboard(arr);
      // now we want to say that player 1 will play the first move, take the values
      // from the player
      System.out.print("Please enter row number for player:-" + player + " ");

      int row = input.nextInt();
      System.out.print("Please enter col number for player:-" + player + " ");
      int col = input.nextInt();

      // now we will only add the char at that row/col --> if it is empty and game is
      // not over
      if (row < 0 || row >= 3) {
        System.out.println("Enter a valid move, can't go past the board");
      }
      if (col > 2 || col < 0) {
        System.out.println("Enter a valid moce, can't go past the board");
      }
      System.out.println();
      // @TODO row and col is valid
      if (arr[row][col] == '-') {
        arr[row][col] = player;
        // once we placed the character, we can check if the game has won or not
        gameOver = haswon(arr, player);
        if (gameOver) {
          printboard(arr);
          System.out.println("Player" + player + "hasWon:");
        } else {
          // change the player
          if (player == 'X') {
            player = '0';
          } else {
            player = 'X';
          }
        }
      } else {
        System.out.println("In valid move! Try again");
      }
      // we can say invalid move
    }
    printboard(arr);
    input.close();
  }

  static void printboard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print("  " + board[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static boolean haswon(char[][] board, char player) {
    for (int i = 0; i < board.length; i++) {
      // check if the row is full and won by a player
      if (
        board[i][0] == player && board[i][1] == player && board[i][2] == player
      ) {
        return true;
      }
    }
    // check for the column now
    for (int i = 0; i < board.length; i++) {
      if (
        board[0][i] == player && board[1][i] == player && board[2][i] == player
      ) {
        return true;
      }
    }
    // check for diagonal
    if (
      board[0][0] == player && board[1][1] == player && board[2][2] == player
    ) {
      return true;
    }

    if (
      board[0][2] == player && board[1][1] == player && board[2][0] == player
    ) {
      return true;
    }
    return false;
  }
}
