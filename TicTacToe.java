import java.util.Scanner;

public class TicTacToe {


        public TicTacToe(int n) {
            count = new int[6*n][3];
        }

        public int move(int row, int col, int player) {
            int n = count.length / 6;
            for (int x : new int[]{row, n+col, 2*n+row+col, 5*n+row-col})
                if (++count[x][player] == n)
                    return player;
            return 0;
        }

        int[][] count;



    public static void main(String[] args) {

        TicTacToe game = new TicTacToe(3);

        System.out.println(game.move(0,1,1));
        System.out.println(game.move(1,2,2));
        System.out.println(game.move(2,1,1));
        System.out.println(game.move(0,2,2));



    }
    }

