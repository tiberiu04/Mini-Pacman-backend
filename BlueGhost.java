public class BlueGhost extends Ghost {
    boolean movingdown;
    public BlueGhost(Integer x, Integer y, boolean movingdown) {
        super(x, y);
        this.movingdown = true;
    }

    public void move(int n) {
        if (x == 1)
            movingdown = false;
        if (x == n)
            movingdown = true;
        if (movingdown)
            x--;
        else
            x++;
    }
}