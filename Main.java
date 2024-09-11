import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* table size */
        int n = scan.nextInt();
        /* pacman's position on the table */
        int x = scan.nextInt();
        int y = scan.nextInt();
        Pacman pacman = new Pacman();
        pacman.setX(x);
        pacman.setY(y);
        /* The number of red ghosts and theit positions */
        int r = scan.nextInt();
        ArrayList <RedGhost> redghosts = new ArrayList<RedGhost>();
        for (int i = 0; i < r; i++) {
            int rx = scan.nextInt();
            int ry = scan.nextInt();
            redghosts.add(new RedGhost(rx, ry, true));
        }

        /* The number of blue ghosts and theit positions */
        int a = scan.nextInt();
        ArrayList <BlueGhost> blueghosts = new ArrayList<BlueGhost>();
        for (int i = 0; i < a; i++) {
            int ax = scan.nextInt();
            int ay = scan.nextInt();
            blueghosts.add(new BlueGhost(ax, ay, true));
        }

        /* The number of Pacman's moves */
        int m = scan.nextInt();
        ArrayList<Character> moves = new ArrayList<Character>();
        for (int i = 0; i < m; i++) {
            char movement = scan.next().charAt(0);
            moves.add(movement);
        }

        Game game = new Game(pacman, redghosts, blueghosts, moves, n, m, r, a);

        game.play();
    }
}