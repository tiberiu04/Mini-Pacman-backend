import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private Pacman pacman;
    private ArrayList<RedGhost> redGhosts;
    private ArrayList<BlueGhost> blueGhosts;
    private ArrayList<Character> moves;
    private int n, m, r, a;

    public Game(Pacman pacman, ArrayList<RedGhost> redGhosts,
                ArrayList<BlueGhost> blueGhosts, ArrayList<Character> moves,
                int n, int m, int r, int a) {
        this.pacman = pacman;
        this.redGhosts = redGhosts;
        this.blueGhosts = blueGhosts;
        this.moves = moves;
        this.n = n;
        this.m = m;
        this.r = r;
        this.a = a;
    }

    public void play() {
        ArrayList<Coordinates> coords = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            /* Resetting the coordinates after each movement */
            coords.clear();
            pacman.setDirection(moves.get(i));
            pacman.move(n);

            /* The ghosts movement */
            for (int j = 0; j < r; j++) {
                redGhosts.get(j).move(n);
            }

            for (int j = 0; j < a; j++) {
                blueGhosts.get(j).move(n);
            }

            /* Storing the ghosts' coordinates */
            for (int j = 0; j < r; j++) {
                Coordinates coord =
                        new Coordinates(redGhosts.get(j).getX(),
                                redGhosts.get(j).getY(), 'R');
                coords.add(coord);
            }

            for (int j = 0; j < a; j++) {
                Coordinates coord =
                        new Coordinates(blueGhosts.get(j).getX(),
                                blueGhosts.get(j).getY(), 'B');
                coords.add(coord);
            }
            PacmanGetsEaten discover = new PacmanGetsEaten();
            if (discover.getsEaten(pacman, redGhosts, blueGhosts) == 1) {
                break;
            }

        }

        System.out.println(pacman.getX() + " " + pacman.getY());
        Collections.sort(coords);

        for (Coordinates coord : coords) {
            System.out.println(coord.getColour() + " " +
                    coord.getX() + " " + coord.getY());
        }
    }
}

