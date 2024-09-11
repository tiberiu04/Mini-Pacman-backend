import java.util.ArrayList;

public class PacmanGetsEaten {
    Pacman pacman;
    ArrayList<RedGhost> redghosts;
    ArrayList<BlueGhost> blueghosts;
    Integer eaten;

    /* This method checkes whether pacman intersects with the ghosts or not */
    public Integer getsEaten(Pacman pacman, ArrayList<RedGhost> redghosts,
                             ArrayList<BlueGhost> blueghosts) {
        int ok = 0;
        for (int i = 0; i < redghosts.size(); i++) {
            if (pacman.x == redghosts.get(i).x && pacman.y ==
                    redghosts.get(i).y) {
                this.eaten = 1;
                return eaten;
            }
        }

        if (ok == 0) {
            for (int i = 0; i < blueghosts.size(); i++) {
                if (pacman.x == blueghosts.get(i).x && pacman.y ==
                        blueghosts.get(i).y) {
                    this.eaten = 1;
                    return eaten;
                }
            }
        }

        this.eaten = 0;
        return eaten;
    }
}
