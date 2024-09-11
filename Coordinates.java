public class Coordinates implements Comparable<Coordinates>{
    private Integer x;
    private Integer y;
    private Character colour;

    public Coordinates(Integer x, Integer y, Character colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Character getColour() {
        return colour;
    }

    /* The sorting rule */
    @Override
    public int compareTo(Coordinates other) {
        int result = this.y.compareTo(other.y);
        if (result != 0) return result;

        result = this.x.compareTo(other.x);
        if (result != 0) return result;


        return this.colour.compareTo(other.colour);
    }
}
