public class Pacman {
    Integer x;
    Integer y;
    char direction;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    /* Movement logic */
    public void move(Integer n) {
        if (direction == 'U' && x > 1)
            x--;
        if (direction == 'D' && x < n)
            x++;
        if (direction == 'L' && y > 1)
            y--;
        if (direction == 'R' && y < n)
            y++;

    }
}
