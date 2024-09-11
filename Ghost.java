
public abstract class Ghost {
    Integer x;
    Integer y;
    public Ghost(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
    public abstract void move(int n);
}
