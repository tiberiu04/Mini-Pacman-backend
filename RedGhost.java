public class RedGhost extends Ghost {

    boolean movingleft;

    public RedGhost(Integer x, Integer y, boolean movingleft) {
        super(x, y);
        this.movingleft = true;
    }

    /* Movement logic */
    public void move(int n) {
        if (y == 1)
            movingleft = false;
        if (y == n)
            movingleft = true;
        if (movingleft == true)
            y--;
        else
            y++;
    }
}
